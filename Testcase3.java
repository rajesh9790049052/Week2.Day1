package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hinduja Tech LTD");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rajeshkannan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Employee");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Automobile");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rajeshkannan");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/12/92");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automobile");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("5,25,000");
		driver.findElement(By.id("createLeadForm_currencyUomId")).sendKeys("INR - Indian Rupee");
		driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Computer Software");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
		driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("Public Corporation");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("054321");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Test ticker");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing purpose...pls ignore");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Testing purpose...pls ignore");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9790049052");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("012");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Rajesh");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rajeshatash@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.testleaf.com/");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Rajesh");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("RK");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No 3B, Phase 3");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Vijayalakshmi Nagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chengalpattu");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TAMILNADU");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("603111");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("603111");
		driver.findElement(By.className("smallSubmit")).click();
		
		///driver.close();
	}

}
