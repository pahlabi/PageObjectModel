package pageObject;

public class registrationPage extends actionPage
{

	
	  public  String  enterEmailValue = "xpath://*[@id='txtEmail']" ;
	  public  String  enterUserNaValue="xpath://*[@id='txtUserName']";
	  public  String  enterPassValue="xpath://*[@id='txtPassword']";  
	  public  String  enterCnFPassValue="xpath://*[@id='txtCnfPassword']";  
	  public  String  enterFNameValue="xpath://*[@id='txtFirstName']"; 
	  public  String  enterLNameValue="xpath: //*[@id='txtLastName']";
	  public  String  enterAddressValue="xpath://input[contains(@placeholder,'Address')]";
	  public  String  clickCheckNews="xpath://*[@id='item_details']/div[2]/div[4]/div/div[1]/div[8]/input";
	  public  String  clickCreateAcc="xpath://*[@id='btnRegister']";
	 
	  
	  
	  public  void completeRegitration(String email,String userName,String LName )
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
}
