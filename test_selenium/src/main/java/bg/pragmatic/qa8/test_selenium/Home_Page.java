package bg.pragmatic.qa8.test_selenium;

import org.openqa.selenium.support.PageFactory;

public class Home_Page {

static String url = "http://shop.pragmatic.bg/";
   
    public void HomePage() {
    	PageFactory.initElements(Browser.getDriver(), this);
    }
    
    public void close() {
    	Browser.tearDown();
    }
    
    public void open(){
    	Browser.getDriver().get(url);
    }
    
    public Search search() {
    	Search search = new Search();
    	return search;
    }
}
