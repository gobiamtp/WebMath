package Project.Webmath;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FractionsTest extends Baseclass {
  
	Fractions fr;

	public FractionsTest() {
		super();
	}
	
	
	
	@BeforeMethod
	
	public void setUp(){
		initialization();
		fr = new Fractions();
		
	}
	
	@Test(priority=1)
	
  public  void fra()
	{
		fr.fract(pr.getProperty("bb"), pr.getProperty("aa"));
				
	}
	@Test(priority=2)
	
	  public  void Cfra()
		{
			
		fr.cfract(pr.getProperty("bb"), pr.getProperty("aa"),pr.getProperty("dd"), pr.getProperty("cc"));	
		}
	@AfterMethod
	public void close_browser(){
		driver.quit();
	}
	
}
