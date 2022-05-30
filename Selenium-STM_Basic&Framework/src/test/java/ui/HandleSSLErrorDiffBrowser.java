package ui;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSSLErrorDiffBrowser {

	public static String browser = "firefox";
	public static WebDriver driver;
	
	
	public static void main(String[] args) {

		
		DesiredCapabilities handlesslerror = new DesiredCapabilities();
		
		if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			handlesslerror.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			handlesslerror.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			FirefoxOptions ffoptions = new FirefoxOptions();
			ffoptions.merge(handlesslerror);
			driver = new FirefoxDriver(ffoptions);
			
		} else if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			handlesslerror.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			handlesslerror.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			ChromeOptions coptions = new ChromeOptions();
			coptions.merge(handlesslerror);
			driver = new ChromeDriver(coptions);
			
		}else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			handlesslerror.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			handlesslerror.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			EdgeOptions eoptions = new EdgeOptions();
			eoptions.merge(handlesslerror);
			driver = new EdgeDriver(eoptions);
			
		}
		
		driver.get("https://expired.badssl.com/");
		
	}

}
