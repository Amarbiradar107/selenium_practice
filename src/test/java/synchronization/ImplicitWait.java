package synchronization;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ImplicitWait {

	public static void endtoendtest(WebDriver driver, String[] listOfElements) {

		List<WebElement> products = driver.findElements(By.xpath("//div[@class='product']"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {

//			System.out.println("Inside For loop");

			String[] ProductName = products.get(i).getText().split("-");
			String FormattedProductName = ProductName[0].trim();

			List ItemsNeeds = Arrays.asList(listOfElements);

			if (ItemsNeeds.contains(FormattedProductName)) {

				j++;
//				System.out.println("Inside If loop ");
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

				if (j == 3) {
					break;
				}

			}

		}
		String Text = "rahulshettyacademy";
		driver.findElement(By.xpath(" //img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(.,'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys(Text);
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

		String ActualText = driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		String ExpectedText = "Code applied ..!";
		Assert.assertEquals(ActualText, ExpectedText);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] listOfElements = { "Brocolli", "Cauliflower", "Cucumber" };

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		endtoendtest(driver, listOfElements);

	}

}
