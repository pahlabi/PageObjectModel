package testLayer;

import pageObject.actionPage;
import pageObject.homePage;
import pageObject.registrationPage;

public class smokeTest {

	
	public static void main(String[] args) {
		
		
		
	homePage testHomePage =new homePage();
	registrationPage testRegPage =new registrationPage();
	actionPage acPage =new actionPage();	
		
		
		//login test
		testHomePage.launchBrowser("chrome");
		testHomePage.goToWebSite("https://www.demo.iscripts.com/multicart/demo");
		testHomePage.logInTest();
		acPage.closeBrowser();
		//logOut test
		testHomePage.launchBrowser("chrome");
		testHomePage.goToWebSite("https://www.demo.iscripts.com/multicart/demo");
		testHomePage.logInTest();
		testHomePage.logOutTest();
		acPage.closeBrowser();
		
		//reg page 3rd test
		
		testHomePage.launchBrowser("chrome");
		testHomePage.goToWebSite("https://www.demo.iscripts.com/multicart/demo");
		testHomePage.goToRegistration();
		String randomName;
	    
	      randomName= "Abcd" + Math.random();
	       
		testRegPage.completeRegitration(randomName+"@gmail.com",randomName,randomName);
		
		acPage.closeBrowser();
		
	}
	
	
}
