package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Assignment 1:Create Lead
1. Launch URL "http://leaftaps.com/opentaps/control/login"
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
15. Get the Title of Resulting Page. refer the video  using driver.getTitle()*/

public class CreateLead {

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
		dr.findElement(By.id("createLeadForm_firstName")).sendKeys("DRD");
		dr.findElement(By.id("createLeadForm_lastName")).sendKeys("DAS");
		dr.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kanha");
		dr.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		dr.findElement(By.id("createLeadForm_description")).sendKeys("Description for Creating lead.");
		dr.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mrdipti@gmail.com");
		dr.findElement(By.className("smallSubmit")).click();
		System.out.println("Page Title: "+dr.getTitle());
		dr.close();

	}

}
