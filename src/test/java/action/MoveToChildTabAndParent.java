package action;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToChildTabAndParent {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		// TODO Auto-generated method stub
		try {

			driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
			WebElement ChildTabLink = driver.findElement(By.xpath("//a[@class='blinkingText']"));

			ChildTabLink.click();
			Set<String> Windows = driver.getWindowHandles();

			Iterator<String> It = Windows.iterator();

			String ParentTab = It.next();
			String ChildTab = It.next();

			driver.switchTo().window(ChildTab);

			WebElement Text = driver.findElement(By.xpath("//p[@class='im-para red']"));
			String Text1 = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim()
					.split(" ")[0];

			System.out.println(Text1);

			driver.switchTo().window(ParentTab);

			WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
			Username.sendKeys(Text1);

		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		} finally {
			driver.quit();
		}

	}

}
