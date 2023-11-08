package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Can't reset")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
