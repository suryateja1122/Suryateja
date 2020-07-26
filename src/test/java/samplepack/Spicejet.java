package samplepack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {
	
	public WebDriver driver;
	
	public void openurl() throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","D:\\selenium drivers\\browser drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	public void bookticket() throws InterruptedException
	{   	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@text='Chennai (MAA)']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Mumbai (BOM)'][contains(text(),'Mumbai (BOM)')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@class='ui-state-default'][contains(text(),'14')]")).click();
	driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"))).selectByValue("5");
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
	
	
	}

	public static void main(String[] args) throws InterruptedException {
		Spicejet result = new Spicejet();
		result.openurl();
		result.bookticket();

	}

}
