package CssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/");
		
		driver.findElement(By.xpath("//a[@data-uia=\"header-login-link\"]")).click();
		
		driver.findElement(By.xpath("//input[@data-uia=\"login-field\"]")).sendKeys("saiarpith@gmail.com");
		
		driver.findElement(By.xpath("//input[@data-uia=\"password-field\"]")).sendKeys("sai118169");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
