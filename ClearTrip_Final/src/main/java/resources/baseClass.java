package resources;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseClass {
	
	public WebDriver driver; 
	public  WebDriver initialiseDriver() throws IOException
	{
		flightsInputsClass ic = new flightsInputsClass();
		String bro = ic.browser();
		if(bro.contains("chrome"))
		{
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver",
					"F:\\other\\Softwares\\Selenium WebDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(co);
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void getScreenshot(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File seliniumFile = ts.getScreenshotAs(OutputType.FILE);
		String destPath = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(seliniumFile, new File(destPath));
	}
	
}
