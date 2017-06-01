package bg.pragmatic.qa8.test_selenium;

import java.util.ArrayList;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;




public class Results_from_search {

public Results_from_search(){
	PageFactory.initElements(Browser.getDriver(),this);
}
public List<String> getProducts() {
	List<String> products = new ArrayList<String>();
	List<WebElement> productList = Browser.getDriver().
			findElements(By.cssSelector("div.product-list > div"));
	for(WebElement item : productList) {
		products.add(item.findElement(By.cssSelector(".name > a")).getText());
	}
	return products;
}

public void close() {
	Browser.tearDown();
}
public Search Search() {
	Search search = new Search();
	return search;
}
}
