package com.wikia.webdriver.PageObjectsFactory.PageObject.Hubs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.wikia.webdriver.PageObjectsFactory.PageObject.HubBasePageObject;

public class LifestyleHubPageObject extends HubBasePageObject {


	
	
	public LifestyleHubPageObject(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}


	

}
