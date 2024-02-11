import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DattaProviderExample {
    @Test(dataProvider ="LoginDataProvider", dataProviderClass = CustomDataProvider.class)
    public void loginTest(String emailid, String passwd)
    {
        System.out.println(emailid + "  " + passwd);
    }


}
