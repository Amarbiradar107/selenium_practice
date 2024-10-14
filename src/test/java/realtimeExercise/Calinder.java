package realtimeExercise;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Calinder {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

//		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//
//		driver.findElement(By.xpath("//a[normalize-space()='Top Deals']")).click();
//		
//		Set<String> Windows = driver.getWindowHandles();
//
//		Iterator<String> It = Windows.iterator();
//
//		String ParentTab = It.next();
//		String ChildTab = It.next();
//		
//		driver.switchTo().window(ChildTab);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		String Month = "6";
		String Year = "2024";
		String Date = "14";
		driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();
		driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).click();
		driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).click();
		driver.findElement(By.xpath("//button[text()='"+Year+"']")).click();
//		int i = 0;
//		if(i>12) {
//			System.out.println(driver.findElements(By.className(".react-calendar__year-view__months__month")).get(i));
//		}
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(Month)-1).click();
//		driver.findElements(By.className(".react-calendar__year-view__months__month")).get(5);
		driver.findElement(By.xpath("//abbr[text()='"+Date+"']")).click();
		
	}

}
