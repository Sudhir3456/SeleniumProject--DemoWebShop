package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericlib.BaseTest;
import pompages.SearchPage;

public class SearchTest extends BaseTest {

	@Test(description = "Verify the user is able to Search The Products or not")
	public void searchProductTestScript() throws EncryptedDocumentException, IOException {

		SearchPage sp = new SearchPage(driver);
		WebElement searchBox = sp.getSearchTextBox();
		searchBox.sendKeys("Science");
		
		WebElement searchButton = sp.getSearchButton();
		searchButton.click();
		
		
		//sp.toSearchProductInDemoWebShop("Science");

		SearchTest st = new SearchTest();
		//st.searchProductTestScript();

	}

}
