package Week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowserviaselenium {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.close();	
		
	}

}
