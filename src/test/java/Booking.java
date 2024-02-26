import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Booking {
    private static WebDriver driver;
    @Before
    public void setup(){
        //Start Chrome web browser
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Sel-ia\\src\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.admlucid.com/Golf");
    }
    @Test
    public void bookGolf(){
        Pages.Booking book = new Pages.Booking(driver);
        book.BookGolfCourse();
    }
    @After
    public void teardown(){
        //Close browser
        driver.quit();
    }
}