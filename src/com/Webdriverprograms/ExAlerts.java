package com.Webdriverprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExAlerts {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	WebElement search=driver.findElement(By.name("cusid"));
	search.sendKeys("livetech");
	driver.findElement(By.name("submit")).click();
	Alert alert=driver.switchTo().alert();
	Thread.sleep(3000);
	//To get text of the alert
	System.out.println(alert.getText());
	//TO Accept the alert
	alert.accept();
	//To Dismiss the alert
	alert.dismiss();
	
}
}
