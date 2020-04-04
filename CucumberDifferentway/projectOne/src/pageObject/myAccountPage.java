package pageObject;

public class myAccountPage extends actionPage {

	public String validateMyaccountPageLavel="xpath://*[@id=\'item_details\']/section/div/h3";
	
	
	public boolean validateMyAcclabelExit(String labelName)
	{
		try {
		String	expectedResult=labelName;
		String actualResult =getElementValue(validateMyaccountPageLavel);
		if(expectedResult.equalsIgnoreCase(actualResult))
		{
		return	true;
		}
		else 
		{
			return false;
		}
	
	}catch(Exception e)
	{
		return false;
	}
	}	
}
