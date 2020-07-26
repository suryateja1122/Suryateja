package classroomprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Alerts {
	
	public WebDriver driver;
	
	
  @Test
  public void alerts() throws Exception {
	  
	//  driver.findElement(By.id("alertButton")).click();
	  driver.findElement(By.id("promtButton")).click();
	  
	 Thread.sleep(3000);
	//  String text = driver.switchTo().alert().getText();
	 driver.switchTo().alert().sendKeys("suryateja");
	 driver.switchTo().alert().accept();
	//  System.out.println(text);
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
	  System.setProperty("webdriver.gecko.driver","D:\\selenium drivers\\browser drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
