import com.ocs.util.SpringFacade;
import junit.framework.TestCase;

/**
 * Created by IntelliJ IDEA.
 * User: ahmadi
 * Date: Aug 7, 2008
 * Time: 12:31:26 PM
 */
public class MyTestCase extends TestCase {
    protected void setUp() {
        SpringFacade.initApplicationContext("testContext.xml");
    }


}
