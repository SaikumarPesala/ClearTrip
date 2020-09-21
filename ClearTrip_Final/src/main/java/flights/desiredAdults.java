package flights;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.flightsInputsClass;

public class desiredAdults {
	public WebDriver driver;
	flightsInputsClass ic = new flightsInputsClass();
	public desiredAdults(WebDriver driver) 
	{
		this.driver = driver;
	}
	By adul = By.xpath("//select[@id='Adults']");
	
	public WebElement clickAdult()
	{
		return driver.findElement(adul);
	}
	public void desAdults() throws IOException
	{
		List<WebElement> desAdults = driver.findElements(By.xpath("//select[@id='Adults']//option"));
		for(int j=0; j<desAdults.size();j++)
		{
			String s = desAdults.get(j).getText();
			String obtAdult = ic.Adults();
			int x=Integer.parseInt(obtAdult);
			int n=0;
			n=Integer.parseInt(s);
			if(n==x)
			{
				desAdults.get(j).click();
			}
		}
	}
	
	
	
}
