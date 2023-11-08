package CssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsVtiger {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'DAYS')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Features')])[1]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
