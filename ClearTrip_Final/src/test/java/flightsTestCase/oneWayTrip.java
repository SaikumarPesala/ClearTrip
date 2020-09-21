package flightsTestCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import flights.*;
import resources.baseClass;
import resources.flightsInputsClass;


public class oneWayTrip extends baseClass{
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
		desiredOneWay dTravel = new desiredOneWay(driver);
		dTravel.selectOneWay().click();
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
	public void e_DepartDate() throws IOException
	{
		desiredDateOneWay dDate = new desiredDateOneWay(driver);
		dDate.desDateSel();
	}@Test
	public void f_Adults() throws IOException
	{
		desiredChildrens dChild = new desiredChildrens(driver);
		dChild.childClick();
		dChild.desiredChildSelection();
	}@Test
	public void g_Infants() throws IOException
	{
		
		desiredInfants dInf = new desiredInfants(driver);
		dInf.infantClick();
		dInf.desiredInfantsSelection();
	}@Test
	public void h_Options()
	{
		moreOptions mOpt = new moreOptions(driver);
		mOpt.optLink().click();
	}@Test
	public void i_Class() throws IOException
	{
		desiredClass dCla = new desiredClass(driver);
		dCla.classClick();
		dCla.classSelection();
	}
	
}
