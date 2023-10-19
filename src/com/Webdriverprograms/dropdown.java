package com.Webdriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdown extends BaseTest{
	public void dropdown() {
		WebElement searchbox=driver.findElement(By.id("searchDropdownBox"));
		searchbox.click();
		Select select=new Select(searchbox);
	    select.selectByVisibleText("Clothing & Accessories");
	    select.selectByIndex(7);
	    select.selectByValue("search-alias=luxury-beauty");
	}
public static void main(String[] args) throws InterruptedException {
	BaseTest obj1=new BaseTest();
	obj1.setup();
	dropdown obj=new dropdown();
	obj.dropdown();
	//obj1.Close();
}
}
