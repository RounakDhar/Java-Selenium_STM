package testcase_framework;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base_framework.BaseTest;
import utilities_framework.ReadXLSData;

public class FirstTestData extends BaseTest{

	@Test(dataProviderClass=ReadXLSData.class,dataProvider="bvtdata")
	public static void LoginTest(String username,String password) {

		System.out.println("Clicked Successfully");
		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
		driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys(username);
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys(password);
		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
	}

//	@DataProvider(name="testdata")
//	public Object[][]tdata()
//	{
//		return new Object[][] {
//			{ "rcvtutorial@gmail.com", "testauto@123" },
//			{ "tutorials@gmail.com", "automation@123" },
//			{ "rcvacademy@gmail.com", "testautomation@456" },
//			{ "rcvtutorials@gmail.com", "testautomation@123" },
//		};
//
//	}

}
