package ui;
import java.util  .List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();

//		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("mobile");
//		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	
		WebElement dropdown = driver.findElement(By.name("employees_c"));
		Select select = new Select(dropdown);
		
		select.selectByValue("level3");
		//Thread.sleep(2000);
		
		select.selectByVisibleText("51 - 100 employees");
		
		select.selectByIndex(3);
		
		List<WebElement> MultiSelect = select.getAllSelectedOptions();

		//driver.close();

	}

}
