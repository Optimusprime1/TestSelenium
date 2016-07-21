import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.*;

//import components.ComboBox;


public class DirectLead {
	


	
	public static void main(String[] args) {
try {
	
	//Comment out unused browsers

	Chrome(ChromeLogin());
	
	
	//LoginIE();
	
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
driver.get("https://bupacrm2.veripark.com:444/main.aspx?etn=lead&id=&pagetype=entityrecord");
WebElement UserElement = driver.findElement(By.xpath(".//*[@id='userNameInput']"));
UserElement.sendKeys("crm12\\crmadmin");
WebElement PassElement = driver.findElement(By.xpath(".//*[@id='passwordInput']"));
PassElement.sendKeys("Tt12345");
WebElement SubmitElement = driver.findElement(By.xpath(".//*[@id='submitButton']"));
SubmitElement.click();





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

public static WebDriver ChromeLogin(){ 

	String pathToBinary = "C:\\Program Files (x86)\\selenium-2.53.1\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",pathToBinary);
	WebDriver driver = new ChromeDriver();
	//WebDriver driver = new ChromeDriver();
	//driver.get("https://crmdevinternal.bupa.com.sa/BupaSIT/main.aspx?etn=lead&id=&pagetype=entityrecord");
	driver.get("https://bupacrm2.veripark.com:444/main.aspx?etn=lead&id=&pagetype=entityrecord");
	WebElement UserElement = driver.findElement(By.xpath(".//*[@id='userNameInput']"));
	UserElement.sendKeys("crm12\\crmadmin");
	WebElement PassElement = driver.findElement(By.xpath(".//*[@id='passwordInput']"));
	PassElement.sendKeys("Tt12345");
	WebElement SubmitElement = driver.findElement(By.xpath(".//*[@id='submitButton']"));
	SubmitElement.click();
	return driver;
	
}

public static void Chrome(WebDriver driver){
	 
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	waitForLoad(driver);
WebElement CheckElement = driver.findElement(By.id("contentIFrame0"));
		if (CheckElement!= null)
					{
					driver.switchTo().frame(CheckElement) ;
					WebElement Newframe = driver.findElement(By.id("campaignid_d"));
					System.out.println(Newframe.getTagName());
					}
	
	/*
	 System.out.println("i am here1");
	List<WebElement> resultList = driver.findElements(By.id("bupa_lead_expectedaveragepremium"));
	for (WebElement resultItem : resultList){
        String tabname=resultItem.getTagName();
        System.out.println("i am here2");
        System.out.println(tabname);}
        
        */
}





private static void waitForLoad(WebDriver driver) {
	// TODO Auto-generated method stub
	new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd ->
    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
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
