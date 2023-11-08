package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement loginButton=driver.findElement(By.xpath("//button[.='Log in']"));
		if(loginButton.isEnabled())
			System.out.println("Enabled");
		else
			System.out.println("Disabled");
		
		driver.findElement(By.name("username")).sendKeys("Saiarpith610@");
		driver.findElement(By.name("password")).sendKeys("1919118169");
		
		if(loginButton.isEnabled())
		{
			System.out.println("Enabled");
			loginButton.submit();
		}
		else
			System.out.println("Disabled");
		
		driver.close();
	}

}
