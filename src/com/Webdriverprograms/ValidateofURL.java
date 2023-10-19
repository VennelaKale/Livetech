package com.Webdriverprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateofURL {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://classroom.google.com/");
	driver.manage().window().maximize();
	String ExpectedTitle="Classroom Management Tools & Resources - Google for Education";
	String ActualTitle=driver.getTitle();
	System.out.println(ActualTitle);
	if(ExpectedTitle.equals(ActualTitle)) {
		System.out.println("pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
