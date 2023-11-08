package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*Scenario:
 *Open the browser:
 *enter amazon.com:
 *type user name and password:
 *close the browser
 */

public class IDLocatorPracticel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
