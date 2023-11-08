package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ExplicitWaitFulentWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		 driver.get("https://the-internet.herokuapp.com/");
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//button[text()='Start']")).click();
		 
		 Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				              .withTimeout(Duration.ofSeconds(10))
				              .pollingEvery(Duration.ofSeconds(2))
				              .ignoring(Exception.class);
		 
		 WebElement element=wait.until(new Function<WebDriver, WebElement>(){
			 public WebElement apply(WebDriver driver) {
				 WebElement e=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
				 if(e.isDisplayed())
					 return e;
				 else
					 return null;
			 }
		 });
		 System.out.println(element.getText());
		 driver.close();
	}

}
