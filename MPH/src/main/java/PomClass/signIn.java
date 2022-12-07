package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signIn {

	//Step 1 :- Declare variables globally
	@FindBy(xpath="//button[@class='close']")private WebElement pop;
	@FindBy(xpath="//a[text()='Sign In']") private WebElement signIn;
	@FindBy(xpath="//input[@placeholder='Username']")private WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement password;
	@FindBy(xpath="//input[@value='Login']")private WebElement login;
	//Step 2 :- Initialize Variables in Conctructor
	public signIn(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Step 3 :- Method Creation 
	public void pop() {
		pop.click();
	}
	
	
	
	 public void sign()
	{
	  signIn.click();
	}

	 public void uNM()
	{
	  username.sendKeys("webadmin@mehtapublishinghouse.com");
	}

	 public void pass()
	{
	  password.sendKeys("PASSWORD@123");

	}
	public void Login()
	{
	login.click();
	}






}
