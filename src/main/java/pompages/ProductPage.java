package pompages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BaseClass {

	public ProductPage(WebDriver driver) {
		super(driver);
     }

	@FindBy(xpath = "//ul[@class='top-menu']//a[normalize-space()='Books']")
	private WebElement bookLink;

	@FindBy(id = "products-orderby")
	private WebElement sortBydrplink;

	@FindBy(id = "products-pagesize")
	private WebElement displayBydrpLink;

	@FindBy(id = "products-viewmode")
	private WebElement viewAsdrpLink;

	@FindBy(xpath = "//h2[@class='product-title']")
	private List<WebElement> product_items;

	public WebElement getBookLink() {
		return bookLink;
	}

	public WebElement getSortByDropDown() {
		return sortBydrplink;
	}

	public WebElement getDisplayByDropDown() {
		return displayBydrpLink;
	}

	public WebElement getViewAsDropDown() {
		return viewAsdrpLink;
	}

	public WebElement getProductItems() {
		return (WebElement) product_items;
	}

	// business operation
	public void toSearchProductDemoWeb() {

		bookLink.click();

	}

	
	
	
}
