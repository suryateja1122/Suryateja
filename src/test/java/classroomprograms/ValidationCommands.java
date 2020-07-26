package classroomprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class ValidationCommands {
	
	public WebDriver driver;
	
  @Test
  public void dd()
 {
	  
	WebElement str=  new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getFirstSelectedOption();
	
	String name = str.getText();
	if (name.equalsIgnoreCase("INR")) {
		System.out.println("passed");
	} else {
		System.out.println("failed");
	}
	  
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver","D:\\selenium drivers\\browser drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	  
	  
	  
  }

  @AfterTest
  public void afterTest()
  {
	  
	  
	  
	  
	  
  }

}
