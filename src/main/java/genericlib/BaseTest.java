package genericlib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

/**
 * @author Sudhir Kumar Yadav
 */

public class BaseTest implements IAutoConstant {

	public WebDriver driver;     //its for paralel execute
	public static WebDriver sdriver;   // it is for lisi

	@AfterSuite(alwaysRun = true)
	public void toConnectServer() {
		Reporter.log("server closed successfully", true);
	}

	@BeforeTest(alwaysRun = true)
	public void toConnectDatabase() {
		Reporter.log("Database connected successfully", true);
	}

	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void toLaunchBrowser(@Optional("chrome") String browser) throws IOException {

		// String browser = Flib.getDataFromProperty(PROP_PATH, "browser");
		String url = Flib.getDataFromProperty(PROP_PATH, "url");
		Reporter.log("Launching " + browser + " successfully", true);
		if (browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if (browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver(); 
		else
			Reporter.log("Invalid Browser");
		sdriver = driver;   // here re inilized non static driver for parallel executations
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECONDS));
		driver.get(url);
	}

	@AfterClass(alwaysRun = true)
	public void toCloseBrowser() {
		driver.quit();
		Reporter.log("Browser closed successfully", true);
	}

	@AfterTest(alwaysRun = true)
	public void toCloseDatabase() {
		Reporter.log("database closed sucessfully", true);
	}

	@BeforeSuite(alwaysRun = true)
	public void toCloseServer() {
		Reporter.log("Server connected successfully", true);
	}

}