package flightsTestCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import flights.*;
import resources.baseClass;
import resources.flightsInputsClass;

public class multiCity extends baseClass{
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
		desiredTravelTypeMultiCity dTravel = new desiredTravelTypeMultiCity(driver);
		dTravel.selectMultiCity().click();
	}@Test
	public void c_fromCityOne() throws IOException {
		fromCity1MultiCity fc1 = new fromCity1MultiCity(driver);
		fc1.desiredFromOne().click();
		fc1.desiredFromOne().sendKeys(ic.fromCity1ThreeWords());
		fc1.desiredFromCityOne();
	}@Test
	public void d_toCityOne() throws IOException
	{
		toCity1MultiCity tc1 = new toCity1MultiCity(driver);
		tc1.toCityOneClick().click();
		tc1.toCityOneClick().sendKeys(ic.toCity1ThreeWords());
		tc1.desiredToCityOne();
		
	}@Test
	public void e_date1() throws IOException
	{
		date1MultiCity d1 = new date1MultiCity(driver);
		d1.date1Select();
	}@Test
	public void f_fromCityTwo()
	{
		fromCity2MultiCity fc2 = new fromCity2MultiCity(driver);
		fc2.desiredFromTwo().click();
	}@Test
	public void g_toCityTwo() throws IOException
	{
		toCity2MultiCity tc2 = new toCity2MultiCity(driver);
		tc2.toCityTwoClick().click();
		tc2.toCityTwoClick().sendKeys(ic.toCity2ThreeWords());
		tc2.desiredToCityTwo();
	}@Test
	public void h_date2() throws IOException
	{
		date2MultiCity d2 = new date2MultiCity(driver);
		d2.date2Select();
	}@Test
	public void i_fromCityThree()
	{
		fromCity3MultiCity fc3 = new fromCity3MultiCity(driver);
		fc3.desiredFromThree().click();
	}@Test
	public void j_toCityThree() throws IOException
	{
		toCity3MultiCity tc3 = new toCity3MultiCity(driver);
		tc3.toCityThreeClick().click();
		tc3.toCityThreeClick().sendKeys(ic.toCity3ThreeWords());
		tc3.desiredToCityThree();
	}@Test
	public void k_date3() throws IOException
	{
		date3MultiCity d3 = new date3MultiCity(driver);
		d3.date3Select();
	}@Test
	public void l_adults() throws IOException
	{
		desiredAdults dAd = new desiredAdults(driver);
		dAd.clickAdult();
		dAd.desAdults();
	}@Test
	public void m_children() throws IOException
	{
		desiredChildrens dChild = new desiredChildrens(driver);
		dChild.childClick();
		dChild.desiredChildSelection();		
	}@Test
	public void n_infants() throws IOException
	{
		desiredInfants dInf = new desiredInfants(driver);
		dInf.infantClick();
		dInf.desiredInfantsSelection();
	}@Test
	public void o_classMode() throws IOException
	{
		desiredClass dClass = new desiredClass(driver);
		dClass.classClick();
		dClass.classSelection();
	}
}
