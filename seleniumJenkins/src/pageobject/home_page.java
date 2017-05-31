package pageobject;

import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;

public class home_page {
	
	 private static WebElement element = null;
	 
	    public static WebElement txtbx_origin(WebDriver driver){
	 
	         element = driver.findElement(By.id("package-origin"));
	 
	         return element;
	 
	         }
	 
	     public static WebElement txtbx_destination(WebDriver driver){
	 
	         element = driver.findElement(By.id("package-destination"));
	 
	         return element;
	 
	         }
	     
		    public static WebElement txtbx_origindate(WebDriver driver){
		   	 
		         element = driver.findElement(By.id("package-departing"));
		 
		         return element;
		 
		         }
		 
		     public static WebElement txtbx_destinationdate(WebDriver driver){
		 
		         element = driver.findElement(By.id("package-returning"));
		 
		         return element;
		 
		         }
	 
	     public static WebElement btn_Search(WebDriver driver){
	 
	         element = driver.findElement(By.id("search-button"));
	 
	         return element;
	 
	         }
	 

}



