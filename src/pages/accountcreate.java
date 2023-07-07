package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class accountcreate {
	WebDriver driver;
	By create=By.xpath("//*[@id=\"shopify-section-header-toplink-menu\"]/ul/li/a");
	
	
	public accountcreate(WebDriver driver)
	{
		this.driver=driver;
	}
	public void account(){
		driver.findElement(create).click();
	}
		
	}
	


