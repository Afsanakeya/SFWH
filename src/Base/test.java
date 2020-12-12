package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
		WebDriver driver;
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver ");
		driver = new FirefoxDriver(); 
		System.out.println (" Firefox driver open ++++++++++++++++ ");
	
	}

}
