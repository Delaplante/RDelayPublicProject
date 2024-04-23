package utility;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hooks {
    public static browserDriver driver;

    @Before
    public void setDriver() {
        driver = new browserDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
