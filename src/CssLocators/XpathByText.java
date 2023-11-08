package CssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//a[text()='Daily Deals']")).click();
		driver.findElement(By.xpath("//span[text()='Tech']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
