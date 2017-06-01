package bg.pragmatic.qa8.test_selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import org.openqa.selenium.support.PageFactory;


public class Search {
	@FindBy(name = "search") 
	private WebElement search;
	@FindBy(css = ".button-search")
	private WebElement searchButton; 

	public Search() {
		PageFactory.initElements(Browser.getDriver(), this);
	}
	
	public Results_from_search searchInStore(String query) { 
		search.sendKeys(query);
		searchButton.click();
		return new Results_from_search(); 	}
}


