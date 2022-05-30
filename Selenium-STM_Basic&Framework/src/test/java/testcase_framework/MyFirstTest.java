package testcase_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new FirefoxDriver();
		
		driver.get("https://www.zoho.com/");
		System.out.println("Clicked Successfully");
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login_id")).sendKeys("rcvtutorials@gmail.com");
		driver.findElement(By.xpath("//input[@id='login_id']")).click();
		
//		driver.findElement(By.id("password")).sendKeys("rcvtutorials@gmail.com");
//		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("testautomation@123");
		driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']")).click();
		
	}
}
