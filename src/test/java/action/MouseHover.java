package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);  
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement HovrElement = driver.findElement(By.xpath("//button[@id='mousehover']"));
		a.moveToElement(HovrElement).build().perform();
		
		
	}

}
