package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocatorPractice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.className("\"col-xs-20 searchformInput keyword\"")).sendKeys("shoe");
		driver.findElement(By.className("searchformButton col-xs-4 rippleGrey")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
