package misscellaneous_topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

public class Block_pop_up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

//		ChromeOptions Options = new ChromeOptions();
//		Options.setExperimentalOption(null, Options);
		WebDriver driver = new ChromeDriver();
		
		//Maximaize the window
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.airindia.com/");
		

	}

}
