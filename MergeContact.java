package week4.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {

		
		
		  
		 // 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://leaftaps.com/opentaps/control/login");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		 //  2. Enter UserName and Password Using Id Locator
		dr.findElement(By.id("username")).sendKeys("demoSalesManager");
		dr.findElement(By.id("password")).sendKeys("crmsfa");
		
		  
		 //  3. Click on Login Button using Class Locator
		
		dr.findElement(By.xpath("//input[@class='decorativeSubmit' and @type='submit']")).click();
		  
		 //  4. Click on CRM/SFA Link
		dr.findElement(By.linkText("CRM/SFA")).click();
		  
		 //  5. Click on contacts Button
		dr.findElement(By.linkText("Contacts")).click();
		  	
		 //  6. Click on Merge Contacts using Xpath Locator
		dr.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		  
		 //  7. Click on Widget of From Contact
		 System.out.println(dr.getTitle());
		dr.findElement(By.xpath("(//table[@id='widget_ComboBox_partyIdFrom']/following::a)[1]")).click();
		////#### WindowHandles#######
		
		  Set<String> windowHandles = dr.getWindowHandles(); List<String> winHandle =
		  new ArrayList<String>(windowHandles); dr.switchTo().window(winHandle.get(1));
		  System.out.println(dr.getTitle());
		 
		 //  8. Click on First Resulting Contact
		  System.out.println(dr.findElement(By.xpath("(//table[@class='x-grid3-row-table']//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div)[1]")).getText());
		
		dr.findElement(By.xpath("(//table[@class='x-grid3-row-table']//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a)[1]")).click();
		dr.switchTo().window(winHandle.get(0));
		  
		 //  9. Click on Widget of To Contact
		dr.findElement(By.xpath("(//table[@name='ComboBox_partyIdTo']/following::a)[1]")).click();
		Set<String> windowHandles1 = dr.getWindowHandles();
		List<String> winHandle1 = new ArrayList<String>(windowHandles1);
		dr.switchTo().window(winHandle1.get(1));
		  
		  
		 //  10. Click on Second Resulting Contact
		System.out.println(dr.findElement(By.xpath("(//table[@class='x-grid3-row-table']/following::div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).getText());
		dr.findElement(By.xpath("(//table[@class='x-grid3-row-table']/following::div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		dr.switchTo().window(winHandle1.get(0));
		  
		 // 11. Click on Merge button using Xpath Locator
		dr.findElement(By.xpath("(//table[@name='ComboBox_partyIdTo']/following::a)[2]")).click();
		  
		 // 12. Accept the Alert
		dr.switchTo().alert().accept();
		  
		 //  13. Verify the title of the page
		
		String pageTitle = dr.getTitle();
		System.out.println(pageTitle);
		
		//Merge Contacts | opentaps CRM
		 
	}

}
