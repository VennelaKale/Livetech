package com.Webdriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExActionsclass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vennela\\eclipse-workspace\\Livetech\\driverfiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//To open Jquery Application
	driver.get("https://jqueryui.com/droppable/");
	//To maximize the winddow
	driver.manage().window().maximize();
	//Finding themes Element
	WebElement themes=driver.findElement(By.linkText("Themes"));
	Actions action=new Actions(driver);
	//MoveToelement using Actions class
	action.moveToElement(themes).build().perform();
	WebElement about=driver.findElement(By.linkText("About"));
	//To Rightclick on WebElement
	action.contextClick(about).perform();
WebElement download=driver.findElement(By.linkText("Download"));
//TO click on WebElement using actions class
action.click(download).build().perform();
	
}
}
