import org.testng.annotations.Test;

public class TestNGTests {

    @Test(enabled = true)
    public void demo1()
    {
        System.out.println("Demo test 1");
    }

    @Test(alwaysRun = true,enabled = false)
    public void demo2()
    {
        System.out.println("Demo test 2");
    }
}
