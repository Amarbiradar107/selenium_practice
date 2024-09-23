package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Saticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//		WebElement staticdropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
//		Select s = new Select(staticdropdown);
//		s.selectByIndex(1);
//		System.out.println(s.getFirstSelectedOption().getText());
//		s.selectByVisibleText("USD");
//		System.out.println(s.getFirstSelectedOption().getText());
//		s.selectByValue("AED");
//		System.out.println(s.getFirstSelectedOption().getText());
		
//		WebElement update_dropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
//		Select s = new Select(update_dropdown);
		
		WebElement passangerList = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		passangerList.click();
		System.out.println(passangerList.getText());
		
		for(int i=1;i<5;i++) {
			WebElement adult_Selection = driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
			adult_Selection.click();
		}
		System.out.println(passangerList.getText());
		
		
		
		
		
		
		

	}

}
