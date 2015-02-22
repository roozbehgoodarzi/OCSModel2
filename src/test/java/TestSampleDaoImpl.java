import com.ocs.entity.SampleEntity;
import com.ocs.spring.service.SampleEntityService;
import com.ocs.util.OCSModel;

/**
 * Created by Goodarzi on 02/02/2015.
 */
public class TestSampleDaoImpl extends MyTestCase {
    public void testSampleEntityInsert(){
//        SampleEntityService sampleEntityService = (SampleEntityService) ContextLoader.getBean(SampleEntityService.class);
        SampleEntityService sampleEntityService = (SampleEntityService) OCSModel.getInstance().getServiceInterface(SampleEntityService.class);
        SampleEntity sampleEntity = new SampleEntity();
        sampleEntity.setDescription("aaa");

        sampleEntityService.addSampleEntity(sampleEntity);
        System.out.println("inserted ..");

    }

    public void testSample2(){
//        SpringFacade.getBean()
    }
}
