package classroomprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DropdownGetOptions {
	
	public WebDriver driver;
	
	
  @Test
  public void spicejet() {
	  
	java.util.List<WebElement> values =  new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getOptions();
	  System.out.println(values.get(1).getText());
	  
	  for (WebElement value : values)
		  
	  {
		  System.out.println(value.getText());
	  }
	  
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
	  

		System.setProperty("webdriver.gecko.driver","D:\\selenium drivers\\browser drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
	  
  }

}
