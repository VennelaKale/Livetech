package com.Webdriverprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browsermethods {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","./driverfiles/msedgedriver.exe" );
	WebDriver driver=new EdgeDriver();
	//get()-To open any application
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	//naviagte().To()-To open any application
	driver.navigate().to("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	//to get title of the current page
	System.out.println(driver.getTitle());
	driver.navigate().back();
	//To get the current URL
	System.out.println(driver.getCurrentUrl());
	//used to get the source of the last loaded page
	System.out.println(driver.getPageSource());
	//to close the current window
	driver.close();
	//To quit the browser and all the opened windows
	driver.quit();
	
}
}
