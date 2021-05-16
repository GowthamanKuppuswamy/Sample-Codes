import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage2 {

WebDriver driver;
	
	@FindBy(how = How.NAME, using = "firstName")
	WebElement FirstName;
	
	@FindBy(how = How.NAME, using = "lastName")
	WebElement LastName;
	
    @FindBy(name ="phone")
    WebElement Phone;
    
	@FindBy(name = "userName" )
    WebElement UserName;
	
	@FindBy(name = "address1" )
    WebElement Address;
	
	@FindBy(name = "city" )
    WebElement City;
	
	@FindBy(name = "state" )
    WebElement State;
	
	@FindBy(name = "postalCode" )
    WebElement PostalCode;
	
	@FindBy(name = "email" )
    WebElement Email;
	
	@FindBy(name = "password" )
    WebElement Password;
	
	@FindBy(name = "confirmPassword" )
    WebElement ComfirmPassword;
	
	
	@FindBy(name = "submit" )
    WebElement Submit;
	
	RegistrationPage2 (WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void sendFirstName(String fname)
	{
		FirstName.sendKeys(fname);
	}
	
	public void sendLastName(String lname)
	{
	    (LastName).sendKeys(lname);
	}
	
	public void sendPhoneNumber(String phone)
	{
		(Phone).sendKeys(phone);
	}
	
	public void sendUserName(String uname)
	{
		(UserName).sendKeys(uname);
	}
	
	public void sendAddress(String address)
	{
		(Address).sendKeys(address);
	}
	
	public void sendCity(String city)
	{
		(City).sendKeys(city);
	}
	
	public void sendState(String state)
	{
		(State).sendKeys(state);
	}
	
	public void sendPostalCode(String pcode)
	{
		(PostalCode).sendKeys(pcode);
	}
	
	public void sendEmail(String email)
	{
		(Email).sendKeys(email);
	}
	
	public void sendPassword(String password)
	{
		(Password).sendKeys(password);
	}
	
	public void sendconfirmPassword(String cpassword)
	{
		(ComfirmPassword).sendKeys(cpassword);
	}
	
	public void clickSubmit()
	{
		(Submit).click();
	}

}
