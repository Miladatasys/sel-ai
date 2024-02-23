import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Golf {
    private static WebDriver driver;
    @Before
    public void setup(){
        //Start Chrome web browser
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Sel-ia\\src\\drivers\\chromedriver.exe");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        //Maximize browser window
        driver.manage().window().maximize();
        driver.get("https://www.admlucid.com/Golf");
    }
    @Test
    public void search(){
        Pages.Golf golf = new Pages.Golf(driver);
        golf.Search();
    }
    @Test
    public void selectCountry(){
        Pages.Golf golf = new Pages.Golf(driver);
        golf.SelectCountry();
    }
    @After
    public void teardown(){
        //Close browser
        driver.quit();
    }
}