import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPAge {
	
	
	WebDriver driver;
	
	By FirstName = By.name("firstName");
	By LastName = By.name("lastName");
	By Phone = By.name("phone");
	By UserName = By.name("userName");
	By Address = By.name("address1");
	By City= By.name("city");
	By State = By.name("state");
	By PostalCode = By.name("postalCode");
	By Email = By.name("email");
	By Password = By.name("password");
	By ComfirmPassword = By.name("confirmPassword");
	By Submit = By.name("submit");
	
	RegistrationPAge (WebDriver d)
	{
		driver=d;
	}
	
	public void sendFirstName(String fname)
	{
		driver.findElement(FirstName).sendKeys(fname);
	}
	
	public void sendLastName(String lname)
	{
		driver.findElement(LastName).sendKeys(lname);
	}
	
	public void sendPhoneNumber(String phone)
	{
		driver.findElement(Phone).sendKeys(phone);
	}
	
	public void sendUserName(String uname)
	{
		driver.findElement(UserName).sendKeys(uname);
	}
	
	public void sendAddress(String address)
	{
		driver.findElement(Address).sendKeys(address);
	}
	
	public void sendCity(String city)
	{
		driver.findElement(City).sendKeys(city);
	}
	
	public void sendState(String state)
	{
		driver.findElement(State).sendKeys(state);
	}
	
	public void sendPostalCode(String pcode)
	{
		driver.findElement(PostalCode).sendKeys(pcode);
	}
	
	public void sendEmail(String email)
	{
		driver.findElement(Email).sendKeys(email);
	}
	
	public void sendPassword(String password)
	{
		driver.findElement(Password).sendKeys(password);
	}
	
	public void sendconfirmPassword(String cpassword)
	{
		driver.findElement(ComfirmPassword).sendKeys(cpassword);
	}
	
	public void clickSubmit()
	{
		driver.findElement(Submit).click();
	}

}
