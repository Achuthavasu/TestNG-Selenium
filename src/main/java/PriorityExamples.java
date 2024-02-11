import org.testng.annotations.Test;

public class PriorityExamples {

    @Test(priority = 1)
    void testOne()
    {
        System.out.println("test one");
    }
    @Test(priority = 2)
    void testTwo()
    {
        System.out.println("test two");
    }
    @Test(priority = 3)
    void testThree()
    {
        System.out.println("test three");
    }
    @Test(priority = 4, enabled = false)
    void testfour()
    {
        System.out.println("test four");
    }

}
