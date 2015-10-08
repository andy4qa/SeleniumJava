package Step1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class tests {
//public static void main(String[] args) {

@Test
	public void login_logout() {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.i.ua");
	driver.manage().window().maximize();
	
	System.out.println("Page title is: " + driver.getTitle());
	 
	WebElement login_field = driver.findElement(By.xpath("//div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/ul/li[1]/p[2]/input"));
	WebElement password_field = driver.findElement(By.xpath("//div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/ul/li[1]/input"));
	WebElement select_subitem = driver.findElement(By.xpath("//div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/ul/li[2]/p/select"));
	WebElement login_button = driver.findElement(By.xpath("//div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/p/input"));
	
	
	login_field.sendKeys("test-test-test");
	password_field .sendKeys("123456qwe");
    
	Select ua_tipe = new Select(driver.findElement(By.name("domn")));
	//ua_tipe.selectByValue("ua.fm");
	ua_tipe.selectByValue("i.ua");
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	login_button.isDisplayed();
	login_button.isEnabled();
	
	login_button.click();
	
	/*
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	
	WebElement service_button = driver.findElement(By.xpath("//*[@id='header_overall']/div[1]/ul[3]/li[3]/span"));
	
	service_button.isDisplayed();
	service_button.isEnabled();
	
	/*
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	
	
	
	service_button.click();

	/*
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	
	WebElement exit_link = driver.findElement(By.xpath("//*[@class='body_container']/div/div/div[@id='accountSettingsPopup']/ul/li[7]/a"));
	exit_link.isDisplayed();
	
	
	exit_link.click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.quit();
	}
}
