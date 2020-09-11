package com.actTime.script;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoA {
	@Test
	public void TestBrowser() {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println("Opening fb");
		driver.close();
	}
	@Test
	public void OpenActime() {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.close();
	}

}
