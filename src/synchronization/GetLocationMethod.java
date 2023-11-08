package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement signIn=driver.findElement(By.xpath("//span[.='Sign in']"));
		Point p=signIn.getLocation();
		System.out.println("Location of signIn is" +p);
		
		System.out.println("X coordinate: " + p.getX());
		System.out.println("Y coordinate: " + p.getY());
		
		driver.close();

	}

}
