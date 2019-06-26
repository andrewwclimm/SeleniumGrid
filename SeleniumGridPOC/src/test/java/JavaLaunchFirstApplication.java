import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by andreiclim on 27/06/2019.
 */
public class JavaLaunchFirstApplication extends DesiredCapabilitiesClass {

    @Test
    public void TestFirst () {

        System.out.println("My first launch " + Thread.currentThread().getId());
        getDriver().navigate().to("http://automationpractice.com/index.php");
        System.out.println("Automation Page title is: " + getDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "My Store");
        System.out.println("First test has been ended " + Thread.currentThread().getId());
    }

    @Test
    public void TestSecond() throws Exception {

        System.out.println("My second Launch " + Thread.currentThread().getId());
        getDriver().navigate().to("http://automationpractice.com/index.php");
        System.out.println("Automation Page title is: " + getDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "My Store");
        System.out.println("Second Test has been ended " + Thread.currentThread().getId());
    }

    @Test
    public void TestThird() throws Exception {
        System.out.println("My third launch! " + Thread.currentThread().getId());
        getDriver().navigate().to("http://automationpractice.com/index.php");
        System.out.println("Automation Page title is: " + getDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "My Store");
        System.out.println("TestThird has been ended! " + Thread.currentThread().getId());
    }
}
