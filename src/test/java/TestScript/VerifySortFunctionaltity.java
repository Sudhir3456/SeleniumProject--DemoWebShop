package TestScript;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericlib.BaseTest;
import pompages.ProductPage;

public class VerifySortFunctionaltity extends BaseTest {

	// @Test
	@Test(description = "Verify the Sort functionality of The applications")
	public void printProductPrice() {

		ProductPage pp = new ProductPage(driver);
		pp.getBookLink().click();
		WebElement sortBydrp = pp.getSortByDropDown();

		Select sortbydrp = new Select(sortBydrp);
		// Select sortbydrp = new Select(driver.findElement(By.id("products-orderby")));

		sortbydrp.selectByVisibleText("Name: A to Z");

		List<WebElement> product_items = driver.findElements(By.xpath("//h2[@class='product-title']"));

		List<String> beforesort = product_items.stream().map(item -> item.getText()).collect(Collectors.toList());
		List<String> aftersort = product_items.stream().map(item -> item.getText()).sorted()
				.collect(Collectors.toList());

		System.out.println(beforesort);
		System.out.println(aftersort);

		if (beforesort.equals(aftersort))
			System.out.println("products displayed in Sorted Order");
		else
			System.out.println("products displayed in NOT Sorted Order");

	}

}
