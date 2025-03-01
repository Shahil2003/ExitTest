package utilities;

public class LocatorConstants {
	
	//Constants Variables are declared as public static, so that they can be called in any other methods without making object of the class.
	
	public static String category = "//img[@alt='Headsets']";
	
	public static String product = "//img[@class='s-image' and @src='https://m.media-amazon.com/images/I/71MGiPTwXAL._AC_UY218_.jpg']";
	
	public static String button = "//input[@id='add-to-cart-button' and @name='submit.add-to-cart']";
	
	public static String cart = "//a[@id='nav-cart']";
	
	public static String delete = "//input[@value='Delete' and contains(@aria-label, 'Delete Razer BlackShark V2 X')]";

}
