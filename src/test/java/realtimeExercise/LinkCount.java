package realtimeExercise;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		try {

			driver.get("https://rahulshettyacademy.com/AutomationPractice/");

			int LinkCount = driver.findElements(By.tagName("A")).size();
			System.out.println(LinkCount);

			WebElement footerElement = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
			int CountLinktext = footerElement.findElements(By.tagName("a")).size();
			System.out.println(CountLinktext);

			WebElement FotterSection = footerElement.findElement(By.xpath("//tbody/tr/td[1]/ul"));
			int FotterLink = FotterSection.findElements(By.tagName("a")).size();
			System.out.println(FotterLink);

			for (int i = 1; i < FotterSection.findElements(By.tagName("a")).size(); i++) {

				String Controlclick = Keys.chord(Keys.CONTROL, Keys.ENTER);
				FotterSection.findElements(By.tagName("a")).get(i).sendKeys(Controlclick);
				Thread.sleep(3000);

			}

			Set<String> windos = driver.getWindowHandles();
			Iterator<String> it = windos.iterator();

			while (it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}

		}

		catch (Exception e) {
			System.out.println(e);
		} finally {
			driver.quit();
		}

	}

}
