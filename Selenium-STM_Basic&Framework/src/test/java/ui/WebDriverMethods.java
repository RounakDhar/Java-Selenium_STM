package ui;
import java.util.*;
//import java.util.List;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);

		String Title = driver.getTitle();
		System.out.println(Title);

		String PageSource = driver.getPageSource();
		System.out.println(PageSource);

		driver.navigate().to("https://www.google.com");

		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]")).click();

		List<WebElement> webelements = driver.findElements(By.xpath("//div[@id='']"));
		System.out.println(webelements);

		driver.navigate().to("https://www.sugarcrm.com");
		
		String WindowHandle = driver.getWindowHandle();
		System.out.println(WindowHandle);

		driver.findElement(By.xpath("//span[contains(text(),'Get a Demo')]")).click();
		
		Set<String> WindowHandles = driver.getWindowHandles();
		System.out.println(WindowHandles);

		//driver.close();
		driver.quit();

	}

}
