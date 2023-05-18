package TestCases;

import java.io.IOException;


import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectsModel.LoginPageObjects;
import PageObjectsModel.SignupPageObjects;
import Resources.baseClass;
import Resources.commonMethods;


public class verifySignup extends baseClass{
 
@Test 
 public void signup() throws IOException, InterruptedException {
	 
	
	LoginPageObjects lpo=new LoginPageObjects(driver);
  
  lpo.clickOntryForFreee().click();
  
  SignupPageObjects spo=new SignupPageObjects(driver);
  
  Thread.sleep(5000);
  
  spo.enterFirstname().sendKeys("constant.firstname");

  /*
  Select s=new Select(spo.selectEmployee());
  s.selectByIndex(1);
  
  
  Select s1=new Select(spo.selectCountry());
  s1.selectByIndex(1);
  */
 
  
 commonMethods.selectDropdown(spo.selectEmployee(), 1);
 commonMethods.selectDropdown(spo.selectCountry(), 2);

  
 }

}
