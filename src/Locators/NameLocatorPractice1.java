package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorPractice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		 
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("1919118169");
		driver.findElement(By.name("password")).sendKeys("05061007");
		
		Thread.sleep(3000);
		driver.close();
	}

}
