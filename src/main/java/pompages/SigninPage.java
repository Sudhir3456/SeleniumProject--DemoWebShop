 package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPage extends BaseClass {

	public SigninPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	@FindBy(xpath ="//input[@value='Log in']")
	private WebElement loginButton;
	
	
	@FindBy(xpath ="//a[text()='Log out']")
	private WebElement logoutLink;

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//business operation
	public void toSignInDemoWeb(String email,String password)
	{
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
	

	//business operation
	public void toInvalidSignInDemoWeb(String email,String password)
	{
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		loginButton.click();
		emailTextField.clear();
	}
	

}