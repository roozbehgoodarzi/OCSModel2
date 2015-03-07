import com.ocs.entity.Person;
import com.ocs.spring.service.PersonService;
import com.ocs.util.DateUtil;
import com.ocs.util.OCSModel;

/**
 * Created by Goodarzi on 02/26/2015.
 */
public class TestPerson extends
        MyTestCase
//        TestCase
{
    public void testPersonInsert(){
        PersonService personService = (PersonService) OCSModel.getInstance().getServiceInterface(PersonService.class);
//        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        PersonService personService = (PersonService) ctx.getBean("PersonService");
        Person person = new Person();
        person.setAccountId("177832506");
        person.setFirstName("Roozbeh");
        person.setLastName("Goodarzi");
        person.setLimitCashArz("10000");
        person.setLimitCashPay("200");
        person.setLimitCashRcv("2000");
        person.setLimitLC("50000000");
        person.setLimitLoan("5000000");
        person.setLimitPayChq("600000");
        person.setLimitPayDoc("80000");
        person.setNationalId("1471745581");
        person.setLimitCashArz("400");
        person.setUnitEmployCode("131");
        person.setPersonId(DateUtil.getStringDate());

        personService.addPerson(person);
        System.out.println("inserted..");
        System.out.println("Done");
    }

    public void testFetchPerson(){
//        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        PersonService personService = (PersonService) ctx.getBean("PersonService");
        PersonService personService = (PersonService) OCSModel.getInstance().getServiceInterface(PersonService.class);
        Person person = new Person();

        person = personService.getPerson(Long.valueOf("1"));

        System.out.println("person.FirstName = " + person.getFirstName());
        System.out.println("person.LastName = " + person.getLastName());
        System.out.println("person.AccountId = " + person.getAccountId());
        System.out.println("person.NationalId = " + person.getNationalId());
        System.out.println("person.UnitEmployeeCode = " + person.getUnitEmployCode());

    }

    public void testFetchPersonByPersonId(){
        PersonService personService = (PersonService) OCSModel.getInstance().getServiceInterface(PersonService.class);
        Person person = new Person();
        String personId = "12345";
        person = personService.getPersonByPersonId(personId);
        System.out.println("person.getNationalId() = " + person.getNationalId());
    }

    public void testFetchPersonByNationalId(){
        PersonService personService = (PersonService) OCSModel.getInstance().getServiceInterface(PersonService.class);
        Person person = personService.getPersonByNationalID("122");
        System.out.println("person = " + person.getFirstName());
    }
    public void testFetchPersonByAccountId(){
        PersonService personService = (PersonService) OCSModel.getInstance().getServiceInterface(PersonService.class);
        Person person = personService.getPersonByAccountID("177832506");
        System.out.println("person = " + person.getFirstName());
    }
}
