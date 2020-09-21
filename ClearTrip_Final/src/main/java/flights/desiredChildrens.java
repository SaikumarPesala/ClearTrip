package flights;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.flightsInputsClass;

public class desiredChildrens {
	flightsInputsClass ic = new flightsInputsClass();
	public WebDriver driver;

	public desiredChildrens(WebDriver driver) {
		this.driver = driver;
	}

	By chil = By.xpath("//select[@id='Childrens']");

	public WebElement childClick() {
		return driver.findElement(chil);
	}

	public void desiredChildSelection() throws IOException {
		List<WebElement> desChilds = driver.findElements(By.xpath("//select[@id='Childrens']//option"));
		for (int j = 0; j < desChilds.size(); j++) {
			String s = desChilds.get(j).getText();
			String obtAdult = ic.Children();
			int x = Integer.parseInt(obtAdult);
			int n = 0;
			n = Integer.parseInt(s);
			if (n == x) {
				desChilds.get(j).click();
			}
		}
	}

}
