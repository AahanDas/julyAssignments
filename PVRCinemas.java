package wwek3.weekdaysAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * 01) Launch the Url 
 
		 * 02) Click on Movie Library under hamburger button 
		 * 03) Select the City -->chennai 
		 * 04) Select the Genre-->Animation 
		 * 05) Select the Language-->english 
		 * 06) Click on Apply 
		 * 07) Click on first resulting animation movie 
		 * 08) Click proceed to book 
		 * 09) Enter the all fields cinema , Name, date, Prefered show time, no of seats, food and
		 * beverages,Email and Mobile 
		 * 10) Click on copy to self 
		 * 11) Click on Send Request 
		 * 12) Click cancel 
		 * 13) Close the OTP dialog 
		 * 14) Verify the ttile of the page
		 */
		
		WebDriver dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.manage().window().maximize();
		dr.get("https://www.pvrcinemas.com/");
		dr.findElement(By.xpath("//div[@class='nav-icon']")).click();
		
		dr.findElement(By.xpath("//li[@class='sidebar-list-item']/a[text()='Movie Library']")).click();
		
		//dr.findElement(By.xpath("//select[@name='city']")).click();
		WebElement city = dr.findElement(By.xpath("//select[@name='city']"));
		Select selCity = new Select(city);
		selCity.selectByVisibleText("Chennai");
		
		//dr.findElement(By.xpath("//select[@name='genre']")).click();
		WebElement genre = dr.findElement(By.xpath("//select[@name='genre']"));
		Select selGenre = new Select(genre);
		selGenre.selectByVisibleText("ANIMATION");
		
		//dr.findElement(By.xpath("//select[@name='lang']")).click();
		WebElement language = dr.findElement(By.xpath("//select[@name='lang']"));
		Select selLanguage = new Select(language);
		selLanguage.selectByVisibleText("ENGLISH");
		
		
		dr.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(10000);
		
		dr.findElement(By.xpath("(//div[@class='movie-list']/div[@class='movie-wrapper ng-star-inserted'])[1]")).click();
		dr.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		
		WebElement cinemaName = dr.findElement(By.xpath("//select[@id='cinemaName']"));
		Select selCinemaName = new Select(cinemaName);
		selCinemaName.selectByVisibleText("PVR Heritage RSL ECR Chennai");
		
		
		dr.findElement(By.xpath("//input[@name='name']")).sendKeys("DiptiRanjan");
		
		
		WebElement preferredShowTime = dr.findElement(By.xpath("//select[@name='timings']"));
		Select selShowTime = new Select(preferredShowTime);
		selShowTime.selectByVisibleText("09:00 AM - 12:00 PM");
		
		
		//Date from calendar
		dr.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		dr.findElement(By.xpath("(//div[@class='main-calendar-days']/span[@class='day-unit ng-star-inserted'])[1]")).click();
		
		dr.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("4");
		
		
		
		
		WebElement fAndBRequirement = dr.findElement(By.xpath("//select[@name='food']"));
		Select selFandB = new Select(fAndBRequirement);
		selFandB.selectByVisibleText("Yes");
		
		dr.findElement(By.xpath("//input[@name='email']")).sendKeys("randomemail@gmail.com");
		
		dr.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9845768888");
		dr.findElement(By.xpath("//input[@name='comment']")).sendKeys("other details entered");
		
		
		dr.findElement(By.xpath("//span[text()='Copy To Self']")).click();
		dr.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		
		dr.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		dr.findElement(By.xpath("//button[@class='swal2-close']")).click();
		
		
		String titleOfPAge = dr.getTitle();
		
		if(titleOfPAge.equals("Movie Library")) {
			
			System.out.println("Title is matching: "+titleOfPAge);
		}
		else {
			System.out.println("Title is NOT  matching: "+titleOfPAge);
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
