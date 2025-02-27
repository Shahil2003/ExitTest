package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.TestPage;

public class TestCase extends TestBase{
	
	// Declare a TestPage object to interact with the page elements
	TestPage test;
	
	//Initialize the TestPage object in BeforeClass to ensure driver configuration
	@BeforeClass
	public void config() {
		test=new TestPage(driver);
	}
	
	//Call Methods to Perform actions defined in the TestPage Class
	@Test
	public void testcase1() {
		test.select_category();
		test.select_product();
		test.addto_cart();
		test.goto_cart();
		test.delete_product();
	}
	
}
