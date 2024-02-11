import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.PriorityQueue;

public class SecondTestCase {
    @Test(priority = 1)
    void setup()
    {
        System.out.println("Setup");
    }

    @Test(priority = 2)
    void searchCustomer()
    {
        System.out.println("Search customer test");
        Assert.assertEquals(1,1);
    }
    @Test(priority = 3)
    void addCustomer()
    {
        System.out.println("Add customer");
    }
    @Test(priority = 4 )
    void teardown()
    {
        System.out.println("closing browser");
    }
}

