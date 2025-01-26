 package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BaseClass {

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;

	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;

	@FindBy(id = "LastName")
	private WebElement lastNameTextField;

	@FindBy(id = "Email")
	private WebElement emailTextField;

	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextField;

	@FindBy(id = "register-button")
	private WebElement registerButton;

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	// business operation
	public void toRegisterInDemoWebShop(String fn, String ln, String email, String pwd) {
		maleRadioButton.click();
		firstNameTextField.sendKeys(fn);
		lastNameTextField.sendKeys(ln);
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(pwd);
		confirmPasswordTextField.sendKeys(pwd);
		registerButton.click();
	}

}