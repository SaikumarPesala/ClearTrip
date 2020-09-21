package flights;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.flightsInputsClass;

public class toCity3MultiCity {
	public WebDriver driver;
	flightsInputsClass ic = new flightsInputsClass();
	public toCity3MultiCity(WebDriver driver)
	{
		this.driver=driver;
	}
	By toCi = By.id("ToTag3");
	By toCitiesList = By.xpath("//ul[@id='ui-id-9']//li//a");
	
	public WebElement toCityThreeClick()
	{
		return driver.findElement(toCi);
	}
	public void desiredToCityThree() throws IOException
	{
		List<WebElement> cityNames = driver.findElements(toCitiesList);
		for(int i=0;i<cityNames.size();i++)
		{
			String srcName = cityNames.get(i).getText();
			String[] sepName = srcName.split(",");
			String actName = sepName[0].toLowerCase();
			if(actName.contains(ic.ToCity3().toLowerCase()))
			{
				cityNames.get(i).click();
			}
			cityNames = driver.findElements(toCitiesList);
		}
	} 
	
	
}
