package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocatorPractice3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-ac")).sendKeys("soft toys");
		driver.findElement(By.id("gh-btn")).click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
