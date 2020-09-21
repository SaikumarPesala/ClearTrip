package flights;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.flightsInputsClass;

public class fromCity2MultiCity {
	public WebDriver driver;
	flightsInputsClass ic = new flightsInputsClass();
	public fromCity2MultiCity(WebDriver driver)
	{
		this.driver=driver;
	}
	By frm = By.id("FromTag2");
	
	public WebElement desiredFromTwo()
	{
		return driver.findElement(frm);
	}
}
