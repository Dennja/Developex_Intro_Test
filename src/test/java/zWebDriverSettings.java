import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class zWebDriverSettings { public ChromeDriver driver;
    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "C://CH//chromedriver.exe");
        driver = new ChromeDriver(); System.out.println("START");}
    @After public  void close(){
        driver.quit();
        System.out.println("FINISH");}}