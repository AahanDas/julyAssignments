package week4.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {

		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://buythevalue.in/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		dr.findElement(By.xpath("(//div[@class='owl-stage']/div[@class='owl-item active'])[1]/div[@class='grid-item product-item']")).click();
		dr.findElement(By.id("wk_zipcode")).sendKeys("603103");
		dr.findElement(By.xpath("//div[@class='wk_zipfinder_btn']/input[@type='button' ]")).click();
		dr.findElement(By.xpath("//button[@value='Add to Cart']")).click();
		dr.findElement(By.xpath("//a[text()='View Cart']")).click();
		dr.findElement(By.id("checkout")).click();
		System.out.println(dr.switchTo().alert().getText());
		dr.switchTo().alert().accept();
		dr.close();
		
	}

}
