package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobject.home_page;

public class testcase {
	@Test
	
	public void testcase11()
	
	{

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.expedia.co.nz");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		home_page.txtbx_origin(driver).clear();
		home_page.txtbx_origin(driver).sendKeys("Auckland");
		driver.findElementByXPath("//*[@id='aria-option-0']/div/b[3]").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		home_page.txtbx_destination(driver).clear();
		home_page.txtbx_destination(driver).sendKeys("Shanghai");
		driver.findElementByXPath("//*[@id='aria-option-0']/div/b").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		home_page.txtbx_origindate(driver).clear();
		driver.findElementByXPath("//*[@id='package-departing-wrapper']/div/div/button[2]").click();
		driver.findElementByXPath("//*[@id='package-departing-wrapper']/div/div/button[2]").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@id='package-departing-wrapper']/div/div/div[3]/table/tbody/tr[4]/td[6]/button").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		home_page.txtbx_destinationdate(driver).clear();
		driver.findElementByXPath("//*[@id='package-returning-wrapper']/div/div/div[3]/table/tbody/tr[3]/td[6]/button").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		home_page.btn_Search(driver).click();
		driver.quit();
	}

}
