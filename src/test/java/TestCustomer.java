import com.ocs.entity.Customer;
import com.ocs.spring.service.CustomerService;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Goodarzi on 10/22/14.
 */
public class TestCustomer
        extends TestCase
{
    public void testCustomer(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("testContext.xml");
        CustomerService customerService = (CustomerService) ctx.getBean("CustomerService");

        Customer customer = new Customer();
        customer.setName("Roozbeh29");
        customer.setSurname("Goodarzi29");
        customer.setId((int) 335);

        customerService.addCustomer(customer);
        System.out.println("inserted..");

    }
}
