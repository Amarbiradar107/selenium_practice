package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement passangerList = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		passangerList.click();
		System.out.println(passangerList.getText());
		
		for(int i=1;i<5;i++) {

			WebElement adult_Selection = driver.findElement(By.id("hrefIncAdt"));
			adult_Selection.click();
		}
		System.out.println(passangerList.getText());
		
		WebElement depature_place = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		depature_place.click();
//		System.out.println(depature_place.getText());
		
		WebElement depature_place_city = driver.findElement(By.cssSelector("li a[text='Hyderabad (HYD)']"));
		depature_place_city.click();
		System.out.println(depature_place_city.getText());
		
		
		WebElement arrival_place =  driver.findElement(By.xpath("(//a[@value='BLR'])[2]"));
		arrival_place.click();
		System.out.println(arrival_place.getText());
		
		
				
		
		
		
	}
	
//	if()

}
