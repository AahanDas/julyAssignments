package wwek3.weekdaysAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) {
		/*
		 * 01) Launch Firefox / Chrome and add implicitlyWait
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		 * 02) Load		 * https://www.abhibus.com/ 
		 * 03) Click on Bus 
		 * 04) Type "Chennai" in the FROM text
		 * box 
		 * 05) Click the first option from the pop up box 
		 * 06) Type "Bangalore" in
		 * the TO text box 
		 * 07) Click the first option from the pop up box 
		 * 08) Select
		 * tomorrow's date in the Date field
		 *  09) Click Search Buses 09) Print the name
		 * of the first resulting bus (use .getText()) 
		 * 10) Choose SLEEPER in the left
		 * menu from Bus Type 
		 * 11) Print the first resulting bus seat count(Example:35
		 * Seats Available)(use .getText()) 
		 * 12) Click SelectSeat 13) Choose any one
		 * Available seat 
		 * 14) Print Seats Selected ,Total Fare 
		 * 15) Select Boarding Point
		 * and Dropping Point 
		 * 16) Get the Title of the page(use .getTitle()) 
		 * 17)
		 *  * Close the browser
		 */
		
		WebDriver dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.manage().window().maximize();
		dr.get("https://www.abhibus.com/");
		dr.findElement(By.id("pills-home-tab"));
		dr.findElement(By.id("source")).sendKeys("Chennai");
		
		dr.findElement(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content' and @tabindex='0']/li")).click();
		dr.findElement(By.id("destination")).sendKeys("Bangalore");
		dr.findElement(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li[text()='Bangalore']")).click();
		//date picker add here
		dr.findElement(By.xpath("//input[@id='datepicker1']")).click();
		
		dr.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();
		
		dr.findElement(By.xpath("//a[text()='Search']")).click();
		
		String firstOption = dr.findElement(By.xpath("(//div[@class='search-column1']/h2[@class='TravelAgntNm ng-binding'])[1]")).getText();
		System.out.println(firstOption);
		dr.findElement(By.xpath("//input[@title='SLEEPER']")).click();
		String noOfSeatsAvailable = dr.findElement(By.xpath("(//div[@class='search-column2-col1']/p[@class='noseats AvailSts ng-binding'])[1]")).getText();
		String[] seats = noOfSeatsAvailable.split(" ");
		System.out.println(seats[0]);
		dr.findElement(By.xpath("(//a[@class='btn-seatselect book1']/span[text()='Select Seat'])[1]")).click();
		dr.findElement(By.xpath("(//li[@class='fare_filter_999 sleeper available']/a[@class='tooltip tooltipstered'])[1]")).click();
		String seatSelected = dr.findElement(By.xpath("//span[@id='seatnos']")).getText();
		System.out.println("seatSelected: "+seatSelected);
		String price = dr.findElement(By.xpath("//span[@id='ticketfare']")).getText();
		System.out.println("price: " +price);
		
		WebElement boardingPoint = dr.findElement(By.id("boardingpoint_id"));
		Select sel = new Select(boardingPoint);
		sel.selectByVisibleText("Sirsuri-22:00");
		
		WebElement droppingpoint = dr.findElement(By.id("droppingpoint_id"));
		Select selDrop = new Select(droppingpoint);
		selDrop.selectByVisibleText("Silk Board-05:25");
		
		System.out.println(dr.getTitle());
		dr.close();
	}

}
