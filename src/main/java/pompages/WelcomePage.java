 package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class WelcomePage extends BaseClass {

	public WelcomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerLink;

	public WebElement getRegisterLink() {
		return registerLink;
	}
	
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	public WebElement getLoginLink() {
		return loginLink;
	}
	
	//@FindBys({@FindBy(id ="",name = ""))
	
	
//	mvn clean
//	mvn validats
//	mvn compile
//	mvn test
//	
	// if i want to run 
	
	
	
	
	
	

}