package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement loginButton=driver.findElement(By.xpath("//button[.='Log in']"));
		System.out.println(loginButton.getCssValue("color"));
		System.out.println(loginButton.getCssValue("font"));
		System.out.println(loginButton.getCssValue("background-color"));
		driver.close();
	}

}
