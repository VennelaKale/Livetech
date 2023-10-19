package com.Webdriverprograms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExAutoit {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Select WORD files")).click();
	Runtime.getRuntime().exec(System.getProperty("user.dir")+"./Resources/todayclass.exe");
	
}
}
