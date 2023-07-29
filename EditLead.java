package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*1. Launch URL "http://leaftaps.com/opentaps/control/login"
2. Enter UserName and Password Using Id Locator
3. Click on Login Button using Class Locator
4. Click on CRM/SFA Link
5. Click on Leads Button
6. Click on Create Lead 
7. Enter CompanyName Field Using id Locator
8. Enter FirstName Field Using id Locator
9. Enter LastName Field Using id Locator
10. Enter FirstName(Local) Field Using id Locator
11. Enter Department Field Using any Locator of Your Choice
12. Enter Description Field Using any Locator of your choice 
13. Enter your email in the E-mail address Field using the locator of your choice
14. Click on Create Button
15. Click on edit button
16. Clear the Description Field using .clear()
17. Fill ImportantNote Field with Any text
18. Click on update button 
19. Get the Title of Resulting Page. refer the video  using driver.getTitle()*/



public class EditLead {

	public static void main(String[] args) {
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://leaftaps.com/opentaps/control/login");
		WebElement usrName = dr.findElement(By.id("username"));
		usrName.sendKeys("demoSalesManager");
		dr.findElement(By.id("password")).sendKeys("crmsfa");
		dr.findElement(By.className("decorativeSubmit")).click();
		
		dr.findElement(By.linkText("CRM/SFA")).click();
		dr.findElement(By.linkText("Leads")).click();
		dr.findElement(By.linkText("Create Lead")).click();
		
		WebElement CompanyName = dr.findElement(By.id("createLeadForm_companyName"));
		CompanyName.sendKeys("ITL");
		dr.findElement(By.id("createLeadForm_firstName")).sendKeys("MRD");
		dr.findElement(By.id("createLeadForm_lastName")).sendKeys("DAS");
		dr.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ABCD88");
		dr.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		dr.findElement(By.id("createLeadForm_description")).sendKeys("Description for Creating lead.");
		dr.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcd88@gmail.com");
		dr.findElement(By.className("smallSubmit")).click();
		System.out.println("Page Title after Create Led: "+dr.getTitle());
		dr.findElement(By.linkText("Edit")).click();
		dr.findElement(By.id("updateLeadForm_description")).clear();
		dr.findElement(By.name("importantNote")).sendKeys("importantNote Description");
		dr.findElement(By.name("submitButton")).click();
		System.out.println("Page Title after Edit Lead: "+dr.getTitle());
		
		
		
		
	}

}
