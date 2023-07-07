package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registrationpage {
WebDriver driver;
By emailadress=By.name("customer[email]");
By password=By.name("customer[password]");
By submit=By.xpath("//*[@id=\"customer_login\"]/div[2]/div[2]/div/input");
public registrationpage(WebDriver driver){
	this.driver=driver;
}
public void register(String firstname,String lastname,String email,String pwd) throws InterruptedException {
	driver.findElement(emailadress).sendKeys(email);
	driver.findElement(password).sendKeys(pwd);
	driver.findElement(submit).click();
}
}
