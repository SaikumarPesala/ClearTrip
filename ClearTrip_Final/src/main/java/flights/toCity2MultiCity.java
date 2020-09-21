package flights;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.flightsInputsClass;

public class toCity2MultiCity {
	public WebDriver driver;
	flightsInputsClass ic = new flightsInputsClass();
	public toCity2MultiCity(WebDriver driver)
	{
		this.driver=driver;
	}
	By toCi = By.id("ToTag2");
	By toCitiesList = By.xpath("//ul[@id='ui-id-7']//li//a");
	
	public WebElement toCityTwoClick()
	{
		return driver.findElement(toCi);
	}
	public void desiredToCityTwo() throws IOException
	{
		List<WebElement> cityNames = driver.findElements(toCitiesList);
		for(int i=0;i<cityNames.size();i++)
		{
			String srcName = cityNames.get(i).getText();
			String[] sepName = srcName.split(",");
			String actName = sepName[0].toLowerCase();
			if(actName.contains(ic.ToCity2().toLowerCase()))
			{
				cityNames.get(i).click();
			}
			cityNames = driver.findElements(toCitiesList);
		}
	} 
	
	
}
