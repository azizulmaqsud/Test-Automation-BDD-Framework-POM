package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class HomePage extends Base {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locator for login button
	By LoginBtn = By.xpath("//a[@href='elogin.php']");
	
	//Method to click login button
	public void clickLogin() {
		click(LoginBtn);
		//driver.findElement(LoginBtn).click();
	}
}