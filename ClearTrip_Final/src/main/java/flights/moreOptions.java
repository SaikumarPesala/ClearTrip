package flights;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.flightsInputsClass;

public class moreOptions {
	flightsInputsClass ic = new flightsInputsClass();
	public WebDriver driver;
	public moreOptions(WebDriver driver)
	{
		this.driver = driver;
	}
	By moreOptLink = By.xpath("//a[@id='MoreOptionsLink']");
	
	public WebElement optLink()
	{
		return driver.findElement(moreOptLink);
	}

}
