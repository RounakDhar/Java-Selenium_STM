package ui;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/au/form/signup/freetrial-elf-v2/");
		driver.manage().window().maximize();

		List<WebElement> alltags = driver.findElements(By.tagName("option"));
		System.out.println("Total tags are: "+alltags.size()); 
		
		for(int i=0;i<alltags.size();i++)
		{
			System.out.println("Links on Page are: "+alltags.get(i).getText());
		}
		
		

	}

}
