package test_signin;




import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.config;
import loc_variable.SignIn_val;


public class sign_in_with_valid_credential extends config {
	SignIn_val signIn = new SignIn_val();

@Test
public void loginWithValidCredentialUsingEmailTest(){
System.out.println ("login With Valid Credential Using Email Test start");

clickByXpath(signIn.signInLinkLoc)	;
typeByXpath(signIn.emailLoc, signIn.emailValue);
clickByCss(signIn.nextButtonLoc);
typeByXpath(signIn.passwordLoc,signIn.passValue);
clickByXpath(signIn.nextButtonloc);
clickByXpath(signIn.Nothanksloc);

String act = driver.findElement(By.xpath(signIn.myActualNameLoc)).getText(); 
// act is coming from Domain -- the one developer build and release
String exp = "keya"; // exp is coming from Requirement or Mock-up
Assert.assertEquals(act, exp);



	
	
	
	}
}