import com.oata.practice.ApiClient;
import com.oata.practice.services.HerokuAppService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {

    ApiClient apiClient; //Global Variable

    @BeforeClass
    public void beforeClass() {
        apiClient = new ApiClient(); // creating a new instance Here
    }

    @Test
    public void testCreateToken() {
        HerokuAppService herokuAppService = new HerokuAppService();
        herokuAppService.createToken("admin", "password123");
    }
}
