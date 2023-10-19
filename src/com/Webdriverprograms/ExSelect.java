package com.Webdriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ExSelect{
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	 driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	Select select=new Select(driver.findElement(By.id("day")));
    select.selectByVisibleText("22");
}
}
