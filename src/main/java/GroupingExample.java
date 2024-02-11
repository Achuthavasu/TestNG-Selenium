import org.testng.annotations.Test;

import javax.swing.*;

public class GroupingExample {
    @Test(groups = {"sanity"})
    void test1()
    {
        System.out.println("test1");
    }

    @Test(groups = {"smoke"})
    void test2()
    {
        System.out.println("test2");
    }
    @Test(groups = {"regresssion", "smoke"})
    void test3()
    {
        System.out.println("test3");
    }
    @Test(groups = {"sanity"})
    void test4()
    {
        System.out.println("test4");
    }

    @Test(groups = {"regresssion", "smoke"})
    void test5()
    {
        System.out.println("test5");
    }
    @Test(groups = {"sanity"})
    void test6()
    {
        System.out.println("test6");
    }
}
