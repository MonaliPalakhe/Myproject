package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
	WebDriver driver;
	Actions a;
    //Step 1:-
	@FindBy(xpath="//a[text()='Logout']")private WebElement log;
	@FindBy(xpath="//button[@class='close']")private WebElement close;
	
	//Constructor 
	public logout(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	     a=new Actions(driver);
	}
	
	//Method Creation
	public void log()
	{
      a.moveToElement(log).click().perform();

		}
	public void close()
	{
		close.click();
	}
	
	
	
}
