package flights;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.flightsInputsClass;

public class desiredDestination {
	public WebDriver driver;
	flightsInputsClass ic = new flightsInputsClass();
	public desiredDestination(WebDriver driver) 
	{
		this.driver = driver;
	}
	By destFind = By.id("ToTag");
	By destNamesLists = By.xpath("//ul[@id='ui-id-2']//li//a");
	
	
	public WebElement destFinder() 
	{
		return driver.findElement(destFind);
	}
	
	public void desiredDesti() throws IOException
	{
		List<WebElement> destNames = driver.findElements(destNamesLists);
		for(int j=0;j<destNames.size();j++)
		{
			String destName = destNames.get(j).getText();
			String[] sepDestName = destName.split(",");
			String actDestName = sepDestName[0];
			String actDeName = actDestName.trim();
			String trimmedDestName = actDeName.toLowerCase();
			if(trimmedDestName.contains(ic.desti().toLowerCase()))
			{
				destNames.get(j).click();
			}
		}
	}
	
	
}
