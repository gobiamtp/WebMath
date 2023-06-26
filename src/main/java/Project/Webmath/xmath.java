package Project.Webmath;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.google.common.io.Files;


public class xmath extends Baseclass {
	   
	public static Properties prxpath;  
	//public static WebDriver driver;
	
	public static Properties prvalue; 
	
	public xmath() { 
		
		
		FileInputStream fs1;
		try {
			fs1 = new FileInputStream("D:\\Automation_training\\Webmath\\src\\main\\java\\com\\until\\propertites\\Xpath.properties");
			prxpath= new Properties();
			try {
				prxpath.load(fs1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
	
	public void add(String a, String b) 
	{	String x =prxpath.getProperty("xmath1");
		driver.findElement(By.xpath(x)).click();
		String ad =prxpath.getProperty("addd");
		driver.findElement(By.xpath(ad)).click();
	
		String F1 =prxpath.getProperty("f1");
		
		driver.findElement(By.xpath(F1)).sendKeys(a);
		String F2 =prxpath.getProperty("f2");
		
		driver.findElement(By.xpath(F2)).sendKeys(b);
		String  Submit =prxpath.getProperty("submit");
		driver.findElement(By.xpath(Submit)).click();
		System.out.println("Adding ");
		
		
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\numbers\\add1.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
	}
	
	public void sub(String a, String b) 
	{ 
		System.out.println("Sub");
		String x =prxpath.getProperty("xmath1");
		driver.findElement(By.xpath(x)).click();
		String su =prxpath.getProperty("sub");
		driver.findElement(By.xpath(su)).click();
        String F1 =prxpath.getProperty("f1");
		
		driver.findElement(By.xpath(F1)).sendKeys(a);
		String F2 =prxpath.getProperty("f2");
		
		driver.findElement(By.xpath(F2)).sendKeys(b);
		String  Submit =prxpath.getProperty("submit");
		driver.findElement(By.xpath(Submit)).click();
		try {
			takeSnapShot(driver, "D:\\Automation_training\\Webmath\\Screenshot\\numbers\\sub.png") ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
			
		
	}
	public void mul(String a, String b)
	{   
		System.out.println("mul");
		String x =prxpath.getProperty("xmath1");
		driver.findElement(By.xpath(x)).click();
		String mu =prxpath.getProperty("mul");
		driver.findElement(By.xpath(mu)).click();
         String F1 =prxpath.getProperty("f1");
		
		driver.findElement(By.xpath(F1)).sendKeys(a);
		String F2 =prxpath.getProperty("f2");
		
		driver.findElement(By.xpath(F2)).sendKeys(b);
		String  Submit =prxpath.getProperty("submit");
		driver.findElement(By.xpath(Submit)).click();
		String  SMUL =prxpath.getProperty("smul");
		/*try {
			//xmscroll.scroll(SMUL);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		try {
			takeSnapShot(driver, "D:\\Automation_training\\Webmath\\Screenshot\\numbers\\mul.png") ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void div(String a, String b)
	{   
		System.out.println("div");
		String x =prxpath.getProperty("xmath1");
		driver.findElement(By.xpath(x)).click();
		String dd =prxpath.getProperty("div");
		driver.findElement(By.xpath(dd)).click();
        String F1 =prxpath.getProperty("divf1");
		driver.findElement(By.xpath(F1)).sendKeys(a);
		String F2 =prxpath.getProperty("divf2");
		driver.findElement(By.xpath(F2)).sendKeys(b);
		String  Submit =prxpath.getProperty("submit");
		driver.findElement(By.xpath(Submit)).click();
	    
		try {
			this.takeSnapShot(driver, "D:\\Automation_training\\Webmath\\Screenshot\\numbers\\div.png") ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		
	}
	public void placenum(String a )
	{
		String x =prxpath.getProperty("xmath1");
		driver.findElement(By.xpath(x)).click();
		String dd =prxpath.getProperty("pvalue");
		driver.findElement(By.xpath(dd)).click();
        String F1 =prxpath.getProperty("pvalue1");		
		driver.findElement(By.xpath(F1)).sendKeys(a);
		String  Submit =prxpath.getProperty("submit");
		driver.findElement(By.xpath(Submit)).click();
		try {
			this.takeSnapShot(driver, "D:\\Automation_training\\Webmath\\Screenshot\\numbers\\Placenumber.png") ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void round(String a )
	{
		String x =prxpath.getProperty("xmath1");
		driver.findElement(By.xpath(x)).click();
		String dd =prxpath.getProperty("ro");
		driver.findElement(By.xpath(dd)).click();
        String F1 =prxpath.getProperty("ro1");		
		driver.findElement(By.xpath(F1)).sendKeys(a);
		String  Submit =prxpath.getProperty("submit");
		driver.findElement(By.xpath(Submit)).click();
		try {
			takeSnapShot(driver, "D:\\Automation_training\\Webmath\\Screenshot\\numbers\\round.png") ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void line(String a )
	{
		String x =prxpath.getProperty("xmath1");
		driver.findElement(By.xpath(x)).click();
		String dd =prxpath.getProperty("nline");
		driver.findElement(By.xpath(dd)).click();
        String F1 =prxpath.getProperty("eline");		
		driver.findElement(By.xpath(F1)).sendKeys(a);
		String  Submit =prxpath.getProperty("submit");
		driver.findElement(By.xpath(Submit)).click();
		try {
			takeSnapShot(driver, "D:\\Automation_training\\Webmath\\Screenshot\\numbers\\line.png") ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	} 
	public void comparenum(String a,String b )
	{
		String x =prxpath.getProperty("xmath1");
		driver.findElement(By.xpath(x)).click();
		String mu =prxpath.getProperty("compare");
		driver.findElement(By.xpath(mu)).click();
         String F1 =prxpath.getProperty("f1");
		
		driver.findElement(By.xpath(F1)).sendKeys(a);
		String F2 =prxpath.getProperty("f2");
		
		driver.findElement(By.xpath(F2)).sendKeys(b);
		String  Submit =prxpath.getProperty("submit");
		driver.findElement(By.xpath(Submit)).click();
		try {
			takeSnapShot(driver, "D:\\Automation_training\\Webmath\\Screenshot\\numbers\\comparenumbers.png") ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	} 
	
	
	public static  void takeSnapShot(WebDriver driver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		}

	
	

}
