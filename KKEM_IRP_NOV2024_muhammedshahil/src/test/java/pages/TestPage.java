package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.LocatorConstants;

public class TestPage {
	WebDriver driver;
	
	// Constructor to initialize the WebDriver
	public TestPage(WebDriver driver) {
		this.driver=driver;
		System.out.println("[+] WebDriver Initialized Successfully!");
	}
	
	// Method to select a category
	public void select_category() {
		WebElement category=driver.findElement(By.xpath(LocatorConstants.category));
		category.click();
		System.out.println("[+] Category Selected Successfully!");
	}
	
	// Method to select a product
	public void select_product() {
		WebElement product = driver.findElement(By.xpath(LocatorConstants.product));
		product.click();
		System.out.println("[+] Product Selected Successfully!");
	}
	
	// Method to add a product to the cart
	public void addto_cart() {
		WebElement button = driver.findElement(By.xpath(LocatorConstants.button));
		button.click();
		System.out.println("[+] Product Added to Cart Successfully!");
	}
	
	// Method to go to the cart page
	public void goto_cart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement cartIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LocatorConstants.cart)));
		cartIcon.click();

	}
	
	// Method to delete a product from the cart
	public void delete_product() {
		WebElement delete=driver.findElement(By.xpath(LocatorConstants.delete));
		delete.click();
		System.out.println("[+] Product Deleted Successfully!");
	}
}
