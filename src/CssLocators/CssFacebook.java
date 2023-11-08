package CssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("saiarpith610");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("1181691919");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.selected ")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
