import org.testng.annotations.*;

public class TC2 {
    @Test
    void test3()
    {
        System.out.println("test3");
    }
    @Test
    void test4()
    {
        System.out.println("test4");
    }
    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("Executes before method");
    }
    @AfterMethod
    void afterMethod()
    {
        System.out.println("Executes after method");
    }
    @BeforeClass
    void beforeClass()
    {
        System.out.println("Executes before class");
    }
    @AfterClass
    void afterClass()
    {
        System.out.println("Executes after class");
    }
}

