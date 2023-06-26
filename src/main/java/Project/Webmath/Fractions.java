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

public class Fractions extends Baseclass{  
	
	public static Properties prfra; 
	
	
public Fractions() { 
		
		
		FileInputStream fs3;
		try {
			fs3 = new FileInputStream("D:\\Automation_training\\Webmath\\src\\main\\java\\com\\until\\propertites\\fractions.properties");
			prfra= new Properties();
			try {
				prfra.load(fs3);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
	
	public void fract (String a, String b)  
	
	{	
		
		String x =prfra.getProperty("xmath1");
		driver.findElement(By.xpath(x)).click();
		String ad =prfra.getProperty("fract");
		driver.findElement(By.xpath(ad)).click();
	
		String F1 =prfra.getProperty("f1");
		
		driver.findElement(By.xpath(F1)).sendKeys(a);
		String F2 =prfra.getProperty("f2");
		
		driver.findElement(By.xpath(F2)).sendKeys(b);
		String  Submit =prfra.getProperty("submit");
		driver.findElement(By.xpath(Submit)).click();
		
		
		
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\fractions\\fraction.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
	}

	public void cfract (String a, String b,String c, String d)  
	
	{	
		
		String x =prfra.getProperty("xmath1");
		driver.findElement(By.xpath(x)).click();
		String ad =prfra.getProperty("cfract");
		driver.findElement(By.xpath(ad)).click();
		
		String F1 =prfra.getProperty("cf1");
		driver.findElement(By.xpath(F1)).sendKeys(a);
		String F2 =prfra.getProperty("cf2");
		driver.findElement(By.xpath(F2)).sendKeys(b);
		String F3 =prfra.getProperty("cf3");
		driver.findElement(By.xpath(F3)).sendKeys(c);
		String F4 =prfra.getProperty("cf4");
		driver.findElement(By.xpath(F4)).sendKeys(d);
		String  Submit =prfra.getProperty("submit");
		driver.findElement(By.xpath(Submit)).click();
		
		
		
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\fractions\\comparefraction.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
	}
	

}
