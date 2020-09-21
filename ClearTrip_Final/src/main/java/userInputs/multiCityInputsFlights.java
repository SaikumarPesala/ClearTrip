package userInputs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import resources.flightsInputsClass;

public class multiCityInputsFlights {
	public Properties prop;
	flightsInputsClass ic = new flightsInputsClass();
	public void multiCitySelection() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.load(fis);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String FromCity1, ToCity1, ToCity2, ToCity3, DepartOnDate1, DepartOnDate2, DepartOnDate3;
		System.out.println("Enter FromCity1: ");
		FromCity1 = sc.nextLine();
		prop.setProperty("FromCity1", FromCity1);
		System.out.println("Enter ToCity1: ");
		ToCity1 = sc.nextLine();
		prop.setProperty("ToCity1", ToCity1);
		System.out.println("Enter ToCity2: ");
		ToCity2 = sc.nextLine();
		prop.setProperty("ToCity2", ToCity2);
		System.out.println("Enter ToCity3: ");
		ToCity3 = sc.nextLine();
		prop.setProperty("ToCity3", ToCity3);
		System.out.println("Enter DepartOnDate1: ");
		DepartOnDate1 = sc.nextLine();
		prop.setProperty("DepartOnDate1", DepartOnDate1);
		System.out.println("Enter DepartOnDate2: ");
		DepartOnDate2 = sc.nextLine();
		prop.setProperty("DepartOnDate2", DepartOnDate2);
		System.out.println("Enter DepartOnDate3: ");
		DepartOnDate3 = sc.nextLine();
		prop.setProperty("DepartOnDate3", DepartOnDate3);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\PESALA\\eclipse-workspace\\ClearTrip_Final\\src\\main\\java\\resources\\inputs.properties");
		prop.store(fos, null);
	}
	public static void main(String[] args) throws IOException {
		multiCityInputsFlights mic = new multiCityInputsFlights();
		commonInputsFlights cInp = new commonInputsFlights();
		mic.multiCitySelection();
		cInp.comInputs();

	}
}
