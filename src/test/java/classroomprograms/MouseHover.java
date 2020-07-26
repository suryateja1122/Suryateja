package classroomprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MouseHover {
	public WebDriver driver;
	public Actions action;
	
	
  @Test
  public void actions() throws Exception {
	  
	  action = new Actions(driver);
	  //WebElement ele = driver.findElement(By.id("ctl00_HyperLinkLogin"));
	  action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
	  Thread.sleep(3000);
	 // WebElement ele1 = driver.findElement(By.xpath("//a[contains(text(),'SpiceClub Members')]"));
	  action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SpiceClub Members')]"))).build().perform();
	  Thread.sleep(3000);
	  driver.findElement(By. xpath("//a[contains(text(),'Sign up')]")).click();
	  
	  
	  
	  
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
