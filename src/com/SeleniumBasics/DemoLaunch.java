package com.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	}

}
