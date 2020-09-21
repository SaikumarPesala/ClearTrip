package flights;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.flightsInputsClass;

public class desiredInfants {
	flightsInputsClass ic = new flightsInputsClass();
	public WebDriver driver;

	public desiredInfants(WebDriver driver) {
		this.driver = driver;
	}

	By chil = By.xpath("//select[@id='Infants']");

	public WebElement infantClick() {
		return driver.findElement(chil);
	}

	public void desiredInfantsSelection() throws IOException {
		List<WebElement> desInfants = driver.findElements(By.xpath("//select[@id='Infants']//option"));
		for (int j = 0; j < desInfants.size(); j++) {
			String s = desInfants.get(j).getText();
			String obtInfant = ic.Infants();
			int x = Integer.parseInt(obtInfant);
			int n = 0;
			n = Integer.parseInt(s);
			if (n == x) {
				desInfants.get(j).click();
			}
		}
	}

}
