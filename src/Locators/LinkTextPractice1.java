package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPractice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);		
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Back to login")).click();
		Thread.sleep(3000);
		driver.close();

	}
}
