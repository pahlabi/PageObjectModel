package testLayer;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import pageObject.actionPage;
import pageObject.homePage;
import pageObject.myAccountPage;
import pageObject.registrationPage;

public class mctSomkeTest {

public homePage testHomePage;
public registrationPage testRegPage;
public actionPage	acPage;
public myAccountPage testmyAccountPage;

@BeforeMethod
public void prepareAllPageObject()
{
	testHomePage=new homePage();
	testRegPage =new registrationPage();
	acPage      =new actionPage();
	testmyAccountPage=new myAccountPage();
}
public void logInTest()
{
	testHomePage.launchBrowser("chrome");
	testHomePage.goToWebSite("https://www.demo.iscripts.com/multicart/demo/");
	testHomePage.logInTest();
	Assert.assertEquals(testHomePage.validateProfileNameExist("James williams"), true,"failed profile Name found");
}
public void logOutTest()
{
	testHomePage.launchBrowser("chrome");
	testHomePage.goToWebSite("https://www.demo.iscripts.com/multicart/demo/");
	testHomePage.logInTest();
	testHomePage.logOutTest();
	Assert.assertEquals(testHomePage.validateProfileNameNotExist("James williams"), true," profile name not found at this point");
}
public void myPaccountTest()
{
	testHomePage.launchBrowser("chrome");
	testHomePage.goToWebSite("https://www.demo.iscripts.com/multicart/demo/");
	testHomePage.logInTest();
	testHomePage.takeMetoMyaccount();
	Assert.assertEquals(testmyAccountPage.validateMyAcclabelExit("my Account adc"), true,"failed profile Name not found");
}

	

	
	
}
