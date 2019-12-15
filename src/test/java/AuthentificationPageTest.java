import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;


public class AuthentificationPageTest extends zWebDriverSettings {

    @Test
    public void TestCase1() {System.out.println ("Authentication functional test 1, all valid data");
        driver.get ("https://reverent-aryabhata-11cf33.netlify.com/");
        driver.findElement(By.cssSelector("body")).sendKeys(
        Keys.TAB, ConstantsAuth.USERNAMETRUE,
        Keys.TAB, ConstantsAuth.FIRSTNAMETRUE,
        Keys.TAB, ConstantsAuth.LASTNAMETRUE,
        Keys.TAB, ConstantsAuth.PASSWORD_STRONG,
        Keys.TAB, ConstantsAuth.PASSWORD_STRONG,
        Keys.TAB, ConstantsAuth.PHONETRUE,
        Keys.TAB, ConstantsAuth.ORG_TRUE);
        driver.findElement(By.id("signupbtn")).click ();
        String title = driver.findElement (By.xpath ("//*[.='WELCOME']")).getText ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            System.out.println ("Test case 1 failed. Registration is not passed");
            notify ( );
        }
        System.out.println ("Test case 1 passed successful");
    }

    @Test
    public void TestCase2() {System.out.println ("Authentication functional test 2, 'All fields are required to fill'");
        driver.get ("https://reverent-aryabhata-11cf33.netlify.com/");
        driver.findElement (By.id ("signupbtn")).click ( );
        String title = driver.getTitle ( );
        try {
            Assert.assertEquals ("Test exercise", title);
        } catch (AssertionError e) {
            System.out.println ("We are not on registration page");
            notify ( );
        }
        String error = "Field cannot be empty";
        String errMsg = " field error message is...";
        String tstFail = "\n" + "Test case 2 failed";
        String emailAddress = driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/span[1]/span")).getText ( );
        String firstName = driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/span[2]/span")).getText ( );
        String lastName = driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/span[3]/span")).getText ( );
        String password = driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/span[4]/span")).getText ( );
        String phone = driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/span[7]/span")).getText ( );
        String organizationName = driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/span[8]/span")).getText ( );

        System.out.println ("Email address field error message is...");
        try {
            Assert.assertEquals (error, emailAddress);
        } catch (AssertionError e) {
            System.out.println ("  missing!" + tstFail);
            notify ( );
        }
        System.out.println ("  visible");
        System.out.println ("First name" + errMsg);
        try {
            Assert.assertEquals (error, firstName);
        } catch (AssertionError e) {
            System.out.println ("  missing!" + tstFail);
            notify ( );
        }
        System.out.println ("  visible");
        System.out.println ("Last name" + errMsg);
        try {
            Assert.assertEquals (error, lastName);
        } catch (AssertionError e) {
            System.out.println ("  missing!" + tstFail);
            notify ( );
        }
        System.out.println ("  visible");
        System.out.println ("Password" + errMsg);
        try {
            Assert.assertEquals (error, password);
        } catch (AssertionError e) {
            System.out.println ("  missing!" + tstFail);
            notify ( );
        }
        System.out.println ("  visible");
        System.out.println ("Phone" + errMsg);
        try {
            Assert.assertEquals (error, phone);
        } catch (AssertionError e) {
            System.out.println ("  missing!" + tstFail);
            notify ( );
        }
        System.out.println ("  visible");
        System.out.println ("Organization name" + errMsg);
        try {
            Assert.assertEquals (error, organizationName);
        } catch (AssertionError e) {
            System.out.println ("  missing!" + tstFail);
            notify ( );
        }
        System.out.println ("  visible");
        System.out.println ("Test case 2 passed successful");
    }

    @Test
    public void TestCase3() {System.out.println ("Authentication functional test 3, Emaill address field");
        SignUpPageElements signUpPageElements = PageFactory.initElements (driver, SignUpPageElements.class);
        signUpPageElements.open ( );
        System.out.println ("Entering 'numbers_only' in Email address field. Error message is...");
        driver.findElement (By.id ("registerName")).sendKeys (ConstantsAuth.USERNAME_NUM_ONLY);
        signUpPageElements.fillForm_Exept_registerName ( );
        String title = driver.findElement (By.xpath ("//*[.='WELCOME']")).getText ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
        System.out.println ("Test case 3 failed. Registration is not passed");notify ( );
        }
        System.out.println ("  missing!");
        signUpPageElements.open ( );
        System.out.println ("Entering 'symbols_only' in Email address field. Error message is...");
        driver.findElement (By.id ("registerName")).sendKeys (ConstantsAuth.USERNAME_SYMBOLS_ONLY);
        signUpPageElements.fillForm_Exept_registerName ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            System.out.println ("Test case 3 failed. Registration is not passed");notify ( );
        }
        System.out.println ("  missing!");
        signUpPageElements.open ( );
        System.out.println ("Entering 'letters_only' in Email address field. Error message is...");
        driver.findElement (By.id ("registerName")).sendKeys (ConstantsAuth.USERNAME_LETTERS_ONLY);
        signUpPageElements.fillForm_Exept_registerName ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
        System.out.println ("Test case 3 failed. Registration is not passed");notify ( );
        }
        System.out.println ("  missing!");
        System.out.println ("Test case 3 passed successful");
    }
    @Test
    public void TestCase4() {System.out.println ("Authentication functional test, FirstName field");
        SignUpPageElements signUpPageElements = PageFactory.initElements (driver, SignUpPageElements.class);
        signUpPageElements.open ( );
        System.out.println ("Entering 'lower_register' in FirstName field. Error message is...");
        driver.findElement (By.id ("FirstName")).sendKeys (ConstantsAuth.FIRSTNAME_LOWER);
        signUpPageElements.fillForm_Exept_FirstName ( );
        String title = driver.findElement (By.xpath ("//*[.='WELCOME']")).getText ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            System.out.println ("Test case 4 failed. Registration is not passed");notify ( );
        }
        System.out.println ("  missing!");
        signUpPageElements.open ( );
        System.out.println ("Entering 'symbols_only' in FirstName field. Error message is...");
        driver.findElement (By.id ("FirstName")).sendKeys (ConstantsAuth.FIRSTNAME_SYMBOLS_ONLY);
        signUpPageElements.fillForm_Exept_FirstName ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            System.out.println ("Test case 4 failed. Registration is not passed");notify ( );
        }
        System.out.println ("  missing!");
        signUpPageElements.open ( );
        System.out.println ("Entering 'numbers_only' in FirstName field. Error message is...");
        driver.findElement (By.id ("FirstName")).sendKeys (ConstantsAuth.FIRSTNAME_NUM_ONLY);
        signUpPageElements.fillForm_Exept_FirstName ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            System.out.println ("Test case 4 failed. Registration is not passed");notify ( );
        }
        System.out.println ("  missing!");
        signUpPageElements.open ( );
        System.out.println ("Entering '40_letters' in FirstName field. Error message is...");
        driver.findElement (By.id ("FirstName")).sendKeys (ConstantsAuth.FIRSTNAME_40_LETTERS);
        signUpPageElements.fillForm_Exept_FirstName ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            System.out.println ("Test case 4 failed. Registration is not passed");notify ( );
        }
        System.out.println ("  missing!");
        System.out.println ("Test case 4 passed successful");
    }

    @Test public void TestCase5() {System.out.println("Authentication test 5, LastName field");
        SignUpPageElements signUpPageElements = PageFactory.initElements (driver, SignUpPageElements.class);
            signUpPageElements.open ();System.out.println("Entering 'lower_register' in LastName field. Error message is...");
        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.LASTNAME_LOWER);
        signUpPageElements.fillForm_Exept_LastName ();
        String title = driver.findElement(By.xpath ("//*[.='WELCOME']")).getText();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Test case 5 failed. Registration is not passed");notify();}
        System.out.println ("  missing!");
            signUpPageElements.open ();System.out.println("Entering 'symbols_only' in LastName field. Error message is...");
        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.LASTNAME_SYMBOLS_ONLY);
        signUpPageElements.fillForm_Exept_LastName ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Test case 5 failed. Registration is not passed");notify();}
        System.out.println ("  missing!");
            signUpPageElements.open ();System.out.println("Entering 'numbers_only' in LastName field. Error message is...");
        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.LASTNAME_NUM_ONLY);
        signUpPageElements.fillForm_Exept_LastName ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Test case 5 failed. Registration is not passed");notify();}
        System.out.println ("  missing!");
            signUpPageElements.open ();System.out.println("Entering '20_letters' in LastName field. Error message is...");
        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.LASTNAME_20_LETTERS);
        signUpPageElements.fillForm_Exept_LastName ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Test case 5 failed. Registration is not passed");notify();}
        System.out.println ("  missing!");
        System.out.println ("Test case 5 passed successful");
    }
    @Test public void TestCase6() { System.out.println("Authentication test 6, Password strength recognition");
        SignUpPageElements signUpPageElements = PageFactory.initElements (driver, SignUpPageElements.class);
            signUpPageElements.open (); System.out.println("Entering 'strong_password' in UserPassword field. Password perceived as...");
        driver.findElement (By.id ("UserPassword")).sendKeys (ConstantsAuth.PASSWORD_STRONG);
        driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys (ConstantsAuth.PASSWORD_STRONG);
        String pwdWeakMsg = driver.findElement(By.xpath ("//*[.='\n"+"                                            Password strength: weak\n"+"                                        ']")).getText();
        String pwdNotWeakMsg = "Test case 6 failed. Password strength perceived not as weak";
        String pwdIsWeak = "  weak";
        String pwdError = "Password strength: weak";
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        System.out.println(pwdIsWeak);
            signUpPageElements.open (); System.out.println("Entering 'weak_password' in UserPassword field. Password perceived as...");
        driver.findElement (By.id ("UserPassword")).sendKeys (ConstantsAuth.PASSWORD_WEAK);
        driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys (ConstantsAuth.PASSWORD_WEAK);
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        System.out.println(pwdIsWeak);
            signUpPageElements.open (); System.out.println("Entering 'normal_password' in UserPassword field. Password perceived as...");
        driver.findElement (By.id ("UserPassword")).sendKeys (ConstantsAuth.PASSWORD_NORMAL);
        driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys (ConstantsAuth.PASSWORD_NORMAL);
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        System.out.println(pwdIsWeak);
            signUpPageElements.open (); System.out.println("Entering '11_letters'(weak password) in UserPassword field. Password perceived as...");
        driver.findElement (By.id ("UserPassword")).sendKeys (ConstantsAuth.PASSWORD_11_LOWER_ONLY);
        driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys (ConstantsAuth.PASSWORD_11_LOWER_ONLY);
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        System.out.println(pwdIsWeak);
            signUpPageElements.open ();System.out.println("Entering '11_numbers'(weak password) in UserPassword field. Password perceived as...");
        driver.findElement (By.id ("UserPassword")).sendKeys (ConstantsAuth.PASSWORD_11_NUM_ONLY);
        driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys (ConstantsAuth.PASSWORD_11_NUM_ONLY);
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        System.out.println(pwdIsWeak);
        System.out.println ("Test case 6 passed successful");
    }
    @Test public void TestCase7() {System.out.println("Authentication test 7, Phone field");
        SignUpPageElements signUpPageElements = PageFactory.initElements (driver, SignUpPageElements.class);
            signUpPageElements.open (); System.out.println("Entering '11_numbers' in Phone field. Error message is...");
        driver.findElement (By.id ("Phone")).sendKeys (ConstantsAuth.PHONE_NUM_11);
        signUpPageElements.fillForm_Exept_Phone ();
        String title = driver.findElement(By.xpath ("//*[.='WELCOME']")).getText();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Test case 7 failed. Phone data perceived as not valid");notify();}
        System.out.println("  missing!");
            signUpPageElements.open (); System.out.println("Entering '10_numbers' in Phone field. Error message is...");
        driver.findElement (By.id ("Phone")).sendKeys (ConstantsAuth.PHONE_NUM_10);
        signUpPageElements.fillForm_Exept_Phone ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Test case 7 failed. Phone data perceived as not valid");notify();}
        System.out.println("  missing!");
            signUpPageElements.open (); System.out.println("Entering 'letters' in Phone field. Error message is...");
        driver.findElement (By.id ("Phone")).sendKeys (ConstantsAuth.PHONE_LETTERS);
        signUpPageElements.fillForm_Exept_Phone ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Test case 7 failed. Phone data perceived as not valid");notify();}
        System.out.println("  missing!");
            signUpPageElements.open (); System.out.println("Entering 'symbols' in Phone field. Error message is...");
        driver.findElement (By.id ("Phone")).sendKeys (ConstantsAuth.PHONE_SYMBOLS_ONLY);
        signUpPageElements.fillForm_Exept_Phone ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Test case 7 failed. Phone data perceived as not valid");notify();}
        System.out.println("  missing!");
        System.out.println ("Test case 7 passed successful");

    }
    @Test public void TestCase8() {System.out.println ("Authentication test 8, Organisation field");
        SignUpPageElements signUpPageElements = PageFactory.initElements (driver, SignUpPageElements.class);
        signUpPageElements.open ( );
        System.out.println ("Entering 'symbols' in Phone field. Error message is...");
        driver.findElement (By.id ("OrgDisplayName")).sendKeys (ConstantsAuth.ORG_SYMBOLS_ONLY);
        signUpPageElements.fillForm_Exept_Organization ( );
        String title = driver.findElement (By.xpath ("//*[.='WELCOME']")).getText ( );
        try { Assert.assertEquals ("WELCOME", title);}
        catch (AssertionError e) {System.out.println ("Test case 8 failed. Organisation data perceived as not valid");notify ();}
        System.out.println ("  missing!");
        signUpPageElements.open ( );System.out.println ("Entering 'numbers' in Phone field. Error message is...");
        driver.findElement (By.id ("OrgDisplayName")).sendKeys (ConstantsAuth.ORG_NUMBERS_ONLY);
        signUpPageElements.fillForm_Exept_Organization ( );
        try { Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) { System.out.println ("Test case 8 failed. Organisation data perceived as not valid"); notify ( );}
        System.out.println ("  missing!");
        System.out.println ("Test case 8 passed successful");
    }
}

