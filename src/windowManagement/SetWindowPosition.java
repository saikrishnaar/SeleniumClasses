package windowManagement;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindowPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		Point position=new Point(1000,500);
		driver.manage().window().setPosition(position);
		Thread.sleep(3000);
		driver.close();
		

	}

}
