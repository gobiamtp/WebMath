package Project.Webmath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class launch extends Baseclass{
	xmath xm;
	
	
	
	public launch() {
		super();
	}
	
	
	
	@BeforeMethod
	
	public void setUp(){
		initialization();
		xm = new xmath();
		
	}

	
	 @Test(priority=2)
	public void  add()
	{
         String a =pr.getProperty("aa");
         System.out.println("the value  of  a is  "+a);
		 xm.add(pr.getProperty("aa"), pr.getProperty("bb"));
	
	}
	@Test(priority=3)
	public void  sub()
	{
		xm.sub(pr.getProperty("aa"), pr.getProperty("bb"));
	}
	@Test(priority=4)
	public void  mul()
	{
		xm.mul(pr.getProperty("cc"), pr.getProperty("dd"));
	}

	@Test(priority=5)
	public void  div()
	{
		xm.div(pr.getProperty("dd"), pr.getProperty("aa"));
	} 
	@Test(priority=6)
	public void  place()
	{
		xm.placenum(pr.getProperty("dd"));
	}  
	@Test(priority=7)
	public void  roun()
	{
		xm.round(pr.getProperty("f"));
	}  
	@Test(priority=8)
	public void  Eline()
	{
		xm.line(pr.getProperty("dd"));
	}  
	@Test(priority=9)
	public void  compare()
	{
		xm.comparenum(pr.getProperty("aa"),pr.getProperty("bb"));
	}  
	
	@AfterMethod
	public void close_browser(){
		driver.quit();
	}
	
}
