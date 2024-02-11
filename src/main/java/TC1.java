import org.testng.annotations.*;

public class TC1 {
    @Test
    void test1()
    {
        System.out.println("test1");
    }
    @Test
    void test2()
    {
        System.out.println("test2");
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

    @BeforeTest
    void beforeTest()
    {
        System.out.println("executes before test");
    }
    @AfterTest
    void afterTest()
    {
        System.out.println("executes after test");
    }
    @BeforeSuite
    void beforeSuite()
    {
        System.out.println("executes before suite");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("executes after suite");
    }
}
