package com.Webdriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vennela\\eclipse-workspace\\Livetech\\driverfiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("New Releases")).click();
}
}
