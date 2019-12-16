import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageElement {
    private WebDriver driver;

    public PageElement(WebDriver driver) {this.driver = driver; }

    public void open() {driver.get ("https://reverent-aryabhata-11cf33.netlify.com/");}

    @FindBy(id = "registerName")
    public WebElement email;
    @FindBy(id = "FirstName")
    public WebElement firstName;
    @FindBy (id = "LastName")
    public WebElement lastName;
    @FindBy (id = "UserPassword")
    public WebElement password;
    @FindBy(xpath = "//*[@id=\"registerForm\"]/fieldset/div[5]/input")
    public WebElement password_conf;
    @FindBy(id = "Phone")
    public WebElement phone;
    @FindBy(id = "OrgDisplayName")
    public WebElement organization;
    @FindBy(id = "signupbtn")
    public WebElement signupBtn;

    @FindBy(xpath = "//*[@id=\"registerForm\"]/fieldset/span[1]/span")
    public WebElement email_IsEmpty_error;
    @FindBy(xpath = "//*[@id=\"registerForm\"]/fieldset/span[2]/span")
    public WebElement firstName_IsEmpty_error;
    @FindBy(xpath = "//*[@id=\"registerForm\"]/fieldset/span[3]/span")
    public WebElement _lastName_IsEmpty_error;
    @FindBy(xpath = "//*[@id=\"registerForm\"]/fieldset/span[4]/span")
    public WebElement password_IsEmpty_error;
    @FindBy(xpath = "//*[@id=\"registerForm\"]/fieldset/span[7]/span")
    public WebElement phone_IsEmpty_error;
    @FindBy(xpath = "//*[@id=\"registerForm\"]/fieldset/span[8]/span")
    public WebElement organisation_IsEmpty_error;

    public void fillForm() {
        email.sendKeys (ConstantsAuth.USERNAMETRUE);
        firstName.sendKeys (ConstantsAuth.FIRSTNAMETRUE);
        lastName.sendKeys (ConstantsAuth.LASTNAMETRUE);
        password.sendKeys (ConstantsAuth.PASSWORD_STRONG);
        password_conf.sendKeys (ConstantsAuth.PASSWORD_STRONG);
        phone.sendKeys (ConstantsAuth.PHONETRUE);
        organization.sendKeys (ConstantsAuth.ORG_TRUE);
        signupBtn.click ( );
    }
    public void fillForm_Except_email() {

        firstName.sendKeys (ConstantsAuth.FIRSTNAMETRUE);
        lastName.sendKeys (ConstantsAuth.LASTNAMETRUE);
        password.sendKeys (ConstantsAuth.PASSWORD_STRONG);
        password_conf.sendKeys (ConstantsAuth.PASSWORD_STRONG);
        phone.sendKeys (ConstantsAuth.PHONETRUE);
        organization.sendKeys (ConstantsAuth.ORG_TRUE);
        signupBtn.click ( );
    }
    public void fillForm_Except_FirstName() {
        email.sendKeys (ConstantsAuth.USERNAMETRUE);

        lastName.sendKeys (ConstantsAuth.LASTNAMETRUE);
        password.sendKeys (ConstantsAuth.PASSWORD_STRONG);
        password_conf.sendKeys (ConstantsAuth.PASSWORD_STRONG);
        phone.sendKeys (ConstantsAuth.PHONETRUE);
        organization.sendKeys (ConstantsAuth.ORG_TRUE);
        signupBtn.click ( );
    }
    public void fillForm_Except_LastName() {
        email.sendKeys (ConstantsAuth.USERNAMETRUE);
        firstName.sendKeys (ConstantsAuth.FIRSTNAMETRUE);

        password.sendKeys (ConstantsAuth.PASSWORD_STRONG);
        password_conf.sendKeys (ConstantsAuth.PASSWORD_STRONG);
        phone.sendKeys (ConstantsAuth.PHONETRUE);
        organization.sendKeys (ConstantsAuth.ORG_TRUE);
        signupBtn.click ( );
    }
    public void fillForm_Except_Phone() {
        email.sendKeys (ConstantsAuth.USERNAMETRUE);
        firstName.sendKeys (ConstantsAuth.FIRSTNAMETRUE);
        lastName.sendKeys (ConstantsAuth.LASTNAMETRUE);
        password.sendKeys (ConstantsAuth.PASSWORD_STRONG);
        password_conf.sendKeys (ConstantsAuth.PASSWORD_STRONG);

        organization.sendKeys (ConstantsAuth.ORG_TRUE);
        signupBtn.click ( );
    }
    public void fillForm_Except_Organization (){
        email.sendKeys (ConstantsAuth.USERNAMETRUE);
        firstName.sendKeys (ConstantsAuth.FIRSTNAMETRUE);
        lastName.sendKeys (ConstantsAuth.LASTNAMETRUE);
        password.sendKeys (ConstantsAuth.PASSWORD_STRONG);
        password_conf.sendKeys (ConstantsAuth.PASSWORD_STRONG);
        phone.sendKeys (ConstantsAuth.PHONETRUE);

        signupBtn.click ( );
    }
}
