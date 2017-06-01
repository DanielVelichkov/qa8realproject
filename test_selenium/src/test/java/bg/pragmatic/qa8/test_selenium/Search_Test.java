package bg.pragmatic.qa8.test_selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Search_Test {

	@Before
	public void setUp() {
		Browser.browserInit();
	}

	@Test
	public void testProductSearch() throws Throwable {

		Home_Page homePage = new Home_Page();

		homePage.open();

		Search searchInput = homePage.search();
		Results_from_search searchResult = searchInput.searchInStore("Philips");

		System.out.println("Nalichni: " + searchResult.getProducts().size());
		Thread.sleep(2000);

		System.out.println("is Empty: " + searchResult.getProducts().isEmpty());
		Thread.sleep(2000);

		assertEquals(1, searchResult.getProducts().size());
		System.out.println("Product: " + searchResult.getProducts());
		Thread.sleep(3000);

		assertTrue(searchResult.getProducts().get(2).contains("HD Media"));
		assertTrue(searchResult.getProducts().get(1).contains("Philips"));
		assertEquals(searchResult.getProducts().get(0), "Player");

		searchResult.close();
	}

	@After
	public void tearDown() {
		Browser.tearDown();
	}
}
