 package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.Flib;
import pompages.SigninPage;
import pompages.WelcomePage;

public class InvalidLoginTest extends BaseTest {

	@DataProvider(name = "TestData")
	public Object[][] invalidData() throws EncryptedDocumentException, IOException {
		return Flib.readExcel(EXCEL_PATH, INVALIDATA);

	}

	@Test(dataProvider = "TestData", groups = "ST")
	public void invalidLogin(String username, String password) {
		// click on login link
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		// sign in
		SigninPage sip = new SigninPage(driver);
		sip.toInvalidSignInDemoWeb(username, password);
	}

} 