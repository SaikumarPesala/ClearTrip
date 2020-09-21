package userInputs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import resources.flightsInputsClass;

public class commonInputsFlights {
	public Properties prop;
	flightsInputsClass ic = new flightsInputsClass();
	public void comInputs() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String Infants,Adults,Children,classtype;
		System.out.println("Enter Adults: ");
		Adults = sc.nextLine();
		prop.setProperty("Adults", Adults);
		System.out.println("Enter Children: ");
		Children = sc.nextLine();
		prop.setProperty("Children", Children);
		System.out.println("Enter Infants: ");
		Infants = sc.nextLine();
		prop.setProperty("Infants", Infants);
		System.out.println("Enter classtype: ");
		classtype = sc.nextLine();		
		prop.setProperty("class", classtype);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.store(fos, null);
		
	}
	
}
