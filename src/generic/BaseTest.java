package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest implements IConstants{
	public static WebDriver driver;
		
		static {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
		}
		
		@BeforeTest
		public void openApp() {
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(APP_URL);
		}
		
		@AfterMethod
		public void screenshot(ITestResult itr) {
			String name = itr.getName();
			int status = itr.getStatus();
			if(status==1) {
				Reporter.log("Test "+name+" is PASS",true);
			}
			else {
				Reporter.log("Test "+name+" is FAIL/SKIP",true);
				AutoLib.getPhoto(driver,IMG_PATH+name+".png");			
			}
		}
		
		@AfterTest
		public void closeApp() {
			driver.close();
		}
}
