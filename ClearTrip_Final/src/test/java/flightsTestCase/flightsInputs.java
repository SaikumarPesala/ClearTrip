package flightsTestCase;

import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

import userInputs.*;
public class flightsInputs {
	@Test
	public String a_selection()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String desiredTravelType;
		System.out.println("Travel type options: 1.OneWay, 2.RoundTrip and 3.MultiCity");
		System.out.println("Enter travel type: ");
		desiredTravelType=sc.nextLine();
		return desiredTravelType;
	}
	@Test
	public void b_userInputs() throws IOException {
		flightsInputs atc = new flightsInputs();
		String trType = atc.a_selection().toLowerCase();
		if(trType.contains("oneway"))
		{
			onewayInputFlights.main(null);
		}
		else if(trType.contains("roundtrip"))
		{
			roundTripInputFlights.main(null);
		}
		else if(trType.contains("multicity"))
		{
			multiCityInputsFlights.main(null);
		}
		else {
			System.out.println("----User entered Incorrect travel type----");
			System.out.println("----Please refer to Travel type options menu and enter correct travel type----");
		}

	}

}
