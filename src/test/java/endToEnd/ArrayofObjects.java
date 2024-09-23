package endToEnd;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayofObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] listOfElements = { "Brocolli", "Cauliflower", "Cucumber" };

		List<WebElement> products = driver.findElements(By.xpath("//div[@class='product']"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {

			System.out.println("Inside For loop");

			String[] ProductName = products.get(i).getText().split("-");
			String FormattedProductName = ProductName[0].trim();

			List ItemsNeeds = Arrays.asList(listOfElements);

			

			if (ItemsNeeds.contains(FormattedProductName)) {

				j++;
				System.out.println("Inside If loop ");
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

				if (j == 3) {
					break;
				}

			}

		}

	}

}
