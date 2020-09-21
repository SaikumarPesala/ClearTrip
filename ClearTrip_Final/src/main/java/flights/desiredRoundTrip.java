package flights;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.flightsInputsClass;

public class desiredRoundTrip {
	
	public WebDriver driver;
	flightsInputsClass ic = new flightsInputsClass();
	
	public desiredRoundTrip(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By button = By.id("RoundTrip");
	
	
	public WebElement selectRoundTrip()
	{
		return driver.findElement(button);
	} 

}
