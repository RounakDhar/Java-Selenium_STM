package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformKeyboardEvents {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();

		WebElement sourcetextarea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[7]/pre/span"));


		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.keyDown(sourcetextarea,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		WebElement destinationtextarea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[8]/pre/span"));
		Thread.sleep(2000);
		action.keyDown(destinationtextarea,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();

	}

}
