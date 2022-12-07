package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class books {
	@FindBy(xpath="//a[text()='Books']")private WebElement books;
	@FindBy(xpath="//a[text()='Original Marathi']") private  WebElement marBooks;
	@FindBy(xpath="(//a[@title='Add to cart'])[1]") private WebElement first;
	@FindBy(xpath="(//a[@title='Add to cart'])[10]") private WebElement second;
	public  WebDriver driver;

	//Step 2 :- Initialize variable in Constructor
	public books(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//step 3 :- Method Creation
	public void book()
	{
   books.click();
	}
	public void mBook()
	{
	marBooks.click();
	}
	public void first(){first.click();}
	public void second(){second.click();}

}
