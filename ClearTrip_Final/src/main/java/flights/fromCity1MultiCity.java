package flights;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.flightsInputsClass;

public class fromCity1MultiCity {
	public WebDriver driver;
	flightsInputsClass ic = new flightsInputsClass();
	public fromCity1MultiCity(WebDriver driver)
	{
		this.driver=driver;
	}
	By frm = By.id("FromTag1");
	By frmLists = By.xpath("//ul[@id='ui-id-4']//li//a");
	
	public WebElement desiredFromOne()
	{
		return driver.findElement(frm);
	}
	
	public void desiredFromCityOne() throws IOException
	{
		List<WebElement> srcNames = driver.findElements(frmLists);
		for(int i=0;i<srcNames.size();i++)
		{
			String srcName = srcNames.get(i).getText();
			String[] sepName = srcName.split(",");
			String actName = sepName[0].toLowerCase();
			if(actName.contains(ic.FromCity1().toLowerCase()))
			{
				srcNames.get(i).click();
			}
			srcNames = driver.findElements(frmLists);
		}
	} 
}
