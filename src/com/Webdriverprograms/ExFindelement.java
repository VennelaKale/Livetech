package com.Webdriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExFindelement {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	By MobilesL=By.linkText("Mobiles");
	WebElement Mobiles=driver.findElement(MobilesL);
	Mobiles.click();
	WebElement Laptops=driver.findElement(By.linkText("Laptops & Accessories"));
	System.out.println(Laptops.getText());

	Laptops.click();
	driver.findElement(By.linkText("Laptops & Accessories")).click();
}
}
