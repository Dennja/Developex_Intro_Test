import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class AuthentificationPageTest extends zWebDriverSettings {

    @Test public void TestCase1() { System.out.println("Authentification functional test, data control group");
        driver.findElement(By.id("registerName")).sendKeys(ConstantsAuth.USERNAMETRUE);
        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.LASTNAMETRUE);
        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.LASTNAMETRUE);
        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.PASSWORD_STRONG);
        driver.findElement(By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys(ConstantsAuth.PASSWORD_STRONG);
        driver.findElement(By.id("Phone")).sendKeys(ConstantsAuth.PHONETRUE);
        driver.findElement(By.id("OrgDisplayName")).sendKeys(ConstantsAuth.ORG_TRUE);
 //       driver.findElement(By.id("signupbtn")).click ();
        String title = driver.getTitle();
        try { Assert.assertTrue(title.equals("Test exercise")); }
        catch (Exception e){System.out.println("we did not finish the registration process");notify();}}

    @Test public void TestCase2() { System.out.println("Authentification functional test, data control group(TRUE & TINY)");
        driver.findElement(By.cssSelector("body")).sendKeys(
        Keys.TAB, ConstantsAuth.USERNAMETRUE,
        Keys.TAB, ConstantsAuth.FIRSTNAMETRUE,
        Keys.TAB, ConstantsAuth.LASTNAMETRUE,
        Keys.TAB, ConstantsAuth.PASSWORD_STRONG,
        Keys.TAB, ConstantsAuth.PASSWORD_STRONG,
        Keys.TAB, ConstantsAuth.PHONETRUE,
        Keys.TAB, ConstantsAuth.ORG_TRUE);
        driver.findElement(By.id("signupbtn")).click ();
        String title = driver.getTitle();
        try { Assert.assertTrue(title.equals("Test exercise")); }
        catch (Exception e){System.out.println("we did not pass the registration");notify();}}

    @Test public void TestCase3() { System.out.println ("'All fields are required to fill' test 1");
    driver.findElement (By.id ("signupbtn")).click();
    String title = driver.getTitle();
    try { Assert.assertEquals ("Test exercise", title);}
    catch (AssertionError e) { System.out.println("We are not on registration page");notify();}
    String error="Field cannot be empty";
        System.out.println("Email address field error message is...");
    String emailAddress = driver.findElement(By.xpath("//*[@id=\"registerForm\"]/fieldset/span[1]/span")).getText();
    try {Assert.assertEquals(error,emailAddress);}
    catch (AssertionError e) { System.out.println("CORRUPTED!"); notify();}
    System.out.println("  visible");
        System.out.println("First name field error message is...");
    String firstName = driver.findElement(By.xpath("//*[@id=\"registerForm\"]/fieldset/span[2]/span")).getText();
    try {Assert.assertEquals(error,firstName);}
    catch (AssertionError e) { System.out.println("CORRUPTED!"); notify();}
    System.out.println("  visible");
        System.out.println("Last name field error message is...");
    String lastName = driver.findElement(By.xpath("//*[@id=\"registerForm\"]/fieldset/span[3]/span")).getText();
    try {Assert.assertEquals(error,lastName);}
    catch (AssertionError e) { System.out.println("CORRUPTED!"); notify();}
    System.out.println("  visible");
        System.out.println("Password field error message is...");
    String password = driver.findElement(By.xpath("//*[@id=\"registerForm\"]/fieldset/span[4]/span")).getText();
    try {Assert.assertEquals(error,password);}
    catch (AssertionError e) { System.out.println("CORRUPTED!"); notify();}
    System.out.println("  visible");
        System.out.println("Phone field error message is...");
    String phone = driver.findElement(By.xpath("//*[@id=\"registerForm\"]/fieldset/span[7]/span")).getText();
    try {Assert.assertEquals(error,phone);}
    catch (AssertionError e) { System.out.println("CORRUPTED!"); notify();}
    System.out.println("  visible");
        System.out.println("Organization name field error message is...");
    String organizationName = driver.findElement(By.xpath("//*[@id=\"registerForm\"]/fieldset/span[8]/span")).getText();
    try {Assert.assertEquals(error,organizationName);}
    catch (AssertionError e) { System.out.println("CORRUPTED!"); notify();}
    System.out.println("  visible");}

    @Test public void TestCase4() { System.out.println("First/Last name fields  test 1, FIRSTNAME_LOWER");
        driver.findElement(By.id("registerName")).sendKeys(ConstantsAuth.USERNAMETRUE);
        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.FIRSTNAME_LOWER);
        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.LASTNAMETRUE);
        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.PASSWORD_STRONG);
        driver.findElement(By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys(ConstantsAuth.PASSWORD_STRONG);
        driver.findElement(By.id("Phone")).sendKeys(ConstantsAuth.PHONETRUE);
        driver.findElement(By.id("OrgDisplayName")).sendKeys(ConstantsAuth.ORG_TRUE);
        driver.findElement(By.id("signupbtn")).click ();
        String title = driver.getTitle();
        try { Assert.assertEquals ("Test exercise", title);}
        catch (AssertionError e) { System.out.println("We are not on registration page");notify();}}


    @Test public void TestCase5() { System.out.println("Authentification functional test 2, FIRSTNAME_NUM_ONLY");
        driver.findElement(By.id("registerName")).sendKeys(ConstantsAuth.USERNAMETRUE);
        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.FIRSTNAME_NUM_ONLY);
        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.LASTNAMETRUE);
        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.PASSWORD_STRONG);
        driver.findElement(By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys(ConstantsAuth.PASSWORD_STRONG);
        driver.findElement(By.id("Phone")).sendKeys(ConstantsAuth.PHONETRUE);
        driver.findElement(By.id("OrgDisplayName")).sendKeys(ConstantsAuth.ORG_TRUE);
        driver.findElement(By.id("signupbtn")).click ();
        String title = driver.getTitle();
        try { Assert.assertEquals ("Test exercise", title);}
        catch (AssertionError e) { System.out.println("We are not on registration page");}}

    @Test public void TestCase6() { System.out.println("Authentification functional test 5");
        driver.findElement(By.id("registerName")).sendKeys(ConstantsAuth.USERNAMETRUE);
        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.FIRSTNAME_SYMBOLS_ONLY);
        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.LASTNAMETRUE);
        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.PASSWORD_STRONG);
        driver.findElement(By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys(ConstantsAuth.PASSWORD_STRONG);
        driver.findElement(By.id("Phone")).sendKeys(ConstantsAuth.PHONETRUE);
        driver.findElement(By.id("OrgDisplayName")).sendKeys(ConstantsAuth.ORG_TRUE);
        driver.findElement(By.id("signupbtn")).click ();
        String title = driver.getTitle();
        try { Assert.assertEquals ("Test exercise", title);}
        catch (AssertionError e) { System.out.println("We are not on registration page");notify();}}

    @Test public void TestCase7() { System.out.println("Authentification functional test 5");
        driver.findElement(By.id("registerName")).sendKeys(ConstantsAuth.USERNAMETRUE);
        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.FIRSTNAME_40_LETTERS);
        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.LASTNAMETRUE);
        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.PASSWORD_STRONG);
        driver.findElement(By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys(ConstantsAuth.PASSWORD_STRONG);
        driver.findElement(By.id("Phone")).sendKeys(ConstantsAuth.PHONETRUE);
        driver.findElement(By.id("OrgDisplayName")).sendKeys(ConstantsAuth.ORG_TRUE);
        driver.findElement(By.id("signupbtn")).click ();
        String title = driver.getTitle();
        try { Assert.assertEquals ("Test exercise", title);}
        catch (AssertionError e) { System.out.println("We are not on registration page");notify();}}


    @Test public void TestCase8() { System.out.println("Authentification functional test 8, username");
        SignUpPageElements signUpPageElements = PageFactory.initElements (driver, SignUpPageElements.class);
        signUpPageElements.open ();
        driver.findElement(By.id("registerName")).sendKeys(ConstantsAuth.USERNAME_NUM_ONLY);
        signUpPageElements.fillForm_Exept_registerName ();
        String title = driver.getTitle();
        try { Assert.assertEquals ("Test exercise", title);}
        catch (AssertionError e) { System.out.println("registration is not passed");notify();}
        signUpPageElements.open ();
        driver.findElement(By.id("registerName")).sendKeys(ConstantsAuth.USERNAME_SYMBOLS_ONLY);
        signUpPageElements.fillForm_Exept_registerName ();
        try { Assert.assertEquals ("Test exercise", title);}
        catch (AssertionError e) { System.out.println("registration is not passed");notify();}}

    @Test public void TestCase9() { System.out.println("Authentification test, FirstName field test.");
        SignUpPageElements signUpPageElements = PageFactory.initElements (driver, SignUpPageElements.class);
        signUpPageElements.open ();System.out.println("filling FirstName with lower register");
        String title = driver.getTitle ();
        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.FIRSTNAME_LOWER);
        signUpPageElements.fillForm_Exept_FirstName ();
        try { Assert.assertEquals ("Test exercise", title);}
        catch (AssertionError e) { System.out.println("registration is not passed");notify();}
        signUpPageElements.open ();System.out.println("filling FirstName with symbols only");
        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.FIRSTNAME_SYMBOLS_ONLY);
        signUpPageElements.fillForm_Exept_FirstName ();
        try { Assert.assertEquals ("Test exercise", title);}
        catch (AssertionError e) { System.out.println("registration is not passed");notify();}
        signUpPageElements.open ();System.out.println("filling FirstName with numbers only");
        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.FIRSTNAME_NUM_ONLY);
        signUpPageElements.fillForm_Exept_FirstName ();
        try { Assert.assertEquals ("Test exercise", title);}
        catch (AssertionError e) { System.out.println("registration is not passed");notify();}
        signUpPageElements.open ();System.out.println("filling FirstName with 40 letters");
        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.FIRSTNAME_40_LETTERS);
        signUpPageElements.fillForm_Exept_FirstName ();
        try { Assert.assertEquals ("Test exercise", title);}
        catch (AssertionError e) { System.out.println("registration is not passed");notify();}}

    @Test public void TestCase10() { System.out.println("Authentification test, LastName field test.");
        SignUpPageElements signUpPageElements = PageFactory.initElements (driver, SignUpPageElements.class);

            signUpPageElements.open ();System.out.println("filling FirstName with lower register");
        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.LASTNAME_LOWER);
        signUpPageElements.fillForm_Exept_LastName ();
        String title = driver.findElement(By.xpath ("//*[.='WELCOME']")).getText();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Registration is not passed");notify();}
        System.out.println("Registration is successful");
            signUpPageElements.open ();System.out.println("filling FirstName with symbols only");
        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.LASTNAME_SYMBOLS_ONLY);
        signUpPageElements.fillForm_Exept_LastName ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Registration is not passed");notify();}
        System.out.println("Registration is successful");
            signUpPageElements.open ();System.out.println("filling FirstName with numbers only");
        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.LASTNAME_NUM_ONLY);
        signUpPageElements.fillForm_Exept_LastName ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Registration is not passed");notify();}
        System.out.println("Registration is successful");
            signUpPageElements.open ();System.out.println("filling FirstName with 20 letters");
        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.LASTNAME_20_LETTERS);
        signUpPageElements.fillForm_Exept_LastName ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Registration is not passed");notify();}
        System.out.println("Registration is successful");}

    @Test public void TestCase11() { System.out.println("Password force recognition");
        SignUpPageElements signUpPageElements = PageFactory.initElements (driver, SignUpPageElements.class);
            signUpPageElements.open (); System.out.println("    filling UserPassword with strong password");
        driver.findElement (By.id ("UserPassword")).sendKeys (ConstantsAuth.PASSWORD_STRONG);
        driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys (ConstantsAuth.PASSWORD_STRONG);
        String pwdWeakMsg = driver.findElement(By.xpath ("//*[.='\n"+"                                            Password strength: weak\n"+"                                        ']")).getText();
        String pwdNotWeakMsg = "Password strength perceived not as weak";
        String pwdIsWeak = "Password strength perceived as weak";
        String pwdError = "Password strength: weak1";
        try { Assert.assertEquals ("Password strength: weak",pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        System.out.println(pwdIsWeak);
            signUpPageElements.open (); System.out.println("    filling FirstName with symbols only");
        driver.findElement (By.id ("UserPassword")).sendKeys (ConstantsAuth.PASSWORD_WEAK);
        driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys (ConstantsAuth.PASSWORD_WEAK);
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        System.out.println(pwdIsWeak);
            signUpPageElements.open (); System.out.println("    filling FirstName with numbers only");
        driver.findElement (By.id ("UserPassword")).sendKeys (ConstantsAuth.PASSWORD_NORMAL);
        driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys (ConstantsAuth.PASSWORD_NORMAL);
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        System.out.println(pwdIsWeak);
            signUpPageElements.open (); System.out.println("    filling FirstName with 20 letters");
        driver.findElement (By.id ("UserPassword")).sendKeys (ConstantsAuth.PASSWORD_11_LOWER_ONLY);
        driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys (ConstantsAuth.PASSWORD_11_LOWER_ONLY);
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        System.out.println(pwdIsWeak);
            signUpPageElements.open ();System.out.println("    filling FirstName with 20 letters");
        driver.findElement (By.id ("UserPassword")).sendKeys (ConstantsAuth.PASSWORD_11_NUM_ONLY);
        driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys (ConstantsAuth.PASSWORD_11_NUM_ONLY);
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        System.out.println(pwdIsWeak);
    }
    @Test public void TestCase12() { System.out.println("Authentification test, Phone field test.");
        SignUpPageElements signUpPageElements = PageFactory.initElements (driver, SignUpPageElements.class);
            signUpPageElements.open (); System.out.println("    filling UserPassword with strong password");
        driver.findElement (By.id ("Phone")).sendKeys (ConstantsAuth.PHONE_NUM_11);
        signUpPageElements.fillForm_Exept_Phone ();
        String title = driver.findElement(By.xpath ("//*[.='WELCOME']")).getText();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Registration is not passed");notify();}
        System.out.println("Registration is successful");
            signUpPageElements.open (); System.out.println("    filling UserPassword with strong password");
        driver.findElement (By.id ("Phone")).sendKeys (ConstantsAuth.PHONE_NUM_10);
        signUpPageElements.fillForm_Exept_Phone ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Registration is not passed");notify();}
        System.out.println("Registration is successful");
            signUpPageElements.open (); System.out.println("    filling UserPassword with strong password");
        driver.findElement (By.id ("Phone")).sendKeys (ConstantsAuth.PHONE_LETTERS);
        signUpPageElements.fillForm_Exept_Phone ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Registration is not passed");notify();}
        System.out.println("Registration is successful");
            signUpPageElements.open (); System.out.println("    filling UserPassword with strong password");
        driver.findElement (By.id ("Phone")).sendKeys (ConstantsAuth.PHONE_SYMBOLS_ONLY);
        signUpPageElements.fillForm_Exept_Phone ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Registration is not passed");notify();}
        System.out.println("Registration is successful");


    }
    @Test public void TestCase13() { System.out.println ("Authentification test, Organisation field test.");
        SignUpPageElements signUpPageElements = PageFactory.initElements (driver, SignUpPageElements.class);
        signUpPageElements.open ( );
        System.out.println ("    filling UserPassword with strong password");
        driver.findElement (By.id ("OrgDisplayName")).sendKeys (ConstantsAuth.ORG_SYMBOLS_ONLY);
        signUpPageElements.fillForm_Exept_Organization ( );
        String title = driver.findElement (By.xpath ("//*[.='WELCOME']")).getText ( );
        try { Assert.assertEquals ("WELCOME", title);}
        catch (AssertionError e) {System.out.println ("Registration is not passed");notify ();}
        System.out.println ("Registration is successful");
        signUpPageElements.open ( );System.out.println ("    filling UserPassword with strong password");
        driver.findElement (By.id ("OrgDisplayName")).sendKeys (ConstantsAuth.ORG_NUMBERS_ONLY);
        signUpPageElements.fillForm_Exept_Organization ( );
        try { Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) { System.out.println ("Registration is not passed"); notify ( );}
        System.out.println ("Registration is successful");
//        signUpPageElements.open ( ); System.out.println ("    filling UserPassword with strong password");
//        driver.findElement (By.id ("OrgDisplayName")).sendKeys (ConstantsAuth.ORG_TRUE);
//        signUpPageElements.fillForm_Exept_Phone ( );
//        try { Assert.assertEquals ("WELCOME", title);}
//        catch (AssertionError e) {System.out.println ("Registration is not passed"); notify ( );}
//        System.out.println ("Registration is successful");
    }
}
//        try { Assert.assertNotNull(driver.findElement(By.xpath ("//*[.='Field cannot be empty']")).isDisplayed ());}
//        catch (AssertionFailure e) { System.out.println("  visible");}