package classroomprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class WindowHandles {
	public WebDriver driver;
	public Actions action;
	
	
  @Test
  public void mousehover() throws Exception
  {
	  String parentwindow = driver.getWindowHandle();
	WebElement ele =  driver.findElement(By.linkText("SwitchTo"));
	
	action = new Actions(driver);
	action.moveToElement(ele).build().perform();
	
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("Windows")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
	for(String windowhandle : driver.getWindowHandles())
	{
		
		driver.switchTo().window(windowhandle);
		Thread.sleep(3000);
		
	}
	driver.findElement(By.linkText("GoDaddy.com")).click();
	Thread.sleep(3000);
	driver.close();
	
	driver.switchTo().window(parentwindow);
	
	driver.findElement(By.linkText("WebTable")).click();;
	  
	  
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.gecko.driver","D:\\selenium drivers\\browser drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
	  
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  
	  
	  
	  
  }

}
