import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData() {
        Object[][] data = {{"ab@gmail.com", "ab"}, {"xy@gmail.com", "dk"}, {"df@gmail.com", "dfm"}};
        return data;
    }
}
