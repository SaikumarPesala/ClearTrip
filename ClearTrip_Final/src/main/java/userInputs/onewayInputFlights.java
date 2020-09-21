package userInputs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import resources.flightsInputsClass;

public class onewayInputFlights {
	public Properties prop;
	flightsInputsClass ic = new flightsInputsClass();
	public void onewayselection() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String desSrc,desDest,desDate;
		System.out.println("Enter Source: ");
		desSrc = sc.nextLine();
		prop.setProperty("desSource", desSrc);
		System.out.println("Enter Destination: ");
		desDest = sc.nextLine();
		prop.setProperty("desDest", desDest);
		System.out.println("Enter Date: ");
		desDate = sc.nextLine();
		prop.setProperty("fullOneWayDate", desDate);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.store(fos, null);
		
	}
	public static void main (String[] args) throws IOException
	{
		onewayInputFlights oic = new onewayInputFlights();
		commonInputsFlights cInp = new commonInputsFlights();
		oic.onewayselection();
		cInp.comInputs();
	
		
	}

}
