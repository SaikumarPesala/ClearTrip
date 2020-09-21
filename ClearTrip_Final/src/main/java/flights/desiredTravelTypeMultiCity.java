package flights;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.flightsInputsClass;

public class desiredTravelTypeMultiCity {
	
	public WebDriver driver;
	flightsInputsClass ic = new flightsInputsClass();
	
	public desiredTravelTypeMultiCity(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By button = By.id("MultiCity");
	
	
	public WebElement selectMultiCity()
	{
		return driver.findElement(button);
	} 

}
