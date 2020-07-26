package samplepack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Elements {
	
	public WebDriver driver;
	public Actions action;
	
  @Test(priority = 1)
  public void textbox() {
	  
	  driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]")).click();
	  
	  driver.findElement(By.xpath("//span[contains(text(),'Text Box')]")).click();
	  
	  driver.findElement(By.id("userName")).sendKeys("Surya teja") ;
	  
	  driver.findElement(By.id("userEmail")).sendKeys("suryatejachintapalli147@gmail.com") ;
	  
	  driver.findElement(By.id("currentAddress")).sendKeys("9-284,PLOT NO-176,ROAD NO 17,NEW GAYATRI NAGAR,JILLELGUDA,SAROOR NAGAR MANDAL.");
	  
	  driver.findElement(By.id("permanentAddress")).sendKeys("9-284,PLOT NO-176,ROAD NO 17,NEW GAYATRI NAGAR,JILLELGUDA,SAROOR NAGAR MANDAL.");
	  
	  
	  driver.findElement(By.id("submit")).click();
	  
	  
  }
  
  @Test(priority = 2)
public void checkBox() {
	  
	  driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]")).click();
	  driver.findElement(By.xpath("//*[@id=\"item-1\"]")).click();
	  driver.findElement(By.xpath("//span[@class='rct-checkbox']//*[local-name()='svg']")).click();
	  driver.findElement(By.xpath("//span[@class='rct-checkbox']//*[local-name()='svg']")).click();
	  
	  
  }
  
  
  @Test
  public void radioButton() {
  	  
  	  
  	  
  	  
    }
  
  
  @Test
  public void mouseoperations() {
  	  
	  driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]")).click();
	  
	  driver.findElement(By.xpath("//span[contains(text(),'Buttons')]")).click();
	  
	  action = new Actions(driver);
	  action.doubleClick(driver.findElement(By.xpath("//button[@id='doubleClickBtn']"))).build().perform();;
	  action.contextClick(driver.findElement(By.xpath("//button[@id='rightClickBtn']"))).build().perform();;
	 driver.findElement(By.id("8kZbx")).click();;
	  
  	  
  	  
    }
  
  @BeforeTest
  public void beforeTest() {
	 
	  System.setProperty("webdriver.gecko.driver","D:\\selenium drivers\\browser drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");
	 
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
	  
	  
  }

}
