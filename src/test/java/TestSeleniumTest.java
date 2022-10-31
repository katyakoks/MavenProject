import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSeleniumTest {

    static {
        WebDriverManager.chromedriver().setup();
    }

    private WebDriver driver;

    @BeforeMethod
    public void setUp (){
            driver = new ChromeDriver();
        }

    @AfterMethod
    public void tearDown (){
            driver.quit();
        }

    @Test
    public void seleniumTest() throws InterruptedException {
        driver.get("http://google.com/");
        Thread.sleep(3000);}

}
