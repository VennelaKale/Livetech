package com.Webdriverprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/draggable/");
	//To wait upto 3 seconds
	Thread.sleep(3000);
	//implicit Wait
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//ExplicitWait
	WebDriverWait wait=new WebDriverWait(driver,10);
	driver.findElement(By.linkText("Download image"));
	
	driver.close();
}
}
