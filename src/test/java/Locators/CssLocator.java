package Locators;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CssLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ecommerce-playground.lambdatest.io/index.php");
		
        Actions a = new Actions(driver);
        
        WebElement MyAccount = driver.findElement(By.xpath("(//a[@role='button'])[12]"));
        
        a.moveToElement(MyAccount).build().perform();

        driver.findElement(By.cssSelector("a[href='https://ecommerce-playground.lambdatest.io/index.php?route=account/register']")).click();
        
        
        

	}

}
