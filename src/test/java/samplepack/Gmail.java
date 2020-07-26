package samplepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Gmail {

	public WebDriver driver;
	
	public void openurl() {
		System.setProperty("webdriver.gecko.driver","D:\\selenium drivers\\browser drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
	}

	public void login() throws InterruptedException {
		
		driver.findElement(By.id("identifierId")).sendKeys("suryatejachintapalli147@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("suryateja5664");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Gmail result = new Gmail();
result.openurl();
result.login();

	}

}
