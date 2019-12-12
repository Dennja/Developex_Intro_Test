import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class AuthentificationPageTest extends zWebDriverSettings {

    @Test public void TestCase1() { System.out.println("Authentification functional test, data control group");
        driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
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

    @Test public void TestCase2() { System.out.println("Authentification functional test TRUE & TINY");
    driver.get("https://reverent-aryabhata-11cf33.netlify.com/");driver.findElement(By.cssSelector("body")).sendKeys(
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
    driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
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

    @Test public void TestCase4() { System.out.println("First/Last name fields  test 1");
        driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
        driver.findElement(By.id("registerName")).sendKeys(ConstantsAuth.USERNAMETRUE);

 //       driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.FIRSTNAME_LOWER);

        String errorMsg = driver.findElementByClassName ("field-validation-error").getText();
        try {Assert.assertEquals(null,errorMsg);}
        catch (AssertionError e) { System.out.println("CORRUPTED!"); notify();}
//        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.FIRSTNAME_NUM_ONLY);
//        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.FIRSTNAME_SYMBOLS_ONLY);
//        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.FIRSTNAME_40_LETTERS);


        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.LASTNAMETRUE);

        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.PASSWORD_STRONG);
        driver.findElement(By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys(ConstantsAuth.PASSWORD_STRONG);
        driver.findElement(By.id("Phone")).sendKeys(ConstantsAuth.PHONETRUE);
        driver.findElement(By.id("OrgDisplayName")).sendKeys(ConstantsAuth.ORG_TRUE);
        driver.findElement(By.id("signupbtn")).click ();
        }}

//    @Test public void TestCase5() { System.out.println("Authentification functional test 5");
//        driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
//        String title = driver.getTitle();
//        try { Assert.assertTrue(title.equals("Data Analysis: Log In v0.1")); }
//        catch (Exception e){System.out.println("We are not on authorisation page");}
//        driver.findElement(By.id("registerName")).sendKeys(ConstantsAuth.userNameTrue);
//        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.firstNameTrue);
//        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.lastNameTrue);
//        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.passwordStrong);
//        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.passwordStrong);
//        driver.findElement(By.id("Phone")).sendKeys(ConstantsAuth.phoneTrue);
//        driver.findElement(By.id("OrgDisplayName")).sendKeys(ConstantsAuth.organizationTrue);
//        driver.findElement(By.id("signupbtn")).click ();
//        try { Assert.assertTrue(title.equals("Тестовое упражнение")); }
//        catch (Exception e){System.out.println("We have not reached sign-up page");notify();}}
//
//    @Test public void TestCase6() { System.out.println("Authentification functional test 5");
//        driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
//        String title = driver.getTitle();
//        try { Assert.assertTrue(title.equals("Data Analysis: Log In v0.1")); }
//        catch (Exception e){System.out.println("We are not on authorisation page");}
//        driver.findElement(By.id("registerName")).sendKeys(ConstantsAuth.userNameTrue);
//        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.firstNameTrue);
//        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.lastNameTrue);
//        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.passwordStrong);
//        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.passwordStrong);
//        driver.findElement(By.id("Phone")).sendKeys(ConstantsAuth.phoneTrue);
//        driver.findElement(By.id("OrgDisplayName")).sendKeys(ConstantsAuth.organizationTrue);
//        driver.findElement(By.id("signupbtn")).click ();
//        try { Assert.assertTrue(title.equals("Тестовое упражнение")); }
//        catch (Exception e){System.out.println("We have not reached sign-up page");notify();}}
//
//    @Test public void TestCase7() { System.out.println("Authentification functional test 5");
//        driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
//        String title = driver.getTitle();
//        try { Assert.assertTrue(title.equals("Data Analysis: Log In v0.1")); }
//        catch (Exception e){System.out.println("We are not on authorisation page");}
//        driver.findElement(By.id("registerName")).sendKeys(ConstantsAuth.userNameTrue);
//        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.firstNameTrue);
//        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.lastNameTrue);
//        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.passwordStrong);
//        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.passwordStrong);
//        driver.findElement(By.id("Phone")).sendKeys(ConstantsAuth.phoneTrue);
//        driver.findElement(By.id("OrgDisplayName")).sendKeys(ConstantsAuth.organizationTrue);
//        driver.findElement(By.id("signupbtn")).click ();
//        try { Assert.assertTrue(title.equals("Тестовое упражнение")); }
//        catch (Exception e){System.out.println("We have not reached sign-up page");notify();}}
//
//    @Test public void TestCase8() { System.out.println("Authentification functional test 5");
//        driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
//        String title = driver.getTitle();
//        try { Assert.assertTrue(title.equals("Data Analysis: Log In v0.1")); }
//        catch (Exception e){System.out.println("We are not on authorisation page");}
//        driver.findElement(By.id("registerName")).sendKeys(ConstantsAuth.userNameTrue);
//        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.firstNameTrue);
//        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.lastNameTrue);
//        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.passwordStrong);
//        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.passwordStrong);
//        driver.findElement(By.id("Phone")).sendKeys(ConstantsAuth.phoneTrue);
//        driver.findElement(By.id("OrgDisplayName")).sendKeys(ConstantsAuth.organizationTrue);
//        driver.findElement(By.id("signupbtn")).click ();
//        try { Assert.assertTrue(title.equals("Тестовое упражнение")); }
//        catch (Exception e){System.out.println("We have not reached sign-up page");notify();}}
//
//    @Test public void TestCase9() { System.out.println("Authentification functional test 5");
//        driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
//        String title = driver.getTitle();
//        try { Assert.assertTrue(title.equals("Data Analysis: Log In v0.1")); }
//        catch (Exception e){System.out.println("We are not on authorisation page");}
//        driver.findElement(By.id("registerName")).sendKeys(ConstantsAuth.userNameTrue);
//        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.firstNameTrue);
//        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.lastNameTrue);
//        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.passwordStrong);
//        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.passwordStrong);
//        driver.findElement(By.id("Phone")).sendKeys(ConstantsAuth.phoneTrue);
//        driver.findElement(By.id("OrgDisplayName")).sendKeys(ConstantsAuth.organizationTrue);
//        driver.findElement(By.id("signupbtn")).click ();
//        try { Assert.assertTrue(title.equals("Тестовое упражнение")); }
//        catch (Exception e){System.out.println("We have not reached sign-up page");notify();}}
//
//    @Test public void TestCase10() { System.out.println("Authentification functional test 5");
//        driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
//        String title = driver.getTitle();
//        try { Assert.assertTrue(title.equals("Data Analysis: Log In v0.1")); }
//        catch (Exception e){System.out.println("We are not on authorisation page");}
//        driver.findElement(By.id("registerName")).sendKeys(ConstantsAuth.userNameTrue);
//        driver.findElement(By.id("FirstName")).sendKeys(ConstantsAuth.firstNameTrue);
//        driver.findElement(By.id("LastName")).sendKeys(ConstantsAuth.lastNameTrue);
//        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.passwordStrong);
//        driver.findElement(By.id("UserPassword")).sendKeys(ConstantsAuth.passwordStrong);
//        driver.findElement(By.id("Phone")).sendKeys(ConstantsAuth.phoneTrue);
//        driver.findElement(By.id("OrgDisplayName")).sendKeys(ConstantsAuth.organizationTrue);
//        driver.findElement(By.id("signupbtn")).click ();
//        try { Assert.assertTrue(title.equals("Тестовое упражнение")); }
//        catch (Exception e){System.out.println("We have not reached sign-up page");notify();}}