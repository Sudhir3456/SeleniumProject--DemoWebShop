package TestScript;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericlib.BaseTest;
import pompages.ProductPage;

public class DisplayProductBasedOnConditions extends BaseTest {

	// Printing titles & prices using for..each loop

	@Test(description = "Printing titles & prices using for..each loop")
	public void printProductPrice() {

		ProductPage pp = new ProductPage(driver);

		List<WebElement> prodTitles = driver.findElements(By.xpath("//h2[@class='product-title']"));
		List<WebElement> prodPrices = driver.findElements(By.xpath("//div[@class='prices']"));

		Map<String, Double> products_map = new HashMap<String, Double>();

		for (int i = 0; i < prodTitles.size(); i++) {
			String title = prodTitles.get(i).getText();
			double price = Double.parseDouble(prodPrices.get(i).getText());

			products_map.put(title, price);

		}
		// Printing titles & prices using for..each loop
		System.out.println("**** Printing titles & prices using for..each loop**** ");

		for (Map.Entry<String, Double> entry : products_map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		// Printing titles & prices using Hashmap .forEach() & Lamda expression
		System.out.println("**** Printing titles & prices using lamda expression**** ");

		products_map.forEach((t, p) -> System.out.println(t + " : " + p));

		// find product whose price is greater than 800 (for..each loop)
		System.out.println("**** Product price is > 800 ****");
		for (Map.Entry<String, Double> entry : products_map.entrySet()) {
			if (entry.getValue() > 800) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}

		// find product whose price is greater than 800 (Process using filter)
		System.out.println("**** Product price is > 800 using filer & lambda ****");
		products_map.entrySet().stream().filter(e -> e.getValue() > 800).forEach(v -> System.out.println(v));

	}

}
