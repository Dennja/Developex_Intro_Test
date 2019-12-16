import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPageTest extends zWebDriverSettings {
    @Test
    public void TestCase1() {
        PageElement pageElement = PageFactory.initElements (driver, PageElement.class);
        Log log = PageFactory.initElements (driver, Log.class);
        log.test1start ();
        pageElement.open ();
        pageElement.fillForm ();
        String title = driver.findElement (By.xpath ("//*[.='WELCOME']")).getText ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) { log.test1fail ();
        }
        log.test1finish ();
    }
    @Test
    public void TestCase2() {
        PageElement pageElement = PageFactory.initElements (driver, PageElement.class);
        Log log = PageFactory.initElements (driver, Log.class);
        log.test2start ();
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
        //      String tstFail = "\n" + "Test case 2 failed";
        System.out.println ("Email address" +errMsg);
        try {
            Assert.assertEquals (error, pageElement.email_IsEmpty_error.getText ());
        } catch (AssertionError e) { log.test2fail ();
        }
        log.errorShown ();
        System.out.println ("First name" + errMsg);
        try {
            Assert.assertEquals (error, pageElement.firstName_IsEmpty_error.getText ());
        } catch (AssertionError e) {log.test2fail ();
        }
        log.errorShown ();
        System.out.println ("Last name" + errMsg);
        try {
            Assert.assertEquals (error, pageElement._lastName_IsEmpty_error.getText ());
        } catch (AssertionError e) { log.test2fail ();
        }
        log.errorShown ();
        System.out.println ("Password" + errMsg);
        try {
            Assert.assertEquals (error, pageElement.password_IsEmpty_error.getText ());
        } catch (AssertionError e) { log.test2fail ();
        }
        log.errorShown ();
        System.out.println ("Phone" + errMsg);
        try {
            Assert.assertEquals (error, pageElement.phone_IsEmpty_error.getText ());
        } catch (AssertionError e) { log.test2fail ();
        }
        log.errorShown ();
        System.out.println ("Organization name" + errMsg);
        try {
            Assert.assertEquals (error, pageElement.organisation_IsEmpty_error.getText ());
        } catch (AssertionError e) { log.test2fail ();
        }
        log.errorShown ();
        log.test2finish ();
    }

    @Test
    public void TestCase3() {
        PageElement pageElement = PageFactory.initElements (driver, PageElement.class);
        Log log = PageFactory.initElements (driver, Log.class);
        log.test3start ();
        pageElement.open ();
        log.test3numbers ();
        pageElement.email.sendKeys (ConstantsAuth.USERNAME_NUM_ONLY);
        pageElement.fillForm_Except_email ( );
        String title = driver.findElement (By.xpath ("//*[.='WELCOME']")).getText ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            log.test3fail ();
        }
        log.missing ();
        pageElement.open ( );
        log.test3symbols ();
        pageElement.email.sendKeys (ConstantsAuth.USERNAME_SYMBOLS_ONLY);
        pageElement.fillForm_Except_email ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            log.test3fail ();
        }
        log.missing ();
        pageElement.open ( );
        log.test3letters ();
        pageElement.email.sendKeys (ConstantsAuth.USERNAME_LETTERS_ONLY);
        pageElement.fillForm_Except_email ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            log.test3fail ();
        }
        log.missing ();
        log.test3finish ();
    }
    @Test
    public void TestCase4() {
        PageElement pageElement = PageFactory.initElements (driver, PageElement.class);
        Log log = PageFactory.initElements (driver, Log.class);
        log.test4start ();
        pageElement.open();
        log.test4lowReg ();
        pageElement.firstName.sendKeys (ConstantsAuth.FIRSTNAME_LOWER);
        pageElement.fillForm_Except_FirstName ( );
        String title = driver.findElement (By.xpath ("//*[.='WELCOME']")).getText ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            log.test4fail ();
        }
        log.missing ();
        pageElement.open ( );
        log.test4symbols ();
        pageElement.firstName.sendKeys (ConstantsAuth.FIRSTNAME_SYMBOLS_ONLY);
        pageElement.fillForm_Except_FirstName ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            log.test4fail ();
        }
        log.missing ();
        pageElement.open ( );
        log.test4numbers ();
        pageElement.firstName.sendKeys (ConstantsAuth.FIRSTNAME_NUM_ONLY);
        pageElement.fillForm_Except_FirstName ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            System.out.println ("Test case 4 failed. Registration is not passed");notify ( );
        }
        log.missing ();
        pageElement.open ( );
        log.test4letters40 ();
        pageElement.firstName.sendKeys (ConstantsAuth.FIRSTNAME_40_LETTERS);
        pageElement.fillForm_Except_FirstName ( );
        try {
            Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) {
            log.test4fail ();
        }
        log.missing ();
        log.test4finish ();
    }

    @Test public void TestCase5() {
        PageElement pageElement = PageFactory.initElements (driver, PageElement.class);
        Log log = PageFactory.initElements (driver, Log.class);
        log.test5start ();
        pageElement.open();
        log.test5lowReg ();
        pageElement.lastName.sendKeys(ConstantsAuth.LASTNAME_LOWER);
        pageElement.fillForm_Except_LastName ();
        String title = driver.findElement(By.xpath ("//*[.='WELCOME']")).getText();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { log.test5fail ( );
        }
        log.missing ();
        pageElement.open ();
        log.test5symbols ();
        pageElement.lastName.sendKeys(ConstantsAuth.LASTNAME_SYMBOLS_ONLY);
        pageElement.fillForm_Except_LastName ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { log.test5fail ( );
        }
        log.missing ();
        pageElement.open ();
        log.test5numbers ();
        pageElement.lastName.sendKeys(ConstantsAuth.LASTNAME_NUM_ONLY);
        pageElement.fillForm_Except_LastName ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { log.test5fail ( );
        }
        log.missing ();
        pageElement.open ();
        log.test5letters20 ();
        pageElement.lastName.sendKeys(ConstantsAuth.LASTNAME_20_LETTERS);
        pageElement.fillForm_Except_LastName ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { log.test5fail ( );
        }
        log.missing ();
        log.test5finish ();
    }
    @Test public void TestCase6() {
        PageElement pageElement = PageFactory.initElements (driver, PageElement.class);
        Log log = PageFactory.initElements (driver, Log.class);
        log.test6start ();
        pageElement.open();
        log.test6strong ();
        pageElement.password.sendKeys (ConstantsAuth.PASSWORD_STRONG);
        pageElement.password_conf.sendKeys (ConstantsAuth.PASSWORD_STRONG);
        String pwdWeakMsg = driver.findElement(By.xpath ("//*[.='\n"+"                                            Password strength: weak\n"+"                                        ']")).getText();
        String pwdNotWeakMsg = "Test case 6 failed. Password strength perceived not as weak";
        String pwdError = "Password strength: weak";
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        log.test6pwdWeak ();
        pageElement.open ();
        log.test6weak ();
        pageElement.password.sendKeys (ConstantsAuth.PASSWORD_WEAK);
        pageElement.password_conf.sendKeys (ConstantsAuth.PASSWORD_WEAK);
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        log.test6pwdWeak ();
        pageElement.open ();
        log.test6normal ();
        pageElement.password.sendKeys (ConstantsAuth.PASSWORD_NORMAL);
        pageElement.password_conf.sendKeys (ConstantsAuth.PASSWORD_NORMAL);
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        log.test6pwdWeak ();
        pageElement.open ();
        log.test6lowerletters11 ();
        pageElement.password.sendKeys (ConstantsAuth.PASSWORD_11_LOWER_ONLY);
        pageElement.password_conf.sendKeys (ConstantsAuth.PASSWORD_11_LOWER_ONLY);
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        log.test6pwdWeak ();
        pageElement.open ();
        log.test6numbers11 ();
        pageElement.password.sendKeys (ConstantsAuth.PASSWORD_11_NUM_ONLY);
        pageElement.password_conf.sendKeys (ConstantsAuth.PASSWORD_11_NUM_ONLY);
        try { Assert.assertEquals (pwdError,pwdWeakMsg);}
        catch (AssertionError e) { System.out.println(pwdNotWeakMsg);notify();}
        log.test6pwdWeak ();
        log.test6finish ();
    }
    @Test public void TestCase7() {
        PageElement pageElement = PageFactory.initElements (driver, PageElement.class);
        Log log = PageFactory.initElements (driver, Log.class);
        log.test7start ();
        pageElement.open();
        log.test7numbers11 ();
        pageElement.phone.sendKeys (ConstantsAuth.PHONE_NUM_11);
        pageElement.fillForm_Except_Phone ();
        String title = driver.findElement(By.xpath ("//*[.='WELCOME']")).getText();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { log.test7fail ( );
        }
        log.missing ();
        pageElement.open ();
        log.test7numbers10 ();
        pageElement.phone.sendKeys (ConstantsAuth.PHONE_NUM_10);
        pageElement.fillForm_Except_Phone ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { log.test7fail ();
        }
        log.missing ();
        pageElement.open ();
        log.test7letters ();
        pageElement.phone.sendKeys (ConstantsAuth.PHONE_LETTERS);
        pageElement.fillForm_Except_Phone ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) {log.test7fail ( );
        }
        log.missing ();
        pageElement.open ();
        log.test7symbols ();
        pageElement.phone.sendKeys (ConstantsAuth.PHONE_SYMBOLS_ONLY);
        pageElement.fillForm_Except_Phone ();
        try { Assert.assertEquals ("WELCOME",title);}
        catch (AssertionError e) { log.test7fail ();
        }
        log.missing ();
        log.test7finish ();
    }
    @Test public void TestCase8() {
        PageElement pageElement = PageFactory.initElements (driver, PageElement.class);
        Log log = PageFactory.initElements (driver, Log.class);
        log.test8start ();
        pageElement.open();
        log.test8symbols ();
        pageElement.organization.sendKeys (ConstantsAuth.ORG_SYMBOLS_ONLY);
        pageElement.fillForm_Except_Organization ( );
        String title = driver.findElement (By.xpath ("//*[.='WELCOME']")).getText ( );
        try { Assert.assertEquals ("WELCOME", title);}
        catch (AssertionError e) {
            log.test8fail ( );
        }
        log.missing ();
        pageElement.open ( );
        log.test8numbers ();
        pageElement.organization.sendKeys (ConstantsAuth.ORG_NUMBERS_ONLY);
        pageElement.fillForm_Except_Organization ( );
        try { Assert.assertEquals ("WELCOME", title);
        } catch (AssertionError e) { log.test8fail ();}
        log.missing ();
        log.test8finish ();
    }
}

