package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);

		try {
			driver.get("https://jqueryui.com/droppable/");
			int Framecount = driver.findElements(By.tagName("iframe")).size();
			System.out.println(Framecount);

			WebElement FrameLocater = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

			driver.switchTo().frame(FrameLocater);

			WebElement TragetBox = driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement SourceBox = driver.findElement(By.xpath("//div[@id='droppable']"));

			a.dragAndDrop(TragetBox, SourceBox);

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			driver.quit();
		}

	}

}
