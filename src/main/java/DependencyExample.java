import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

    @Test
    void startCar()
    {
        System.out.println("car started");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar()
    {
        System.out.println("Drive the car");
    }
    @Test(dependsOnMethods = {"driveCar"})
    void stopCar()
    {
        System.out.println(" stop the car");
    }
    @Test(dependsOnMethods = {"driveCar", "stopCar"},alwaysRun = true)
    void parkCar()
    {
        System.out.println("park the car");
    }
}
