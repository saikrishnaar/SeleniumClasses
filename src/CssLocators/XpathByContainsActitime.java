package CssLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsActitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
	}

}
