package flights;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.flightsInputsClass;

public class desiredSource {
	public WebDriver driver;
	flightsInputsClass ic = new flightsInputsClass();
	public desiredSource(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	By srcFind = By.id("FromTag");
	By srcNamesLists = By.xpath("//ul[@id='ui-id-1']//li//a");
	
	public WebElement srcFinder() 
	{
		return driver.findElement(srcFind);
	}
	public void desSrc() throws IOException
	{
		List<WebElement> srcNames = driver.findElements(srcNamesLists);
		for(int i=0;i<srcNames.size();i++)
		{
			String srcName = srcNames.get(i).getText();
			String[] sepName = srcName.split(",");
			String actName = sepName[0].toLowerCase();
			if(actName.contains(ic.source().toLowerCase()))
			{
				srcNames.get(i).click();
			}
			
		}
	}
}
