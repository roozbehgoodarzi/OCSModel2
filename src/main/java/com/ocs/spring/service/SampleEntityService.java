package com.ocs.spring.service;

import com.ocs.entity.SampleEntity;
import com.ocs.spring.dao.hibernateImpl.SampleEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Goodarzi on 02/01/2015.
 */
@Service("SampleEntityService")
@Transactional(readOnly = true)
public class SampleEntityService {

    @Autowired
    private SampleEntityDao sampleEntityDao;

    public SampleEntityDao getSampleEntityDao() {
        return sampleEntityDao;
    }

    public void setSampleEntityDao(SampleEntityDao sampleEntityDao) {
        this.sampleEntityDao = sampleEntityDao;
    }

    @Transactional
    public void addSampleEntity(SampleEntity sampleEntity){
        getSampleEntityDao().save(sampleEntity);
    }
}
