package groupPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class secondScript {
	public static WebDriver driver;

	public static void launchBrowser(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\CucumberDifferentway\\projectOne\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if(browserName.equals("ie"))
			{
				//System.setProperty("webdriver.ie.driver", "C:\\Users\\ABUL\\eclipse-workspace_project\\groupPractice\\chromedriver_win32 (2)\\chromedriver.exe");
				driver = new InternetExplorerDriver();
			}
		else if(browserName.equals("gecko"))
				{
					//System.setProperty("webdriver.ie.driver", "C:\\Users\\ABUL\\eclipse-workspace_project\\groupPractice\\chromedriver_win32 (2)\\chromedriver.exe");	
					driver =new FirefoxDriver();
				}

			
		
	}
	public static void goToWebSite(String url)
	{
		driver.get(url);
	}
	public static void clickElement(String locators)
	{
		if(locators.contains("xpath"))
		{
			driver.findElement(By.xpath(locators.split(":")[1])).click();	
		}
		else if(locators.contains("cssSelector"))
		{
			driver.findElement(By.cssSelector(locators.split(":")[1])).click();
		}
		else if(locators.contains("id"))
		{
			driver.findElement(By.id(locators.split(":")[1])).click();
		}
		else if(locators.contains("linkTest"))
		{
			driver.findElement(By.linkText(locators.split(":")[1])).click();
		}
		else if(locators.contains("name"))
		{
			driver.findElement(By.name(locators.split(":")[1])).click();
		}
		else if(locators.contains("partialLinkText"))
		{
			driver.findElement(By.partialLinkText(locators.split(":")[1])).click();
		}
		else if (locators.contains("tagName"))
		{
			driver.findElement(By.tagName(locators.split(":")[1])).click();
		}
		else if(locators.contains("className"))
		{
			driver.findElement(By.className(locators.split(":")[1])).click();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
	public static void typeOnText(String locators,String value)

	{
		if(locators.contains("xpath"))
		{
			driver.findElement(By.xpath(locators.split(":")[1])).sendKeys(value);
		}
		else if(locators.contains("cssSelector"))
		{
			driver.findElement(By.cssSelector(locators.split(":")[1])).sendKeys(value);
		}
		else if(locators.contains("id"))
		{
			driver.findElement(By.id(locators.split(":")[1])).sendKeys(value);
		}
		else if(locators.contains("linkTest"))
		{
			driver.findElement(By.linkText(locators.split(":")[1])).sendKeys(value);
		}
		else if(locators.contains("name"))
		{
			driver.findElement(By.name(locators.split(":")[1])).sendKeys(value);
		}
		else if(locators.contains("partialLinkText"))
		{
			driver.findElement(By.partialLinkText(locators.split(":")[1])).sendKeys(value);
		}
		else if (locators.contains("tagName"))
		{
			driver.findElement(By.tagName(locators.split(":")[1])).sendKeys(value);
		}
		else if(locators.contains("className"))
		{
			driver.findElement(By.className(locators.split(":")[1])).sendKeys(value);
		}

	}
	public static String getElementValue(String locators)
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(locators.contains("xpath"))
		{
			return driver.findElement(By.xpath(locators.split(":")[1])).getText();	
		}
		else if(locators.contains("cssSelector"))
		{
			return	driver.findElement(By.cssSelector(locators.split(":")[1])).getText();
		}
		else if(locators.contains("id"))
		{
			return	driver.findElement(By.id(locators.split(":")[1])).getText();
		}
		else if(locators.contains("linkTest"))
		{
			return	driver.findElement(By.linkText(locators.split(":")[1])).getText();
		}
		else if(locators.contains("name"))
		{
			return	driver.findElement(By.name(locators.split(":")[1])).getText();
		}
		else if(locators.contains("partialLinkText"))
		{
			return	driver.findElement(By.partialLinkText(locators.split(":")[1])).getText();
		}
		else if (locators.contains("tagName"))
		{
			return	driver.findElement(By.tagName(locators.split(":")[1])).getText();
		}
		else if(locators.contains("className"))
		{
			return	driver.findElement(By.className(locators.split(":")[1])).getText();
		}
		return null;

	}
    
	
	
	
	
	public static void completeRegitration(String email,String userName,String LName)
    {
    	typeOnText(enterEmailValue,email);
    	typeOnText(enterUserNaValue,userName);
    	typeOnText(enterPassValue,"Abcd123");
    	typeOnText(enterCnFPassValue,"Abcd123");
    	typeOnText(enterFNameValue,"Sohel");
    	typeOnText(enterLNameValue,LName);
    	typeOnText(enterAddressValue,"87-78 106 st,Jamaica NY-11432");
    	clickElement(clickCheckNews);
    	clickElement(clickCreateAcc);
    }
    
    //input[contains(@placeholder,'Address')]
    
  //*[@id="item_details"]/div[2]/div[4]/div/div[1]/div[7]/input
  //*[@id='txtEmail'] 
  //*[@id='txtUserName']  
  //*[@id=txtPassword']    //*[@id="txtPassword"]
  //*[@id='txtCnfPassword']
  //*[@id='txtFirstName']
  //*[@id='txtLastName']
    //input[contains(@placeholder,'Address')]
  //*[@id='item_details']/div[2]/div[4]/div/div[1]/div[8]/input
  //*[@id='btnRegister']
  //*[@id='jqSignup']
	//input[@id='txtEmail']
//Get variables for Registration
  public static String  enterEmailValue = "xpath://*[@id='txtEmail']" ;
  public static String  enterUserNaValue="xpath://*[@id='txtUserName']";
  public static String  enterPassValue="xpath://*[@id='txtPassword']";  
  public static String  enterCnFPassValue="xpath://*[@id='txtCnfPassword']";  
  public static String  enterFNameValue="xpath://*[@id='txtFirstName']"; 
  public static String  enterLNameValue="xpath: //*[@id='txtLastName']";
  public static String  enterAddressValue="xpath://input[contains(@placeholder,'Address')]";
  public static String  clickCheckNews="xpath://*[@id='item_details']/div[2]/div[4]/div/div[1]/div[8]/input";
  public static String  clickCreateAcc="xpath://*[@id='btnRegister']";
 
  
  public static void logIn()
  {
	  clickElement(logInTextBox);  
	  typeOnText(inPutBoxUser,"user");
	  typeOnText(inPutBoxPass,"pass");
	  clickElement(loginButton);
  }
  public static void logOut()
  {
	  clickElement(getProfileName);
	  clickElement(logOutButton);
  }
	
	//Put the variable name
	public static String logInTextBox = "xpath://*[@id='dLabellogin']/span";
	public static String loginButton="xpath://*[@id='jqLogin']";
	public static String inPutBoxUser ="xpath://*[@id='username']";
	public static String inPutBoxPass ="xpath://*[@id='password']";
	public static String getProfileName= "xpath://*[@id='dLabel']/span";
	public static String logOutButton = "xpath://*[@id=\'drp_div\']/ul/li/div/div[3]/a";
	public static String signUpButton = "xpath:  //*[@id='jqSignup']";
	
	public static void goToRegistration()
	  {
		  clickElement(logInTextBox); 
		  clickElement(signUpButton);
	  }
	//*[@id="dLabellogin"]/span

	public static void main(String[] args) {

		String expectedResult ;
		String actualResult;
		//Test 1 for login Test
		launchBrowser("chrome");
		goToWebSite("https://www.demo.iscripts.com/multicart/demo");
		logIn ();
		
     try {expectedResult = "James williams";
     actualResult =getElementValue(getProfileName);
    	if(expectedResult.equalsIgnoreCase(actualResult))
    	{
    		System.out.println("The  test will passed....");
    	 
     }else 
     {
    	 System.out.println("The test will failed......");
     }
     }catch(Exception e)
     {
    	 System.out.println("The test will failed.....");
     }
    	 
     driver.close();


		//2nd Test for LogOut Test

		launchBrowser("chrome");
		goToWebSite("https://www.demo.iscripts.com/multicart/demo");
		logIn();
		logOut();

		try {  expectedResult ="James williams";
		actualResult = getElementValue(getProfileName);
		if(expectedResult.equalsIgnoreCase(actualResult))
		{
			System.out.println("The test will failed ......."); 
		}
		else
		{
			System.out.println("The test will passed .......");
		}
		}catch(Exception e)
		{
			System.out.println("The test will passed....................");
		}

		driver.close(); 


    //This is 3rd test for registration
		launchBrowser("chrome");
		goToWebSite("https://www.demo.iscripts.com/multicart/demo");
		goToRegistration();
		
String randomName;
    
       randomName= "Abcd" + Math.random();
       completeRegitration(randomName+"@gmail.com",randomName,randomName);
      try {expectedResult = "Sohel " + randomName;
    	  actualResult = getElementValue(getProfileName);
    	  if(expectedResult.equalsIgnoreCase(actualResult))
    	  {
    		  System.out.println("The test will passed...");
    	  }else 
    	  {
    		  System.out.println("The test will failed...");
    	  }
      }
      catch(Exception e)
      {
    	  System.out.println("The test will failed...");	  
      }
         driver.close();


     
    
     
     
     
      
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
