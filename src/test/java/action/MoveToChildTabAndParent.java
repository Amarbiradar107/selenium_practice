package action;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToChildTabAndParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);  
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		WebElement ChildTabLink = driver.findElement(By.xpath("//a[@class='cart-header-navlink blinkingText']"));
		
		
		ChildTabLink.click();
		Set <String> Windows = driver.getWindowHandles();
		
		Iterator<String> It = Windows.iterator();
		
		String ParentTab = It.next();
		String ChildTab = It.next();
		
		driver.switchTo().window(ChildTab);
		
		WebElement Text = driver.findElement(By.xpath("//strong[contains(text(),'Learn Earn & Shine')]"));
		System.out.println(Text.getText());
		
		
		
		
		
		

	}

}
