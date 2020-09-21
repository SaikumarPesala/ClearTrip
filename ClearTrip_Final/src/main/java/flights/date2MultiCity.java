package flights;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.flightsInputsClass;

public class date2MultiCity {
	public WebDriver driver;
	flightsInputsClass ic = new flightsInputsClass();
	public date2MultiCity(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void date2Select() throws IOException
	{
		String firMon=null,secMon=null;
		String fuDate = ic.DepartOnDate2();
		String[] sepDate = fuDate.split(" ");
		String day=sepDate[0];
		String mon=sepDate[1].toLowerCase();
		int i=1;
		while(i==1)
		{
			WebElement fM = driver.findElement(By.xpath("//div[contains(@class,'first')]//div//div[@class='title']//span[1]"));
			WebElement sM = driver.findElement(By.xpath("//div[contains(@class,'last')]//div//div[@class='title']//span[1]"));
			String[] trimFirMon = fM.getText().split(" ");
			String firstMonth = trimFirMon[0].toLowerCase();
			String[] trimSecMon = sM.getText().split(" ");
			String secondMonth = trimSecMon[0].toLowerCase();
			if((firstMonth.contains(mon)) || (secondMonth.contains(mon)))
			{
				firMon = firstMonth;
				secMon = secondMonth;
				i=0;
			}
			else
			{
				driver.findElement(By.xpath("//div[contains(@class,'last')]//div[@class='header']//a")).click();
			}
		
		}
		if(firMon.contains(mon))
		{
			List<WebElement> dates = driver.findElements(By.xpath("//div[contains(@class,'first')]//tbody//tr//td[@data-handler='selectDay']"));
			for(int j=0; j<dates.size();j++)
			{
				if(dates.get(j).getText().contains(day))
				{				
					dates.get(j).click();
				}
				else
				{
					continue;
				}
				dates = driver.findElements(By.xpath("//div[contains(@class,'first')]//tbody//tr//td[@data-handler='selectDay']"));
			}
		}
		if(secMon.contains(mon))
		{
			List<WebElement> dates = driver.findElements(By.xpath("//div[contains(@class,'last')]//tbody//tr//td[@data-handler='selectDay']"));
			for(int k=0; k<dates.size();k++)
			{
				if(dates.get(k).getText().contains(day))
				{				
						dates.get(k).click();
				}
				else
				{
					continue;
				}
				dates = driver.findElements(By.xpath("//div[contains(@class,'last')]//tbody//tr//td[@data-handler='selectDay']"));
			}	
		}
		
		
		
	}
	
}
