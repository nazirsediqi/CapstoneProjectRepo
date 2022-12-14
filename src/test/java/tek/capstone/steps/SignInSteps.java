package tek.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.pages.POMFactory;
import tek.capstone.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
	String expectedTitle = "React App";
	String actualTitle = getTitle();
	Assert.assertEquals(expectedTitle, actualTitle);
	logger.info(actualTitle +" is equal to "+ expectedTitle);
	}
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInLink);
		logger.info("Click on signIn Page");
	}
	@And("User enter email {string} and password {string}")
	public void userEnteremailAndPassword(String email, String password){
		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField, password);
		logger.info("User enters email" + email + "  and password" + password);
		
	}
	@And ("User click on login button")
	public void userClickOnLogInBtn() {
		click(factory.signInPage().logInBtn);
		logger.info("User click on LogIn button");
		
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedIn() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
		logger.info("user logged in into account");
		slowDown();
		
	}
	// Create Account 
	
	@And("User click on Create New Account button")
	public void userclickCreateNewAcc() {
	click(factory.signInPage().newAccBtn);
	logger.info("User clicks on new account button");
	slowDown();
	}
	@And("User fill the signUp information with below data")
	public void userFillInfo(DataTable data) {
	List<Map<String, String>> signUpData = data.asMaps(String.class,String.class);
	sendText(factory.signInPage().nameInput,signUpData.get(0).get("name"));
	sendText(factory.signInPage().emailInput, signUpData.get(0).get("email"));
	sendText(factory.signInPage().passwordInput, signUpData.get(0).get("password"));
	sendText(factory.signInPage().confirmPasswordInput, signUpData.get(0).get("confirmPassword"));
	logger.info("User enters info");
	slowDown();	
	}
	@And("User click on SignUp button")
	public void userClickOnSignUpBtn() {
	click(factory.signInPage().signUpBtn);
	logger.info("User click on Sign up button");
	slowDown();		
	}
	@Then("User should be logged into account page")
	public void userLoggedInToPage() {
	Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
	logger.info("Account is created");
	slowDown();	
	}

}
