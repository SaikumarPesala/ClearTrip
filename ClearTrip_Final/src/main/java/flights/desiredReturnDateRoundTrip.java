package flights;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.flightsInputsClass;

public class desiredReturnDateRoundTrip {
	public WebDriver driver;
	flightsInputsClass ic = new flightsInputsClass();
	public desiredReturnDateRoundTrip(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void desReturnDateSel() throws IOException
	{
		String retfirMon=null,retsecMon=null;
		String fuDate = ic.ReturnOnDate();
		String[] sepDate1 = fuDate.split(" ");
		String retday=sepDate1[0];
		String retmon=sepDate1[1].toLowerCase();
		int i=1;
		while(i==1)
		{
			WebElement fM = driver.findElement(By.xpath("//div[contains(@class,'first')]//div//div[@class='title']//span[1]"));
			WebElement sM = driver.findElement(By.xpath("//div[contains(@class,'last')]//div//div[@class='title']//span[1]"));
			String[] trimFirMon = fM.getText().split(" ");
			String firstMonth = trimFirMon[0].toLowerCase();
			String[] trimSecMon = sM.getText().split(" ");
			String secondMonth = trimSecMon[0].toLowerCase();
			if((firstMonth.contains(retmon)) || (secondMonth.contains(retmon)))
			{
				retfirMon = firstMonth;
				retsecMon = secondMonth;
				i=0;
			}
			else
			{
				driver.findElement(By.xpath("//div[contains(@class,'last')]//div[@class='header']//a")).click();
			}
		
		}
		if(retfirMon.contains(retmon))
		{
			List<WebElement> dates = driver.findElements(By.xpath("//div[contains(@class,'first')]//tbody//tr//td[@data-handler='selectDay']"));
			for(int j=0; j<dates.size();j++)
			{
				if(dates.get(j).getText().contains(retday))
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
		if(retsecMon.contains(retmon))
		{
			List<WebElement> dates = driver.findElements(By.xpath("//div[contains(@class,'last')]//tbody//tr//td[@data-handler='selectDay']"));
			for(int k=0; k<dates.size();k++)
			{
				if(dates.get(k).getText().contains(retday))
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
