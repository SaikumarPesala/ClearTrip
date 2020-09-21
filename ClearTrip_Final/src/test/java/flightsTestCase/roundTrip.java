package flightsTestCase;

import java.io.IOException;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import flights.*;
import resources.baseClass;
import resources.flightsInputsClass;

public class roundTrip extends baseClass{
	public WebDriver driver;
	flightsInputsClass ic = new flightsInputsClass();
	@Test
	public void a_URL() throws IOException
	{
		driver = initialiseDriver();
		driver.get(ic.URL());
	}
	@Test
	public void b_travelType()
	{
		desiredRoundTrip dTravel = new desiredRoundTrip(driver);
		dTravel.selectRoundTrip().click();
	}
	@Test
	public void c_Source() throws IOException
	{
		desiredSource dsrc = new desiredSource(driver);
		dsrc.srcFinder().click();
		dsrc.srcFinder().sendKeys(ic.desSrcThreeWords());
		dsrc.desSrc();
	}@Test
	public void d_Destination() throws IOException
	{
		desiredDestination ddest = new desiredDestination(driver);
		ddest.destFinder().click();
		ddest.destFinder().sendKeys(ic.desDestThreeWords());
		ddest.desiredDesti();
	}@Test
	public void e_DepartDate() throws IOException, InterruptedException
	{
		desiredDepartDateRoundTrip dDepart = new desiredDepartDateRoundTrip(driver);
		try {
			dDepart.desDepartDateSel();
		} catch (StaleElementReferenceException e1) {
			// TODO Auto-generated catch block
			System.out.println(" ");
		}
	}@Test
	public void f_ReturnDate() throws IOException
	{
		desiredReturnDateRoundTrip dReturn = new desiredReturnDateRoundTrip(driver);
		dReturn.desReturnDateSel();
	}@Test
	public void g_Adults() throws IOException
	{
		desiredAdults dAdul = new desiredAdults(driver);
		dAdul.clickAdult();
		dAdul.desAdults();
	}@Test
	public void h_Childrens() throws IOException
	{
		desiredChildrens dChild = new desiredChildrens(driver);
		dChild.childClick();
		dChild.desiredChildSelection();
	}@Test
	public void i_Infants() throws IOException
	{
		
		desiredInfants dInf = new desiredInfants(driver);
		dInf.infantClick();
		dInf.desiredInfantsSelection();
	}@Test
	public void j_Options()
	{
		moreOptions mOpt = new moreOptions(driver);
		mOpt.optLink().click();
	}@Test
	public void k_Class() throws IOException
	{
		desiredClass dCla = new desiredClass(driver);
		dCla.classClick();
		dCla.classSelection();
	}
}
