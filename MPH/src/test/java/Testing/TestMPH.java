package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClass.logout;
import PomClass.register;
import PomClass.signIn;

public class TestMPH {
	WebDriver driver;
	register r;
	signIn sign;
	logout log;
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.mehtapublishinghouse.com");
		r=new register(driver);
		r.regist();
		r.fullName();
		r.mob();
		r.eMail();
		r.add();
		r.country();
		r.district();
		r.ciTy();
		r.pcode();
		r.pwd();
		r.cpass();
		r.state();
		r.signup();
		
		
		
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		
		sign=new signIn(driver);
       // sign.pop();
        sign.sign();
        sign.uNM();
        sign.pass();
        sign.Login();
	}
	
	@Test
	public void test1()
	{
		System.out.println("My Project");
		
	}
	@AfterMethod
	public void afterMethod()
	{
		sign=new signIn(driver);
	       sign.pop();
	 log=new logout(driver);	
	 log.log();
	 log.close();
	}
	@AfterClass
	public void afterClass()
	{
		driver.close();
	}
	}
	

