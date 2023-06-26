package Project.Webmath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Baseclass {

	public static WebDriver driver;
	public static Properties pr;   
	 
		
	
		public Baseclass(){
			try {
				FileInputStream fs = new FileInputStream("D:\\Automation_training\\Webmath\\src\\main\\java\\com\\until\\propertites\\config.properties");
				pr = new Properties();
				pr.load(fs);

				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		public static  void initialization() 
		{
		    ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
		    driver = new ChromeDriver(options);
			System.out.println("Launching  Chrome  browser ");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			;
			System.out.println("driver:::::" +driver);
			driver.get(pr.getProperty("url"));
			
			
		}
		
		public void xmathclick()
		{
			String x =pr.getProperty("xmath1");
			driver.findElement(By.xpath(x)).click();
			
			
		}

	



}
