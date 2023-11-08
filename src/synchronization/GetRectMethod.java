package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement foodImage=driver.findElement(By.className("_2h2bu"));
		Rectangle rect=foodImage.getRect();
		System.out.println("Rectangular measures:" + rect);
		System.out.println("X coordinate:" + rect.getX());
		System.out.println("Y coordinate:" + rect.getY());
		System.out.println("Height:" + rect.getHeight());
		System.out.println("Width:" + rect.getWidth());
		
		driver.close();
	}

}
