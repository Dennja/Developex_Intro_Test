import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class authentificationPageTest extends zWebDriverSettings {

    @Test public void TestCase1() { System.out.println("Authentification functional test TRUE");
        driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
        driver.findElement(By.id("registerName")).sendKeys(zAuth.userNameTrue);
        driver.findElement(By.id("FirstName")).sendKeys(zAuth.firstNameTrue);
        driver.findElement(By.id("LastName")).sendKeys(zAuth.lastNameTrue);
        driver.findElement(By.id("UserPassword")).sendKeys(zAuth.passwordStrong);
        // ID поля ввода пароля и поля подтверждения пароля идентичны - делаем костыль
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB, zAuth.passwordStrong);
        driver.findElement(By.id("Phone")).sendKeys(zAuth.phoneTrue);
        driver.findElement(By.id("OrgDisplayName")).sendKeys(zAuth.organizationTrue);
        driver.findElement(By.id("signupbtn")).click ();
        String title = driver.getTitle();
        try { Assert.assertTrue(title.equals("Test exercise")); }
        catch (Exception e){System.out.println("we did not finish the registration process");notify();}}

    @Test public void TestCase2() { System.out.println("Authentification functional test TRUE & TINY");
    driver.get("https://reverent-aryabhata-11cf33.netlify.com/");driver.findElement(By.cssSelector("body")).sendKeys(
        Keys.TAB, zAuth.userNameTrue,
        Keys.TAB, zAuth.firstNameTrue,
        Keys.TAB, zAuth.lastNameTrue,
        Keys.TAB, zAuth.passwordStrong,
        Keys.TAB, zAuth.passwordStrong,
        Keys.TAB, zAuth.phoneTrue,
        Keys.TAB, zAuth.organizationTrue);
        driver.findElement(By.id("signupbtn")).click ();
        String title = driver.getTitle();
        try { Assert.assertTrue(title.equals("Test exercise")); }
        catch (Exception e){System.out.println("we did not pass the registration");notify();}}

