import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class AuthenticationPageTest extends zWebDriverSettings {

    @Test
    public void TestCase1() {System.out.println ("Authentication functional test 1, all valid data");
        PageElemet pageElement = PageFactory.initElements (driver, PageElemet.class);
        pageElement.open ();
        pageElement.fillForm ();
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
        PageElemet pageElement = PageFactory.initElements (driver, PageElemet.class);
        pageElement.open ();
        pageElement.signupBtn.click ();
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
        System.out.println ("Email address field error message is...");
        try {
            Assert.assertEquals (error, pageElement.email_IsEmpty_error.getText ());
        } catch (AssertionError e) {
            System.out.println ("  missing!" + tstFail);
            notify ( );
        }
        System.out.println ("  visible");
        System.out.println ("First name" + errMsg);
        try {
            Assert.assertEquals (error, pageElement.firstName_IsEmpty_error.getText ());
        } catch (AssertionError e) {
            System.out.println ("  missing!" + tstFail);
            notify ( );
        }
        System.out.println ("  visible");
        System.out.println ("Last name" + errMsg);
        try {
            Assert.assertEquals (error, pageElement._lastName_IsEmpty_error.getText ());
        } catch (AssertionError e) {
            System.out.println ("  missing!" + tstFail);
            notify ( );
        }
        System.out.println ("  visible");
        System.out.println ("Password" + errMsg);
        try {
            Assert.assertEquals (error, pageElement.password_IsEmpty_error.getText ());
        } catch (AssertionError e) {
            System.out.println ("  missing!" + tstFail);
            notify ( );
        }
        System.out.println ("  visible");
        System.out.println ("Phone" + errMsg);
        try {
            Assert.assertEquals (error, pageElement.phone_IsEmpty_error.getText ());
        } catch (AssertionError e) {
            System.out.println ("  missing!" + tstFail);
            notify ( );
        }
        System.out.println ("  visible");
        System.out.println ("Organization name" + errMsg);
        try {
            Assert.assertEquals (error, pageElement.organisation_IsEmpty_error.getText ());
        } catch (AssertionError e) {
            System.out.println ("  missing!" + tstFail);
            notify ( );
        }
        System.out.println ("  visible");
        System.out.println ("Test case 2 passed successful");
    }

    @Test
    public void TestCase3() {System.out.println ("Authentication functional test 3, Emaill address field");
        PageElemet pageElement = PageFactory.initElements (driver, PageElemet.class);
        pageElement.open ();
        System.out.println ("Entering 'numbers_only' in Email address field. Error message is...");
        pageElement.email.sendKeys (ConstantsAuth.USERNAME_NUM_ONLY);
        pageElement.fillForm_Except_email ( );
        String title = driver.findElement (By.xpath ("//*[.='WELCOME']")).getText ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
        System.out.println ("Test case 3 failed. Registration is not passed");notify ( );
        }
        System.out.println ("  missing!");
        pageElement.open ( );
        System.out.println ("Entering 'symbols_only' in Email address field. Error message is...");
        pageElement.email.sendKeys (ConstantsAuth.USERNAME_SYMBOLS_ONLY);
        pageElement.fillForm_Except_email ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            System.out.println ("Test case 3 failed. Registration is not passed");notify ( );
        }
        System.out.println ("  missing!");
        pageElement.open ( );
        System.out.println ("Entering 'letters_only' in Email address field. Error message is...");
        pageElement.email.sendKeys (ConstantsAuth.USERNAME_LETTERS_ONLY);
        pageElement.fillForm_Except_email ( );
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
        PageElemet pageElement = PageFactory.initElements (driver, PageElemet.class);
        pageElement.open();
        System.out.println ("Entering 'lower_register' in FirstName field. Error message is...");
        pageElement.firstName.sendKeys (ConstantsAuth.FIRSTNAME_LOWER);
        pageElement.fillForm_Except_FirstName ( );
        String title = driver.findElement (By.xpath ("//*[.='WELCOME']")).getText ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            System.out.println ("Test case 4 failed. Registration is not passed");notify ( );
        }
        System.out.println ("  missing!");
        pageElement.open ( );
        System.out.println ("Entering 'symbols_only' in FirstName field. Error message is...");
        pageElement.firstName.sendKeys (ConstantsAuth.FIRSTNAME_SYMBOLS_ONLY);
        pageElement.fillForm_Except_FirstName ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            System.out.println ("Test case 4 failed. Registration is not passed");notify ( );
        }
        System.out.println ("  missing!");
        pageElement.open ( );
        System.out.println ("Entering 'numbers_only' in FirstName field. Error message is...");
        pageElement.firstName.sendKeys (ConstantsAuth.FIRSTNAME_NUM_ONLY);
        pageElement.fillForm_Except_FirstName ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            System.out.println ("Test case 4 failed. Registration is not passed");notify ( );
        }
        System.out.println ("  missing!");
        pageElement.open ( );
        System.out.println ("Entering '40_letters' in FirstName field. Error message is...");
        pageElement.firstName.sendKeys (ConstantsAuth.FIRSTNAME_40_LETTERS);
        pageElement.fillForm_Except_FirstName ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            System.out.println ("Test case 4 failed. Registration is not passed");notify ( );
        }
        System.out.println ("  missing!");
        System.out.println ("Test case 4 passed successful");
    }

    @Test public void TestCase5() {System.out.println("Authentication test 5, LastName field");
        PageElemet pageElement = PageFactory.initElements (driver, PageElemet.class);
        pageElement.open(); System.out.println("Entering 'lower_register' in LastName field. Error message is...");
        pageElement.laststName.sendKeys(ConstantsAuth.LASTNAME_LOWER);
        pageElement.fillForm_Except_LastName ();
        String title = driver.findElement(By.xpath ("//*[.='WELCOME']")).getText();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Test case 5 failed. Registration is not passed");notify();}
        System.out.println ("  missing!");
        pageElement.open (); System.out.println("Entering 'symbols_only' in LastName field. Error message is...");
        pageElement.laststName.sendKeys(ConstantsAuth.LASTNAME_SYMBOLS_ONLY);
        pageElement.fillForm_Except_LastName ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Test case 5 failed. Registration is not passed");notify();}
        System.out.println ("  missing!");
        pageElement.open (); System.out.println("Entering 'numbers_only' in LastName field. Error message is...");
        pageElement.laststName.sendKeys(ConstantsAuth.LASTNAME_NUM_ONLY);
        pageElement.fillForm_Except_LastName ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Test case 5 failed. Registration is not passed");notify();}
        System.out.println ("  missing!");
        pageElement.open (); System.out.println("Entering '20_letters' in LastName field. Error message is...");
        pageElement.laststName.sendKeys(ConstantsAuth.LASTNAME_20_LETTERS);
        pageElement.fillForm_Except_LastName ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Test case 5 failed. Registration is not passed");notify();}
        System.out.println ("  missing!");
        System.out.println ("Test case 5 passed successful");
    }
    @Test public void TestCase6() { System.out.println("Authentication test 6, Password strength recognition");
        PageElemet pageElement = PageFactory.initElements (driver, PageElemet.class);
        pageElement.open(); System.out.println("Entering 'strong_password' in UserPassword field. Password perceived as...");
        pageElement.password.sendKeys (ConstantsAuth.PASSWORD_STRONG);
        pageElement.password_conf.sendKeys (ConstantsAuth.PASSWORD_STRONG);
        String pwdWeakMsg = driver.findElement(By.xpath ("//*[.='\n"+"                                            Password strength: weak\n"+"                                        ']")).getText();
        String pwdNotWeakMsg = "Test case 6 failed. Password strength perceived not as weak";
        String pwdIsWeak = "  weak";
        String pwdError = "Password strength: weak";
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        System.out.println(pwdIsWeak);
        pageElement.open (); System.out.println("Entering 'weak_password' in UserPassword field. Password perceived as...");
        pageElement.password.sendKeys (ConstantsAuth.PASSWORD_WEAK);
        pageElement.password_conf.sendKeys (ConstantsAuth.PASSWORD_WEAK);
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        System.out.println(pwdIsWeak);
        pageElement.open (); System.out.println("Entering 'normal_password' in UserPassword field. Password perceived as...");
        pageElement.password.sendKeys (ConstantsAuth.PASSWORD_NORMAL);
        pageElement.password_conf.sendKeys (ConstantsAuth.PASSWORD_NORMAL);
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        System.out.println(pwdIsWeak);
        pageElement.open (); System.out.println("Entering '11_letters'(weak password) in UserPassword field. Password perceived as...");
        pageElement.password.sendKeys (ConstantsAuth.PASSWORD_11_LOWER_ONLY);
        pageElement.password_conf.sendKeys (ConstantsAuth.PASSWORD_11_LOWER_ONLY);
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        System.out.println(pwdIsWeak);
        pageElement.open ();System.out.println("Entering '11_numbers'(weak password) in UserPassword field. Password perceived as...");
        pageElement.password.sendKeys (ConstantsAuth.PASSWORD_11_NUM_ONLY);
        pageElement.password_conf.sendKeys (ConstantsAuth.PASSWORD_11_NUM_ONLY);
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        System.out.println(pwdIsWeak);
        System.out.println ("Test case 6 passed successful");
    }
    @Test public void TestCase7() {System.out.println("Authentication test 7, Phone field");
        PageElemet pageElement = PageFactory.initElements (driver, PageElemet.class);
        pageElement.open(); System.out.println("Entering '11_numbers' in Phone field. Error message is...");
        pageElement.phone.sendKeys (ConstantsAuth.PHONE_NUM_11);
        pageElement.fillForm_Except_Phone ();
        String title = driver.findElement(By.xpath ("//*[.='WELCOME']")).getText();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Test case 7 failed. Phone data perceived as not valid");notify();}
        System.out.println("  missing!");
        pageElement.open (); System.out.println("Entering '10_numbers' in Phone field. Error message is...");
        pageElement.phone.sendKeys (ConstantsAuth.PHONE_NUM_10);
        pageElement.fillForm_Except_Phone ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Test case 7 failed. Phone data perceived as not valid");notify();}
        System.out.println("  missing!");
        pageElement.open (); System.out.println("Entering 'letters' in Phone field. Error message is...");
        pageElement.phone.sendKeys (ConstantsAuth.PHONE_LETTERS);
        pageElement.fillForm_Except_Phone ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Test case 7 failed. Phone data perceived as not valid");notify();}
        System.out.println("  missing!");
        pageElement.open (); System.out.println("Entering 'symbols' in Phone field. Error message is...");
        pageElement.phone.sendKeys (ConstantsAuth.PHONE_SYMBOLS_ONLY);
        pageElement.fillForm_Except_Phone ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { System.out.println("Test case 7 failed. Phone data perceived as not valid");notify();}
        System.out.println("  missing!");
        System.out.println ("Test case 7 passed successful");
    }
    @Test public void TestCase8() {System.out.println ("Authentication test 8, Organisation field");
        PageElemet pageElement = PageFactory.initElements (driver, PageElemet.class);
        pageElement.open();
        System.out.println ("Entering 'symbols' in Phone field. Error message is...");
        pageElement.organization.sendKeys (ConstantsAuth.ORG_SYMBOLS_ONLY);
        pageElement.fillForm_Except_Organization ( );
        String title = driver.findElement (By.xpath ("//*[.='WELCOME']")).getText ( );
        try { Assert.assertEquals ("WELCOME", title);}
        catch (AssertionError e) {System.out.println ("Test case 8 failed. Organisation data perceived as not valid");notify ();}
        System.out.println ("  missing!");
        pageElement.open ( );System.out.println ("Entering 'numbers' in Phone field. Error message is...");
        pageElement.organization.sendKeys (ConstantsAuth.ORG_NUMBERS_ONLY);
        pageElement.fillForm_Except_Organization ( );
        try { Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) { System.out.println ("Test case 8 failed. Organisation data perceived as not valid"); notify ( );}
        System.out.println ("  missing!");
        System.out.println ("Test case 8 passed successful");
    }
}

