package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/damaniayele/Desktop/Chromedev/chromedriver-2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		
		
		
	}

}
