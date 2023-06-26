package Project.Webmath;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class otherStuff extends Baseclass{

public static Properties prstuff; 
	
	public otherStuff() { 
		
		
		FileInputStream fs4;
		try {
			fs4 = new FileInputStream("D:\\Automation_training\\Webmath\\src\\main\\java\\com\\until\\propertites\\stuff.properties");
			prstuff= new Properties();
			try {
				prstuff.load(fs4);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
	
	public void msys(String a, String b) 
	
	{	
		String x =prstuff.getProperty("xmath1");
		driver.findElement(By.xpath(x)).click();
		String ad =prstuff.getProperty("msystem");
		driver.findElement(By.xpath(ad)).click();
		String F1 =prstuff.getProperty("f1");
		driver.findElement(By.xpath(F1)).sendKeys(a);
		String  S1 =prstuff.getProperty("s1");
		driver.findElement(By.xpath(S1)).click();
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\otherstuff\\mertixsystem\\ss1.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String ret = prstuff.getProperty("return");
		driver.findElement(By.xpath(ret)).click();
		
		String F2 =prstuff.getProperty("f2");
		driver.findElement(By.xpath(F2)).sendKeys(b);
		String  S2 =prstuff.getProperty("s2");
		driver.findElement(By.xpath(S2)).click();
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\otherstuff\\mertixsystem\\ss2.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ret1 = prstuff.getProperty("return");
		driver.findElement(By.xpath(ret1)).click();
		
		String F3 =prstuff.getProperty("f3");
		driver.findElement(By.xpath(F3)).sendKeys(a);
		String  S3 =prstuff.getProperty("s3");
		driver.findElement(By.xpath(S3)).click();
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\otherstuff\\mertixsystem\\ss3.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ret3 = prstuff.getProperty("return");
		driver.findElement(By.xpath(ret3)).click();
		
		String F4 =prstuff.getProperty("f4");
		driver.findElement(By.xpath(F4)).sendKeys(b);
		String  S4 =prstuff.getProperty("s4");
		driver.findElement(By.xpath(S4)).click();
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\otherstuff\\mertixsystem\\ss4.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ret4 = prstuff.getProperty("return");
		driver.findElement(By.xpath(ret4)).click();
		
		String F5 =prstuff.getProperty("f5");
		driver.findElement(By.xpath(F5)).sendKeys(a);
		String  S5 =prstuff.getProperty("s5");
		driver.findElement(By.xpath(S5)).click();
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\otherstuff\\mertixsystem\\ss5.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ret5 = prstuff.getProperty("return");
		driver.findElement(By.xpath(ret5)).click();
		String F6 =prstuff.getProperty("f6");
		driver.findElement(By.xpath(F6)).sendKeys(b);
		String  S6=prstuff.getProperty("s6");
		driver.findElement(By.xpath(S6)).click();
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\otherstuff\\mertixsystem\\ss6.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ret6 = prstuff.getProperty("return");
		driver.findElement(By.xpath(ret6)).click(); 
		
		String F7 =prstuff.getProperty("f7");
		driver.findElement(By.xpath(F7)).sendKeys(a);
		String  S7 =prstuff.getProperty("s7");
		driver.findElement(By.xpath(S7)).click();
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\otherstuff\\mertixsystem\\ss7.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ret7 = prstuff.getProperty("return");
		driver.findElement(By.xpath(ret7)).click();
		
		String F8 =prstuff.getProperty("f8");
		driver.findElement(By.xpath(F8)).sendKeys(b);
		String  S8 =prstuff.getProperty("s8");
		driver.findElement(By.xpath(S8)).click();
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\otherstuff\\mertixsystem\\ss8.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ret8 = prstuff.getProperty("return");
		driver.findElement(By.xpath(ret8)).click();
		
		String F9 =prstuff.getProperty("f9");
		driver.findElement(By.xpath(F9)).sendKeys(a);
		String  S9 =prstuff.getProperty("s9");
		driver.findElement(By.xpath(S9)).click();
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\otherstuff\\mertixsystem\\ss9.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ret9 = prstuff.getProperty("return");
		driver.findElement(By.xpath(ret9)).click();

		String F10 =prstuff.getProperty("f10");
		driver.findElement(By.xpath(F10)).sendKeys(a);
		String  S10 =prstuff.getProperty("s10");
		driver.findElement(By.xpath(S10)).click();
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\otherstuff\\mertixsystem\\ss10.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ret10 = prstuff.getProperty("return");
		driver.findElement(By.xpath(ret10)).click();

		String F11 =prstuff.getProperty("f11");
		driver.findElement(By.xpath(F11)).sendKeys(a);
		String  S11 =prstuff.getProperty("s11");
		driver.findElement(By.xpath(S11)).click();
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\otherstuff\\mertixsystem\\ss11.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ret11 = prstuff.getProperty("return");
		driver.findElement(By.xpath(ret11)).click();
		
		String F12 =prstuff.getProperty("f12");
		driver.findElement(By.xpath(F12)).sendKeys(a);
		String  S12 =prstuff.getProperty("s12");
		driver.findElement(By.xpath(S12)).click();
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\otherstuff\\mertixsystem\\ss12.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ret12 = prstuff.getProperty("return");
		driver.findElement(By.xpath(ret12)).click();
		
	}
	
	public void rect (String w ,String h)
	{
		String x =prstuff.getProperty("xmath1");
		driver.findElement(By.xpath(x)).click();
		String ad =prstuff.getProperty("rect");
		driver.findElement(By.xpath(ad)).click();
		String wid =prstuff.getProperty("width");
		driver.findElement(By.xpath(wid)).sendKeys(w);
		String he =prstuff.getProperty("height");
		driver.findElement(By.xpath(he)).sendKeys(h);
		String Sele =prstuff.getProperty("sel1");
		WebElement item = driver.findElement(By.xpath(Sele));
		Select topicItemSelect = new Select(item);
		String Unit =prstuff.getProperty("unit1");
		topicItemSelect.selectByVisibleText(Unit);
		String  Submit =prstuff.getProperty("submit");
		driver.findElement(By.xpath(Submit)).click();
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\otherstuff\\rect\\rect.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void time(String ti)
	{
		String x =prstuff.getProperty("xmath1");
		driver.findElement(By.xpath(x)).click();
		String ad =prstuff.getProperty("stime");
		driver.findElement(By.xpath(ad)).click();
		String time =prstuff.getProperty("t");
		driver.findElement(By.xpath(time)).sendKeys(ti); 
		String Sele =prstuff.getProperty("sel");
		WebElement item = driver.findElement(By.xpath(Sele));
		Select topicItemSelect = new Select(item);
		String Unit =prstuff.getProperty("unit");
		topicItemSelect.selectByVisibleText(Unit);
		String  Submit =prstuff.getProperty("submit");
		driver.findElement(By.xpath(Submit)).click();
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\otherstuff\\time\\time.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
	public void com(String t)
	{
		String x =prstuff.getProperty("xmath1");
		driver.findElement(By.xpath(x)).click();
		String ad =prstuff.getProperty("mcombine");
		driver.findElement(By.xpath(ad)).click();
		String time =prstuff.getProperty("combine");
		driver.findElement(By.xpath(time)).sendKeys(t); 
		String  Submit =prstuff.getProperty("submit");
		driver.findElement(By.xpath(Submit)).click();
		try { 
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);											
			Files.copy(f1, new File("D:\\Automation_training\\Webmath\\Screenshot\\otherstuff\\combination\\combi.png"));
			//this.takeSnapShot(driver, ) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
	
}
