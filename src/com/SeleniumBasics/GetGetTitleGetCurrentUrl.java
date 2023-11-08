package com.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGetTitleGetCurrentUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.snapchat.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
