package test_signin;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.config;
import loc_variable.SignIn_val;

public class sign_in_with_invalid_credential extends config {
	
	SignIn_val signIn = new SignIn_val();
	
	@Test
	public void loginWithInValidCredentialUsingEmailTest(){
	System.out.println ("login With InValid Credential Using Email Test start");
    clickByXpath(signIn.signInLinkLoc)	;
	typeByXpath(signIn.emailLoc, signIn.wrong_email_value);
	clickByCss(signIn.nextButtonLoc);
	typeByXpath(signIn.passwordLoc,signIn.wrongpass);
	clickByXpath(signIn.nextButtonloc);
	
	String act = driver.findElement(By.xpath(signIn.inlinelocator)).getText(); 
	// act is coming from Domain -- the one developer build and release
	String exp = "Invalid password. Please try again"; // exp is coming from Requirement or Mock-up
	Assert.assertEquals(act, exp);

}
 }