package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		driver.manage().window().maximize();
		
		WebElement radiobutton2 = driver.findElement(By.id("redeemFlights")); 
		WebElement radiobutton = driver.findElement(By.id("bookFlights"));
		
		radiobutton2.click();
		System.out.println(radiobutton.isSelected());
		System.out.println(radiobutton2.isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@name='book-flight-radio']")).size());


	}

}
