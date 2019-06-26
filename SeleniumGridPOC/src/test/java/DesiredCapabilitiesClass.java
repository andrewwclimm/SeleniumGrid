/**
 * Created by andreiclim on 27/06/2019.
 */

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DesiredCapabilitiesClass {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    public String baseUrl, nodeURL;

    public RemoteWebDriver getDriver () {

       return driver.get();
    }

    @BeforeMethod
    public void setup () throws MalformedURLException {

        baseUrl = "http://automationpractice.com/index.php";
        nodeURL ="http://172.20.10.2:4444/wd/hub";
        DesiredCapabilities capability =new DesiredCapabilities();
        capability.setBrowserName("chrome");
        driver.set(new RemoteWebDriver(new URL("http://172.20.10.2:4444/wd/hub"), capability));
    }

    @AfterMethod
    public void tearDown() throws Exception {
        getDriver().quit();
    }


    @AfterClass
    void terminate () {
        driver.remove();
    }

}