//    @Test public void TestCase3() { System.out.println("Authentification functional test 3");
//        driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
//        String title = driver.getTitle();
//        try { Assert.assertTrue(title.equals("Data Analysis: Log In v0.1")); }
//        catch (Exception e){System.out.println("We are not on authorisation page");}
//        driver.findElement(By.id("registerName")).sendKeys(zAuth.userNameTrue);
//        driver.findElement(By.id("FirstName")).sendKeys(zAuth.firstNameTrue);
//        driver.findElement(By.id("LastName")).sendKeys(zAuth.lastNameTrue);
//        driver.findElement(By.id("UserPassword")).sendKeys(zAuth.passwordStrong);
//        driver.findElement(By.id("UserPassword")).sendKeys(zAuth.passwordStrong);
//        driver.findElement(By.id("Phone")).sendKeys(zAuth.phoneTrue);
//        driver.findElement(By.id("OrgDisplayName")).sendKeys(zAuth.organizationTrue);
//        driver.findElement(By.id("signupbtn")).click ();
//        try { Assert.assertTrue(title.equals("Тестовое упражнение")); }
//        catch (Exception e){System.out.println("We have not reached sign-up page");notify();}}
//
//    @Test public void TestCase4() { System.out.println("Authentification functional test 4");
//        driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
//        String title = driver.getTitle();
//        try { Assert.assertTrue(title.equals("Data Analysis: Log In v0.1")); }
//        catch (Exception e){System.out.println("We are not on authorisation page");}
//        driver.findElement(By.id("registerName")).sendKeys(zAuth.userNameTrue);
//        driver.findElement(By.id("FirstName")).sendKeys(zAuth.firstNameTrue);
//        driver.findElement(By.id("LastName")).sendKeys(zAuth.lastNameTrue);
//        driver.findElement(By.id("UserPassword")).sendKeys(zAuth.passwordStrong);
//        driver.findElement(By.id("UserPassword")).sendKeys(zAuth.passwordStrong);
//        driver.findElement(By.id("Phone")).sendKeys(zAuth.phoneTrue);
//        driver.findElement(By.id("OrgDisplayName")).sendKeys(zAuth.organizationTrue);
//        driver.findElement(By.id("signupbtn")).click ();
//        try { Assert.assertTrue(title.equals("Тестовое упражнение")); }
//        catch (Exception e){System.out.println("We have not reached sign-up page");notify();}}
//
//    @Test public void TestCase5() { System.out.println("Authentification functional test 5");
//        driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
//        String title = driver.getTitle();
//        try { Assert.assertTrue(title.equals("Data Analysis: Log In v0.1")); }
//        catch (Exception e){System.out.println("We are not on authorisation page");}
//        driver.findElement(By.id("registerName")).sendKeys(zAuth.userNameTrue);
//        driver.findElement(By.id("FirstName")).sendKeys(zAuth.firstNameTrue);
//        driver.findElement(By.id("LastName")).sendKeys(zAuth.lastNameTrue);
//        driver.findElement(By.id("UserPassword")).sendKeys(zAuth.passwordStrong);
//        driver.findElement(By.id("UserPassword")).sendKeys(zAuth.passwordStrong);
//        driver.findElement(By.id("Phone")).sendKeys(zAuth.phoneTrue);
//        driver.findElement(By.id("OrgDisplayName")).sendKeys(zAuth.organizationTrue);
//        driver.findElement(By.id("signupbtn")).click ();
//        try { Assert.assertTrue(title.equals("Тестовое упражнение")); }
//        catch (Exception e){System.out.println("We have not reached sign-up page");notify();}}
//
//    @Test public void TestCase6() { System.out.println("Authentification functional test 5");
//        driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
//        String title = driver.getTitle();
//        try { Assert.assertTrue(title.equals("Data Analysis: Log In v0.1")); }
//        catch (Exception e){System.out.println("We are not on authorisation page");}
//        driver.findElement(By.id("registerName")).sendKeys(zAuth.userNameTrue);
//        driver.findElement(By.id("FirstName")).sendKeys(zAuth.firstNameTrue);
//        driver.findElement(By.id("LastName")).sendKeys(zAuth.lastNameTrue);
//        driver.findElement(By.id("UserPassword")).sendKeys(zAuth.passwordStrong);
//        driver.findElement(By.id("UserPassword")).sendKeys(zAuth.passwordStrong);
//        driver.findElement(By.id("Phone")).sendKeys(zAuth.phoneTrue);
//        driver.findElement(By.id("OrgDisplayName")).sendKeys(zAuth.organizationTrue);
//        driver.findElement(By.id("signupbtn")).click ();
//        try { Assert.assertTrue(title.equals("Тестовое упражнение")); }
//        catch (Exception e){System.out.println("We have not reached sign-up page");notify();}}
//
//    @Test public void TestCase7() { System.out.println("Authentification functional test 5");
//        driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
//        String title = driver.getTitle();
//        try { Assert.assertTrue(title.equals("Data Analysis: Log In v0.1")); }
//        catch (Exception e){System.out.println("We are not on authorisation page");}
//        driver.findElement(By.id("registerName")).sendKeys(zAuth.userNameTrue);
//        driver.findElement(By.id("FirstName")).sendKeys(zAuth.firstNameTrue);
//        driver.findElement(By.id("LastName")).sendKeys(zAuth.lastNameTrue);
//        driver.findElement(By.id("UserPassword")).sendKeys(zAuth.passwordStrong);
//        driver.findElement(By.id("UserPassword")).sendKeys(zAuth.passwordStrong);
//        driver.findElement(By.id("Phone")).sendKeys(zAuth.phoneTrue);
//        driver.findElement(By.id("OrgDisplayName")).sendKeys(zAuth.organizationTrue);
//        driver.findElement(By.id("signupbtn")).click ();
//        try { Assert.assertTrue(title.equals("Тестовое упражнение")); }
//        catch (Exception e){System.out.println("We have not reached sign-up page");notify();}}
//
//    @Test public void TestCase8() { System.out.println("Authentification functional test 5");
//        driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
//        String title = driver.getTitle();
//        try { Assert.assertTrue(title.equals("Data Analysis: Log In v0.1")); }
//        catch (Exception e){System.out.println("We are not on authorisation page");}
//        driver.findElement(By.id("registerName")).sendKeys(zAuth.userNameTrue);
//        driver.findElement(By.id("FirstName")).sendKeys(zAuth.firstNameTrue);
//        driver.findElement(By.id("LastName")).sendKeys(zAuth.lastNameTrue);
//        driver.findElement(By.id("UserPassword")).sendKeys(zAuth.passwordStrong);
//        driver.findElement(By.id("UserPassword")).sendKeys(zAuth.passwordStrong);
//        driver.findElement(By.id("Phone")).sendKeys(zAuth.phoneTrue);
//        driver.findElement(By.id("OrgDisplayName")).sendKeys(zAuth.organizationTrue);
//        driver.findElement(By.id("signupbtn")).click ();
//        try { Assert.assertTrue(title.equals("Тестовое упражнение")); }
//        catch (Exception e){System.out.println("We have not reached sign-up page");notify();}}
//
//    @Test public void TestCase9() { System.out.println("Authentification functional test 5");
//        driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
//        String title = driver.getTitle();
//        try { Assert.assertTrue(title.equals("Data Analysis: Log In v0.1")); }
//        catch (Exception e){System.out.println("We are not on authorisation page");}
//        driver.findElement(By.id("registerName")).sendKeys(zAuth.userNameTrue);
//        driver.findElement(By.id("FirstName")).sendKeys(zAuth.firstNameTrue);
//        driver.findElement(By.id("LastName")).sendKeys(zAuth.lastNameTrue);
//        driver.findElement(By.id("UserPassword")).sendKeys(zAuth.passwordStrong);
//        driver.findElement(By.id("UserPassword")).sendKeys(zAuth.passwordStrong);
//        driver.findElement(By.id("Phone")).sendKeys(zAuth.phoneTrue);
//        driver.findElement(By.id("OrgDisplayName")).sendKeys(zAuth.organizationTrue);
//        driver.findElement(By.id("signupbtn")).click ();
//        try { Assert.assertTrue(title.equals("Тестовое упражнение")); }
//        catch (Exception e){System.out.println("We have not reached sign-up page");notify();}}
//
//    @Test public void TestCase10() { System.out.println("Authentification functional test 5");
//        driver.get("https://reverent-aryabhata-11cf33.netlify.com/");
//        String title = driver.getTitle();
//        try { Assert.assertTrue(title.equals("Data Analysis: Log In v0.1")); }
//        catch (Exception e){System.out.println("We are not on authorisation page");}
//        driver.findElement(By.id("registerName")).sendKeys(zAuth.userNameTrue);
//        driver.findElement(By.id("FirstName")).sendKeys(zAuth.firstNameTrue);
//        driver.findElement(By.id("LastName")).sendKeys(zAuth.lastNameTrue);
//        driver.findElement(By.id("UserPassword")).sendKeys(zAuth.passwordStrong);
//        driver.findElement(By.id("UserPassword")).sendKeys(zAuth.passwordStrong);
//        driver.findElement(By.id("Phone")).sendKeys(zAuth.phoneTrue);
//        driver.findElement(By.id("OrgDisplayName")).sendKeys(zAuth.organizationTrue);
//        driver.findElement(By.id("signupbtn")).click ();
//        try { Assert.assertTrue(title.equals("Тестовое упражнение")); }
//        catch (Exception e){System.out.println("We have not reached sign-up page");notify();}}
       }