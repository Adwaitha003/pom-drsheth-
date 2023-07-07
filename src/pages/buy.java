package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class buy {
WebDriver driver;
By buying=By.name("s");
By sunscreen=By.xpath("//*[@id=\"searchModal\"]/div/div/div[1]/div[1]/div[2]/div[3]/div[1]/div/div[1]/a/img");
By tocart=By.name("add");

public buy(WebDriver driver) {
	this.driver=driver;

}
public void pro(String product) {
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	driver.findElement(buying).sendKeys(product);
	   
 }
public void cr() throws InterruptedException {
	Thread.sleep(5000);
	driver.findElement(sunscreen).click();
	driver.findElement(tocart).click();
}
}
