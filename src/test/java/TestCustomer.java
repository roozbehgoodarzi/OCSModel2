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
        customer.setNationalId("4490068344");
        customer.setFirstName("Hamed");
        customer.setId(3L);

        customerService.saveOrUpdateCustomer(customer);
        System.out.println("inserted..");

    }
    public void testCustomerFetchByNationalId(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("testContext.xml");
        CustomerService customerService = (CustomerService) ctx.getBean("CustomerService");

        Customer customer = customerService.getCustomerByNationalId("4490068344");
        System.out.println("customer = " + customer.getFirstName());
    }
}
