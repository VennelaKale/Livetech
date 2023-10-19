package com.Webdriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vennela\\eclipse-workspace\\Livetech\\driverfiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	//Element which needs to drag.  
	WebElement drag=driver.findElement(By.id("draggable"));
	 //Element on which need to drop.	
	WebElement drop=driver.findElement(By.id("droppable"));
	//Using Action class for drag and drop.
	Actions action=new Actions(driver);
	action.dragAndDrop(drag, drop).perform();
}
}
