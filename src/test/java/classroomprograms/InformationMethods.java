package classroomprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class InformationMethods {
	
	public WebDriver driver;
	
	
	
  @Test
  public void google() {
	  
	  String str1 = driver.findElement(By.linkText("Gmail")).getText();
	  System.out.println(str1);
	  

  }
  
  
  @Test
  public void google_image() {
	  
	  String str2 = driver.findElement(By.id("hplogo")).getAttribute("alt");
	  System.out.println(str2);
  }
  
  
  @Test
  public void googleimage() {
	  
	  String str3 = driver.findElement(By.name("btnK")).getAttribute("value");
	  System.out.println(str3);
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  
	  System.setProperty("webdriver.gecko.driver","D:\\selenium drivers\\browser drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
	  
  }

}
