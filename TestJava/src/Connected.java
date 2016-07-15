import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.Keys;

//change test2 

//Third commit

public class Connected {
	
	
	public static void main(String[] args) {
try {
	//Comment out unused browsers
	LoginIE();
	//Chrome();
	//LoginFirefox();
	
	
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

	
	
}


public static void LoginIE(){

	
	String pathToie = "C:\\Program Files (x86)\\selenium-2.53.1\\IEDriverServer.exe";
	System.setProperty("webdriver.ie.driver", pathToie);
	WebDriver driver = new InternetExplorerDriver();	
		
	driver.get("https://crmdevinternal.bupa.com.sa/BupaSIT/main.aspx#282802707");
	int ExecReturn = IeloginWithBat();
	if (ExecReturn==0){try {
		Thread.sleep(7500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	//WebDriverWait wait = new WebDriverWait(driver, 200);
	System.out.println("i am here");
	
	//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("InlineDialog_Iframe"));
    driver.switchTo().frame("InlineDialog_Iframe");
	driver.findElement(By.id("butBegin")).click(); 
	//driver.manage().window().fullscreen();
	driver.switchTo().defaultContent();
	driver.findElement(By.id("homeButtonImage")).click();
	driver.findElement(By.id("SFA")).click();
	driver.findElement(By.id("nav_leads")).click();
	driver.findElement(By.id("lead|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.lead.NewRecord")).click();
	
	
	

}


public static void Chrome(){
	
	String pathToBinary = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
	System.setProperty("webdriver.chrome.driver",pathToBinary);
	WebDriver driver = new ChromeDriver();
	
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
