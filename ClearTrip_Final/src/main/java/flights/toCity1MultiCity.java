package flights;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.flightsInputsClass;

public class toCity1MultiCity {
	public WebDriver driver;
	flightsInputsClass ic = new flightsInputsClass();
	public toCity1MultiCity(WebDriver driver)
	{
		this.driver=driver;
	}
	By toCi = By.id("ToTag1");
	By toCitiesList = By.xpath("//ul[@id='ui-id-5']//li//a");
	
	public WebElement toCityOneClick()
	{
		return driver.findElement(toCi);
	}
	public void desiredToCityOne() throws IOException
	{
		List<WebElement> cityNames = driver.findElements(toCitiesList);
		for(int i=0;i<cityNames.size();i++)
		{
			String srcName = cityNames.get(i).getText();
			String[] sepName = srcName.split(",");
			String actName = sepName[0].toLowerCase();
			if(actName.contains(ic.ToCity1().toLowerCase()))
			{
				cityNames.get(i).click();
			}
			cityNames = driver.findElements(toCitiesList);
		}
	} 
	
	
	
}
