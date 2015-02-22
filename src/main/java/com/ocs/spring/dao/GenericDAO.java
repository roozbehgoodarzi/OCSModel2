package com.ocs.spring.dao;

import com.ocs.entity.DomainObject;

import java.util.List;

/**
 * Created by Goodarzi on 8/30/14.
 */
public interface GenericDAO<T extends DomainObject> {
    public <T> T save(final T o);
    public void delete(final Object object);
    public <T> T get(final Class<T> type, final Long id);
    public <T> T merge(final T o);
    public <T> void saveOrUpdate(final T o);
    public <T> List<T> getAll(final Class<T> type);
}
