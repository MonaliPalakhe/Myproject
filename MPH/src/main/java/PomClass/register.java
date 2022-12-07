package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class register {
	//Step 1 :- global variable declaration 12 Field

	@FindBy(xpath="//a[text()='Register']")private WebElement reg;
	@FindBy(xpath="//input[contains(@name,'FirstName')]") private WebElement name; 
	@FindBy(xpath="//input[contains(@name,'txtMobileNo')]") private WebElement mobile; 
	@FindBy(xpath="//input[contains(@name,'txtEmailID')]") private WebElement email; 
	@FindBy(xpath="//input[contains(@name,'txtAddress')]") private WebElement address; 
	@FindBy(xpath="//select[contains(@name,'DDLBCountry')]") private WebElement country; 
	@FindBy(xpath="//select[contains(@name,'DDLBState')]") private WebElement state; 
	@FindBy(xpath="//input[contains(@name,'txtDistrict')]") private WebElement dist; 
	@FindBy(xpath="//input[contains(@name,'txtCity')]") private WebElement city; 
	@FindBy(xpath="//input[contains(@name,'txtPincode')]") private WebElement pincode; 
	@FindBy(xpath="//input[contains(@name,'txtPassword')]") private WebElement pass;
	@FindBy(xpath="//input[contains(@name,'txtConfirmPassword')]") private WebElement confPass;
	@FindBy(xpath="//input[contains(@name,'btnSubmit')]") private WebElement signUp;

	// step 2:- initialize variable using constructor
	public register(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Step 3 :- Method Creation
	public void regist() {reg.click();}

	public void fullName(){name.sendKeys("Sakshi");}
	public void mob(){mobile.sendKeys("9501021456");}
	public void eMail(){email.sendKeys("monalipalakhe@gmail.com");}
	public void add(){address.sendKeys("Peth NaiGoan");}
	public void state() {
		Select s=new Select(state);
		s.selectByVisibleText("Maharashtra");
	}
	public void country()
	{
		Select s=new Select(country);
		s.selectByVisibleText("India");
	}
	
	public void district(){dist.sendKeys("Pune");}
	public void ciTy(){city.sendKeys("Urulikanchan");}
	public void  pcode(){pincode.sendKeys("412110");}
	public void pwd() {pass.sendKeys("monali@10");}
	public void cpass() {confPass.sendKeys("monali@10");}
	
	
	public void signup() {signUp.click();}
	
	
	
	
}
