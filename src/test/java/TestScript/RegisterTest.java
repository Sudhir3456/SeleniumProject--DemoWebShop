package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.CustomListener;
import genericlib.Flib;
import pompages.RegisterPage;
import pompages.WelcomePage;

@Listeners(CustomListener.class)
public class RegisterTest extends BaseTest {

	@Test(description = "Verify the user is able to register or not", groups = { "FT", "RT" })
	public void register() throws EncryptedDocumentException, IOException {
		// fetch the data from excel
		String fn = Flib.getDataFromExcel(EXCEL_PATH, REGSHEET, 1, 0);
		String ln = Flib.getDataFromExcel(EXCEL_PATH, REGSHEET, 1, 1);
		String email = Flib.getDataFromExcel(EXCEL_PATH, REGSHEET, 1, 2);
		String pwd = Flib.getDataFromExcel(EXCEL_PATH, REGSHEET, 1, 3);
		// click on register link
		WelcomePage wp = new WelcomePage(driver);
		wp.getRegisterLink().click();
		// fill all details
		RegisterPage rp = new RegisterPage(driver);
		rp.toRegisterInDemoWebShop(fn, ln, email, pwd);
	}

}
