package utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class browserDriver {
public static WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    public browserDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver(options);
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
    }
    public void close(){
        driver.close();
    }

}
