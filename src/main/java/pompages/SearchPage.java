package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BaseClass {

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "small-searchterms")
	private WebElement searchTextArea;

	@FindBy(xpath = "//input[@class='button-1 search-box-button']")
	private WebElement searchButton;

	public WebElement getSearchTextBox() {
		return searchTextArea;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	// business operation
	public void toSearchProductInDemoWebShop(String productName) {
		// searchTextArea.click();
		//searchTextArea.sendKeys(productName);
		//searchButton.click();

	}

}
