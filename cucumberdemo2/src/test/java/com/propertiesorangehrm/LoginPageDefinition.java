package com.propertiesorangehrm;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinition {
	LoginPageActionspro objLogin =new LoginPageActionspro();
	UtilityClass utility =new UtilityClass();
	

@Given("user is given with a url")
public void user_is_given_with_a_url() {
	System.out.println("Enter url");
	HelperClass.openPage(utility.url);
}

@When("user will give a username and password")
public void user_will_give_a_username_and_password() {
	System.out.println("enter username and password");
	objLogin.login(utility.username,utility.password);
}

@When("user click the login")
public void user_click_the_login() {
	objLogin.clicklogin();
	
	
      
}

@Then("user should be able to login successfully and go to home page")
public void user_should_be_able_to_login_successfully_and_go_to_home_page() {
   System.out.println("login success");
    
}




}
