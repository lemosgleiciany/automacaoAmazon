package automacaoAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcessarAmazonPage {

	private static WebDriver driver;
	
	public void acessarSiteAmazon() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com.br/");
		
	}
	
	public static WebDriver getDriver(){
		return driver;
	}

}
