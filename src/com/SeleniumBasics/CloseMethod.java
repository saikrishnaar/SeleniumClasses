package com.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Scenario;
*Open the browser
*Navigate to flipkart.com
*Fetch the title and Url of the application
*Close the browser
*/
public class CloseMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
        
		driver.close();
	}

}
