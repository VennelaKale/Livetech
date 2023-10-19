package com.Webdriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exjavascript {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//navigate to amazon page
	js.executeScript("window.location='https://www.amazon.in/'");
	driver.manage().window().maximize();
	//to send the data
	js.executeScript("document.getElementById('twotabsearchtextbox').value='watches';");
	//to get the title
	String Title=js.executeScript("return document.title;").toString();
	System.out.println("Title of the application is :"+Title);
	//To get the URL
	String URL=js.executeScript("return document.URL;").toString();
	System.out.println("Url Of the application :"+URL);
	//Scroll
	js.executeScript("window.scrollBy(0,590)");
	Thread.sleep(3000);
	WebElement instagram=driver.findElement(By.linkText("Instagram"));
	//to click on a webelement
	js.executeScript("arguments[0].click();",instagram);
	Thread.sleep(3000);
driver.navigate().back();
//To scroll upto page bottom
js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
Thread.sleep(3000);
driver.close();

}
}
