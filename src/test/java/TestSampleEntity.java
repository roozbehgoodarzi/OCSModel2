import com.ocs.entity.SampleEntity;
import com.ocs.spring.service.SampleEntityService;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Goodarzi on 02/01/2015.
 */
public class TestSampleEntity
        extends TestCase
{
    public void testSampleEntitySave(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("testContext.xml");
        SampleEntityService sampleEntityService = (SampleEntityService) ctx.getBean("SampleEntityService");

        SampleEntity sampleEntity = new SampleEntity();
        sampleEntity.setDescription("qqqqq");

        sampleEntityService.addSampleEntity(sampleEntity);
        System.out.println("inserted ..");
    }
}
