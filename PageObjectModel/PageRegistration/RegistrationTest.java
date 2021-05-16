import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//RegistrationPAge RPobject = new RegistrationPAge (driver);
		RegistrationPage2 RPobject = new RegistrationPage2 (driver);
		
		Thread.sleep(10000);
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		RPobject.sendFirstName("Gow");
		RPobject.sendLastName("Kup");
		RPobject.sendPhoneNumber("2423434");
		RPobject.sendUserName("gow");
		RPobject.sendAddress("2 wfwewf");
		RPobject.sendCity("dfv");
		RPobject.sendState("dvdsv");
		RPobject.sendPostalCode("vdsv22");
		RPobject.sendEmail("e2we");
		RPobject.sendPassword("abc");
		RPobject.sendconfirmPassword("abc");
		RPobject.clickSubmit();
		
		if(driver.getPageSource().contains("Thank you for registering"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
	}

}
