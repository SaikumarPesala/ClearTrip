package flights;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchButton {
	public WebDriver driver;
	public searchButton(WebDriver driver)
	{
		this.driver = driver;
	}
	By srcBut = By.id("SearchBtn");
	
	public WebElement srcButton()
	{
		return driver.findElement(srcBut);
	}
}
