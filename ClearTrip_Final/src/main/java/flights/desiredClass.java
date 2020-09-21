package flights;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.flightsInputsClass;

public class desiredClass {
	public WebDriver driver;
	public desiredClass(WebDriver driver)
	{
		this.driver = driver;
	}
	flightsInputsClass ic = new flightsInputsClass();
	
	By cl = By.id("Class");
	
	public WebElement classClick()
	{
		return driver.findElement(cl);
	}
	
	public void classSelection() throws IOException
	{
		List<WebElement> classOptions = driver.findElements(By.xpath("//select[@id='Class']//option"));
		for(int i=0;i<classOptions.size();i++)
		{
			String classtype = ic.Class().toLowerCase();
			if((classOptions.get(i).getText().toLowerCase()).contains(classtype))
			{
				classOptions.get(i).click();
			}
		}
	}
	

}
