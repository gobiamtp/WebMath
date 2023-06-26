package Project.Webmath;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class Ratios extends Baseclass {
	
	public static Properties prratio;
	
public Ratios() { 
		
		
		FileInputStream fs2;
		try {
			fs2 = new FileInputStream("D:\\Automation_training\\Webmath\\src\\main\\java\\com\\until\\propertites\\Ratioxpath.properties");
			prratio= new Properties();
			try {
				prratio.load(fs2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

public void ratio (String a,String b,String c, String d,String e,String f)
{
	String x =prratio.getProperty("xmath1");
	driver.findElement(By.xpath(x)).click();
	
	String ad =prratio.getProperty("ratio");
	driver.findElement(By.xpath(ad)).click();

	String F1 =prratio.getProperty("f1");
	driver.findElement(By.xpath(F1)).sendKeys(a);
	String F2 =prratio.getProperty("f2");
	driver.findElement(By.xpath(F2)).sendKeys(b);
	String F3 =prratio.getProperty("f3");
	driver.findElement(By.xpath(F3)).sendKeys(c);
	String F4 =prratio.getProperty("f4");
	driver.findElement(By.xpath(F4)).sendKeys(d);
	String F5 =prratio.getProperty("f5");
	driver.findElement(By.xpath(F5)).sendKeys(e);
	String F6 =prratio.getProperty("f6");
	driver.findElement(By.xpath(F6)).sendKeys(f);
	
	String  Submit =prratio.getProperty("submit");
	driver.findElement(By.xpath(Submit)).click();
	
	try { 
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
		Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\ratio\\ratio.png"));
		//this.takeSnapShot(driver, ) ;
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
} 

public void Proportions(String a,String b,String c, String d)
{

	String x =prratio.getProperty("xmath1");
	driver.findElement(By.xpath(x)).click();
	
	String ad =prratio.getProperty("pro");
	driver.findElement(By.xpath(ad)).click();

	String F1 =prratio.getProperty("i");
	driver.findElement(By.xpath(F1)).sendKeys(a);
	String F2 =prratio.getProperty("i2");
	driver.findElement(By.xpath(F2)).sendKeys(b);
	String F3 =prratio.getProperty("i3");
	driver.findElement(By.xpath(F3)).sendKeys(c);
	String F4 =prratio.getProperty("i4");
	driver.findElement(By.xpath(F4)).sendKeys(d);
	
	
	String  Submit =prratio.getProperty("submit");
	driver.findElement(By.xpath(Submit)).click();
	
	try { 
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
		Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\ratio\\pro.png"));
		//this.takeSnapShot(driver, ) ;
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
}

}
