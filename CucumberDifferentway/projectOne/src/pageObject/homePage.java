package pageObject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class homePage  extends actionPage 

{

	
	public  void launchBrowser(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABUL\\eclipse-workspace_project\\groupPractice\\chromedriver_win32 (2)\\chromedriver.exe");
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
		public  void goToWebSite(String url)
		{
			driver.get(url);
		}
	
	
	
	//Put the variable name
		public  String logInTextBox = "xpath://*[@id='dLabellogin']/span";
		public  String loginButton="xpath://*[@id='jqLogin']";
		public  String inPutBoxUser ="xpath://*[@id='username']";
		public  String inPutBoxPass ="xpath://*[@id='password']";
		public  String getProfileName= "xpath://*[@id='dLabel']/span";
		public  String logOutButton = "xpath://*[@id=\'drp_div\']/ul/li/div/div[3]/a";
		public  String signUpButton = "xpath://*[@id='jqSignup']";
	    public String  myAccountLink ="xpath://*[@id=\'drp_div\']/ul/li/div/div[1]/a";
	
	
	
	public  void logInTest()
	  {
		  clickElement(logInTextBox);  
		  typeOnText(inPutBoxUser,"user");
		  typeOnText(inPutBoxPass,"pass");
		  clickElement(loginButton);
	  }
	
	public  void logOutTest()
	  {
		  clickElement(getProfileName);
		  clickElement(logOutButton);
	  }
	
	public void goToRegistration()
	  {
		  clickElement(logInTextBox); 
		  clickElement(signUpButton);
	  }
public boolean validateProfileNameExist(String pName)
{
try {String expectedResult=pName;
	 String actualResult=getElementValue(getProfileName);
	if(expectedResult.equalsIgnoreCase(actualResult))
	{
		return true;
	}else
	{
		return false;
	}	
}
catch(Exception e)
{
	return false;
}
}	
public boolean validateProfileNameNotExist(String pName)
{
try {String expectedResult=pName;
    String actualResult=getElementValue(getProfileName);
   if(expectedResult.equalsIgnoreCase(actualResult))
{
	return false;
}else
{
	return true;
}	
}
catch(Exception e)
{
   return true;
}
}	
	
public void takeMetoMyaccount()
{
	clickElement(getProfileName);
	clickElement(myAccountLink);
}	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

