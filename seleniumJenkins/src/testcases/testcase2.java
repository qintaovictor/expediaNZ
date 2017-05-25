package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase2 {
	@Test
	
	public void testcase11()
	
	{

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.expedia.co.nz");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("package-origin").clear();
		driver.findElementById("package-origin").sendKeys("Auckland");
		driver.findElementByXPath("//*[@id='aria-option-0']/div/b[3]").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("package-destination").clear();
		driver.findElementById("package-destination").sendKeys("Shanghai");
		driver.findElementByXPath("//*[@id='aria-option-0']/div/b").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("package-departing").clear();
		driver.findElementByXPath("//*[@id='package-departing-wrapper']/div/div/button[2]").click();
		driver.findElementByXPath("//*[@id='package-departing-wrapper']/div/div/button[2]").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@id='package-departing-wrapper']/div/div/div[3]/table/tbody/tr[4]/td[6]/button").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("package-returning").clear();
		driver.findElementByXPath("//*[@id='package-returning-wrapper']/div/div/div[3]/table/tbody/tr[3]/td[6]/button").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("search-button").click();
		
		
		//driver.quit();
	}

}
