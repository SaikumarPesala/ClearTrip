package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class flightsInputsClass {
	
	
	public Properties prop;
	
	public String URL() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("URL");
		
	}
	public String browser() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("browser");
	}
	public String source() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("desSource");
	}
	public String desti() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("desDest");
	}
	public String desDestThreeWords() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		String threeWords = null;
		String obtDest = prop.getProperty("desDest");
		if (obtDest.length() > 3) 
		{
			threeWords = obtDest.substring(0, 3);
		} 
		return threeWords;
	}
	public String desSrcThreeWords() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		String threeWords=null;
		String obtSrc = prop.getProperty("desSource");
		if (obtSrc.length() > 3) 
		{
			threeWords = obtSrc.substring(0, 3);
		} 
		return threeWords;
	}
	public String fulldate() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("fullOneWayDate");
	}
	public String Adults() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("Adults");
	}
	public String Children() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("Children");
	}
	public String Infants() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("Infants");
	}
	public String Class() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("class");
	}
	public String Type() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("desiredtype");
	}
	public String DepartOnDate() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("DepartOnDate");
	}
	public String ReturnOnDate() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("ReturnOnDate");
	}
	public String FromCity1() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("FromCity1");
	}
	public String ToCity1() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		String oneCity, finalCity;
		oneCity = prop.getProperty("ToCity1");
		finalCity = oneCity;
		return finalCity;
	}
	public String ToCity2() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("ToCity2");
	}
	public String ToCity3() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("ToCity3");
	}
	public String DepartOnDate1() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("DepartOnDate1");
	}
	public String DepartOnDate2() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("DepartOnDate2");
	}
	public String DepartOnDate3() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		return prop.getProperty("DepartOnDate3");
	}
	public String fromCity1ThreeWords() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		String threeWords=null;
		String obtSrc = prop.getProperty("FromCity1");
		if (obtSrc.length() > 3) 
		{
			threeWords = obtSrc.substring(0, 3);
		} 
		return threeWords;
	}
	public String toCity1ThreeWords() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		String threeWords=null;
		String obtSrc = prop.getProperty("ToCity1");
		if (obtSrc.length() > 3) 
		{
			threeWords = obtSrc.substring(0, 3);
		} 
		return threeWords;
	}
	public String toCity2ThreeWords() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		String threeWords=null;
		String obtSrc = prop.getProperty("ToCity2");
		if (obtSrc.length() > 3) 
		{
			threeWords = obtSrc.substring(0, 3);
		} 
		return threeWords;
	}
	public String toCity3ThreeWords() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		String threeWords=null;
		String obtSrc = prop.getProperty("ToCity3");
		if (obtSrc.length() > 3) 
		{
			threeWords = obtSrc.substring(0, 3);
		} 
		return threeWords;
	}

}
