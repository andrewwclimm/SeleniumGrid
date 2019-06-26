import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by andreiclim on 27/06/2019.
 */
public class JavaLaunchSecondApplication extends DesiredCapabilitiesClass {


    @Test
    public void FirstTestSecondClass() throws Exception {
        System.out.println("Automation second class first test launch started" + Thread.currentThread().getId());
        getDriver().navigate().to("http://automationpractice.com/index.php");
        System.out.println("Automation title is: " + getDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "My Store");
        System.out.println("First test second class ended " + Thread.currentThread().getId());
    }

    @Test
    public void SecondTestSecondClass() throws Exception {
        System.out.println("Automation second class second  Test  launch Started! " + Thread.currentThread().getId());
        getDriver().navigate().to("http://automationpractice.com/index.php");
        System.out.println("Automation title is " + getDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "My Store");
        System.out.println("Second second ended " + Thread.currentThread().getId());
    }

}
