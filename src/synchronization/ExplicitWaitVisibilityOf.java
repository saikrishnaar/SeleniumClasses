package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitVisibilityOf {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		
		 driver.findElement(By.xpath("//button[text()='Start']")).click();
		 
		 WebElement element=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		 WebDriverWait wait=new WebDriverWait(driver,10);
		 
		 try {
			 String text=wait.until(ExpectedConditions.visibilityOf(element)).getText();
			 System.out.println(text);
		 }
		 catch (Exception e)
		 {
			 System.out.println("Element not found");
		 }
		 driver.close();
	}
}
