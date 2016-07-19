
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.*;

//import components.ComboBox;


public class DirectLead {
	
	
	public static void main(String[] args) {
try {
	//Comment out unused browsers
	//LoginIE();
	//Chrome();
	LoginFirefox();
	
	
} 

catch (NoClassDefFoundError ex) {
    System.out.println(ex);
								}
							}
	
	


public static void LoginFirefox(){
	
	
File pathToBinary = new File("C:\\Users\\vsanoglu\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
FirefoxProfile firefoxProfile = new FirefoxProfile();       
WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
//driver.get("https://crmdevinternal.bupa.com.sa/BupaSIT/main.aspx?etn=lead&id=&pagetype=entityrecord");
driver.get("https://admin:admin@crmdevinternal.bupa.com.sa/BupaSIT/main.aspx?etn=lead&id=&pagetype=entityrecord");


}


public static void LoginIE(){

	String pathToie = "C:\\Program Files (x86)\\selenium-2.53.1\\IEDriverServer.exe";
	System.setProperty("webdriver.ie.driver", pathToie);
	WebDriver driver = new InternetExplorerDriver();
	driver.get("https://crmdevinternal.bupa.com.sa/BupaSIT/main.aspx?etn=lead&id=&pagetype=entityrecord");
	
	
	int ExecReturn = IeloginWithBat();
	if (ExecReturn==0){try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	
	//WebDriverWait wait = new WebDriverWait(driver, 200);
	System.out.println("i am here");
	WebDriverWait wait = new WebDriverWait(driver, 200);
	System.out.println("wait completed");
	 //WebElement element = driver.findElement(By.xpath("//[@id='bupa_lead_numberofmemberstobeinsured']/div[1]"));
	 WebElement element = driver.findElement(By.id("Expected Premium_label"));
		System.out.println(element.getText());
		
}


public static void Chrome(){
	
	String pathToBinary = "C:\\Program Files (x86)\\selenium-2.53.1\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",pathToBinary);
	WebDriver driver = new ChromeDriver();
	driver.get("https://crmdevinternal.bupa.com.sa/BupaSIT/main.aspx?etn=lead&id=&pagetype=entityrecord");
	
	
}
	
public static int IeloginWithBat(){

	try {
		
		
		Process process1 = new ProcessBuilder("C:\\Users\\vsanoglu\\Desktop\\autoitscript\\handle.exe").start();
		
	    System.out.println(process1.isAlive());
	    
	  //String commandLine="C:\\Users\\vsanoglu\\Desktop\\autoitscript\\handle.exe";
	  //Runtime runtime = Runtime.getRuntime();
	  //Process process1 = runtime.exec(commandLine);
	    
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	                 }
	return 0;
	               }	



						}
