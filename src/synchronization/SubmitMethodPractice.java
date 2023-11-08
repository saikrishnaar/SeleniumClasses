package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethodPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement searchTF=driver.findElement(By.id("twotabsearchtextbox"));
		searchTF.sendKeys("shoes");
		Thread.sleep(2000);
		searchTF.clear();
		Thread.sleep(2000);
		searchTF.sendKeys("chocolate");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).submit();
		Thread.sleep(2000);
		driver.close();
		
	}

}
