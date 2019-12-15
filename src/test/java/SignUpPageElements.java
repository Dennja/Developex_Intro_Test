import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPageElements {
    private WebDriver driver;
    private WebDriverWait wait;

    public SignUpPageElements(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait (driver, 10);
    }

    public void open() {
        driver.get ("https://reverent-aryabhata-11cf33.netlify.com/");
    }
    public void fillForm_Exept_registerName() {

        driver.findElement (By.id ("FirstName")).sendKeys (ConstantsAuth.FIRSTNAMETRUE);
        driver.findElement (By.id ("LastName")).sendKeys (ConstantsAuth.LASTNAMETRUE);
        driver.findElement (By.id ("UserPassword")).sendKeys (ConstantsAuth.PASSWORD_STRONG);
        driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys (ConstantsAuth.PASSWORD_STRONG);
        driver.findElement (By.id ("Phone")).sendKeys (ConstantsAuth.PHONETRUE);
        driver.findElement (By.id ("OrgDisplayName")).sendKeys (ConstantsAuth.ORG_TRUE);
        driver.findElement (By.id ("signupbtn")).click ( );
    }
    public void fillForm_Exept_FirstName() {
        driver.findElement (By.id ("registerName")).sendKeys (ConstantsAuth.USERNAMETRUE);

        driver.findElement (By.id ("LastName")).sendKeys (ConstantsAuth.LASTNAMETRUE);
        driver.findElement (By.id ("UserPassword")).sendKeys (ConstantsAuth.PASSWORD_STRONG);
        driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys (ConstantsAuth.PASSWORD_STRONG);
        driver.findElement (By.id ("Phone")).sendKeys (ConstantsAuth.PHONETRUE);
        driver.findElement (By.id ("OrgDisplayName")).sendKeys (ConstantsAuth.ORG_TRUE);
        driver.findElement (By.id ("signupbtn")).click ( );
    }
    public void fillForm_Exept_LastName() {
        driver.findElement (By.id ("registerName")).sendKeys (ConstantsAuth.USERNAMETRUE);
        driver.findElement (By.id ("FirstName")).sendKeys (ConstantsAuth.FIRSTNAMETRUE);

        driver.findElement (By.id ("UserPassword")).sendKeys (ConstantsAuth.PASSWORD_STRONG);
        driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys (ConstantsAuth.PASSWORD_STRONG);
        driver.findElement (By.id ("Phone")).sendKeys (ConstantsAuth.PHONETRUE);
        driver.findElement (By.id ("OrgDisplayName")).sendKeys (ConstantsAuth.ORG_TRUE);
        driver.findElement (By.id ("signupbtn")).click ( );
    }
    public void fillForm_Exept_Phone() {
        driver.findElement (By.id ("registerName")).sendKeys (ConstantsAuth.USERNAMETRUE);
        driver.findElement (By.id ("FirstName")).sendKeys (ConstantsAuth.FIRSTNAMETRUE);
        driver.findElement (By.id ("LastName")).sendKeys (ConstantsAuth.LASTNAMETRUE);
        driver.findElement (By.id ("UserPassword")).sendKeys (ConstantsAuth.PASSWORD_STRONG);
        driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys (ConstantsAuth.PASSWORD_STRONG);

        driver.findElement (By.id ("OrgDisplayName")).sendKeys (ConstantsAuth.ORG_TRUE);
        driver.findElement (By.id ("signupbtn")).click ( );
    }
    public void fillForm_Exept_Organization (){
        driver.findElement (By.id ("registerName")).sendKeys (ConstantsAuth.USERNAMETRUE);
        driver.findElement (By.id ("FirstName")).sendKeys (ConstantsAuth.FIRSTNAMETRUE);
        driver.findElement (By.id ("LastName")).sendKeys (ConstantsAuth.LASTNAMETRUE);
        driver.findElement (By.id ("UserPassword")).sendKeys (ConstantsAuth.PASSWORD_STRONG);
        driver.findElement (By.xpath ("//*[@id=\"registerForm\"]/fieldset/div[5]/input")).sendKeys (ConstantsAuth.PASSWORD_STRONG);
        driver.findElement (By.id ("Phone")).sendKeys (ConstantsAuth.PHONETRUE);

        driver.findElement (By.id ("signupbtn")).click ( );}
    }



