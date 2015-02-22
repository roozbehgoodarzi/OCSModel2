package com.ocs.spring.dao.facade;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Goodarzi on 02/02/2015.
 */
@Deprecated
@Repository("SampleFacadeImpl")
public class SampleFacadeImpl implements SampleFacade {

    @Override
    public <T> T save(T o) {
        return null;
    }

    @Override
    public void delete(Object object) {

    }

    @Override
    public <T> T get(Class<T> type, Long id) {
        return null;
    }

    @Override
    public <T> T merge(T o) {
        return null;
    }

    @Override
    public <T> void saveOrUpdate(T o) {

    }

    @Override
    public <T> List<T> getAll(Class<T> type) {
        return null;
    }
}
