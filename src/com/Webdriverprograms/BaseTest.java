package com.Webdriverprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
public static WebDriver driver;
public void setup() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
}
public void Close() {
	driver.close();
}
}
