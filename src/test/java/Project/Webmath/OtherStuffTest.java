package Project.Webmath;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OtherStuffTest extends Baseclass {

	otherStuff os;
	public OtherStuffTest() {
		super();
	}
	
	
	
	@BeforeMethod
	
	public void setUp(){
		initialization();
		os = new otherStuff();
		
	}
	@Test(priority=1)
	
  public  void lTest()
	{
		os.msys(pr.getProperty("aa"), pr.getProperty("bb"));
				
	} 
	
	 @Test(priority=2)
	public void rect()
	{
		 os.rect(pr.getProperty("dd"), pr.getProperty("h"));
	
	}
	 @Test(priority=3)
		public void  TIME()
		{
	        
		 os.time(pr.getProperty("aa"));
		}
	 @Test(priority=4)
		public void  com()
		{
		 os.com(pr.getProperty("aa"));
		
		}
	 @AfterMethod
		public void close_browser(){
			driver.quit();
		}
		
}
