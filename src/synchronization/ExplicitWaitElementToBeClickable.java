package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitElementToBeClickable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.instagram.com/");
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 
		 WebElement loginButton=driver.findElement(By.xpath("//button[.='Log in']"));
		 WebDriverWait wait=new WebDriverWait(driver,5);
		 try {
			 wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
			 System.out.println("Login button is enabled");
		 }
		 catch(Exception e)
		 {
			 System.out.println("Login button is disabled");
		 }
		 driver.close();
	}
}
