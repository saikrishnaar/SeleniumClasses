package windowManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practical {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     //Maximize window
     driver.manage().window().maximize();
     
     Thread.sleep(3000);
     //Maximize window
     //driver.manage().window().maximize();
     
     //Full Screen mode
     driver.manage().window().fullscreen();
     
     Thread.sleep(3000);
     driver.close();
     
	}

}
