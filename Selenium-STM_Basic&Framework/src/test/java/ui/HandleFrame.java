package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("html/body/button")).click();
		
		WebElement frame1 = driver.findElement(By.id("frameElement"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("html/body/button")).click();
		System.out.println(driver.getTitle());
		
	}

}
