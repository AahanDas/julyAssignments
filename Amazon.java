package wwek3.weekdaysAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		
		/*
		 * 01) Launch Chrome 
		 * 02) Load https://www.amazon.in/ add implicitlyWait
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 *  03) Type		 * "Bags" in the Search box 
		 * 04) Choose the item in the result (bags for boys)
		 * 05) Print the total number of results (like 50000) 1-48 of over 50,000
		 * results for "bags for boys" 
		 * 06) Select the first 2 brands in the left menu
		 * (like American Tourister, Generic) 
		 * 07) Choose New Arrivals (Sort) 
		 * 08) Print the first resulting bag info (name, discounted price) 
		 * 09) Get the page title
		 * and close the browser(driver.close())
		 */
		
		WebDriver dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.manage().window().maximize();
		dr.get("https://www.amazon.in/");
		
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		dr.findElement(By.xpath("//span[text()=' for boys']")).click();
		//Print the total number of results 
		String resultGridDetails = dr.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		String[] str2 = resultGridDetails.split(" ");
		System.out.println(str2[0]);
		System.out.println(str2[3]);
		
		//Select the first 2 brands in the left menu
		dr.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[1]")).click();
		dr.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]")).click();
		
		
		dr.findElement(By.xpath("//span[text()='Sort by:']")).click();
		dr.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String firstResultBagInfo = dr.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).getText();
		System.out.println(firstResultBagInfo);
		String discountedPrice = dr.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println(discountedPrice);
		System.out.println(dr.getTitle());
		dr.close();
		
		
		
		
		
		
	}

}
