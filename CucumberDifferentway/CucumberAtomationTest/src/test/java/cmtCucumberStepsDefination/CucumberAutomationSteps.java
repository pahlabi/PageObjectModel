package cmtCucumberStepsDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberAutomationSteps {

	
	
	
	@Given("^I open browser chrome$")
	public void i_open_browser_chrome()  {
	// System.out.println("##i_open_browser_chrome##"); 
	 
	}

	@Given("^i land on multicart landining page$")
	public void i_land_on_multicart_landining_page() {
	  System.out.println("##i_land_on_multicart_landining_page##"); 
	}

	@When("^I complete login credential as james william$")
	public void i_complete_login_credential_as_james_william()  {
	    System.out.println("##i_complete_login_credential_as_james_william##");
	}
	@When("^I complete registration as Mr Raz$")
	public void i_complete_registration_as_Mr_Raz() {
	    System.out.println("##i_complete_registration_as_Mr_Raz##");
	}
	

	@Then("^i expect profile name James williams$")
	public void i_expect_profile_name_James_williams()  {
	    System.out.println("##i_expect_profile_name_James_williams##");
	}
	@Then("^i expect to see profile name Mr Raz$")
	public void i_expect_to_see_profile_name_Mr_Raz()  {
	    System.out.println("##i_expect_to_see_profile_name_Mr_Raz##");
}
}