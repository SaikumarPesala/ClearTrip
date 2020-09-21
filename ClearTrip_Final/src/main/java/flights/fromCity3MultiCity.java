package flights;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.flightsInputsClass;

public class fromCity3MultiCity {
	public WebDriver driver;
	flightsInputsClass ic = new flightsInputsClass();
	public fromCity3MultiCity(WebDriver driver)
	{
		this.driver=driver;
	}
	By frm = By.id("FromTag3");
	
	public WebElement desiredFromThree()
	{
		return driver.findElement(frm);
	}
}
