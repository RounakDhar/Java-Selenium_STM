package ui;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablesDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www2.asx.com.au/");

		WebElement frame1 = driver.findElement(By.id("announcements-frame"));
		driver.switchTo().frame(frame1);

		List<WebElement> rowelements = driver.findElements(By.xpath("//*[@id=\"announcement_data_widget\"]/table/tbody/tr"));
		System.out.println(rowelements.size());
		int rowsize = rowelements.size();

		List<WebElement> columnelements = driver.findElements(By.xpath("//*[@id=\"announcement_data_widget\"]/table/tbody/tr[1]/td"));
		System.out.println(columnelements.size());
		int colsize = columnelements.size();

		for(int i=1;i<=rowsize;i++) {
			for(int j=1;j<=colsize;j++) {

				System.out.println(driver.findElement(By.xpath("//*[@id=\"announcement_data_widget\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
			System.out.println();
		}


	}

}
