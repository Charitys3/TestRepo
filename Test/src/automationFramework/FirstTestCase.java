package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// Start WebDriver
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		System.out.println("Successfully opened the website");
		
		Thread.sleep(5);
		
		driver.quit();
		
	}

}
