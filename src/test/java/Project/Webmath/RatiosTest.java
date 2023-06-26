package Project.Webmath;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RatiosTest extends Baseclass {
 
	Ratios r;
	public RatiosTest() {
		super();
	}
	
@BeforeMethod
	
	public void setUp(){
		initialization(); 
		r=new Ratios();
		}

@Test(priority=1)

public  void lTest()
	{
		r.ratio(pr.getProperty("g"), pr.getProperty("h"),pr.getProperty("aa"),pr.getProperty("bb"),pr.getProperty("cc"),pr.getProperty("dd"));
				
	}

@Test(priority=2)
public void  pro()
{
	r.Proportions(pr.getProperty("aa"),pr.getProperty("bb"),pr.getProperty("cc"),pr.getProperty("dd"));
}
@AfterMethod
public void close_browser(){
	driver.quit();
}

}
