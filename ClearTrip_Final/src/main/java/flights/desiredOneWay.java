package flights;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.flightsInputsClass;

public class desiredOneWay {
	public WebDriver driver;
	flightsInputsClass ic = new flightsInputsClass();
	
	public desiredOneWay(WebDriver driver)
	{
		this.driver = driver;
	}
	By button = By.id("OneWay");
	
	
	public WebElement selectOneWay()
	{
		return driver.findElement(button);
	}
}
