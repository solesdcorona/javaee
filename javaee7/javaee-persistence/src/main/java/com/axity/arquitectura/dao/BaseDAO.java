package com.axity.arquitectura.dao;

import com.axity.arquitectura.dao.exception.DAOException;
import com.axity.arquitectura.javaee.prototype.model.AbstractBaseDO;

import java.io.Serializable;
import java.util.List;

public interface BaseDAO<T extends AbstractBaseDO<ID>, ID extends Serializable> {
    /**
     * Creates the entity.
     *
     * @param entity the entity
     * @throws DAOException the DAO exception
     */
    void create(T entity) throws DAOException;

    /**
     * Delete the entity.
     *
     * @param id the id
     * @throws DAOException the DAO exception
     */
    void delete(ID id) throws DAOException;

    /**
     * Find all entities.
     *
     * @return the list
     * @throws DAOException the DAO exception
     */
    List<T> findAll() throws DAOException;

    /**
     * Find all entities.
     *
     * @param firstResult the first result
     * @param maxResult   the max result
     * @param orderBy     the order by
     * @return the list
     * @throws DAOException the DAO exception
     */
    List<T> findAll(Integer firstResult, Integer maxResult, String... orderBy) throws DAOException;


    /**
     * Find by column.
     *
     * @param nameColumn the name column
     * @param classId    the class id
     * @return the list
     * @throws DAOException the DAO exception
     */
    <T> T getByColumn(String nameColumn, Class<?> classId, Object value) throws DAOException;


    /**
     * Find by column.
     *
     * @param <T>        the generic type
     * @param nameColumn the name column
     * @param classId    the class id
     * @param value      the value
     * @return the list
     * @throws DAOException the DAO exception
     */
    <T> List<T> findByColumn(String nameColumn, Class<?> classId, Object... value) throws DAOException;

    /**
     * Gets the entity by id.
     *
     * @param id the id
     * @return the by id
     * @throws DAOException the DAO exception
     */
    T getById(ID id) throws DAOException;


    /**
     * Gets the catalog by id.
     *
     * @return the catalog by id
     * @throws DAOException the DAO exception
     */
    T getCatalogById(ID id) throws DAOException;

    /**
     * Update the entity.
     *
     * @param entity the entity
     * @return the t
     * @throws DAOException the DAO exception
     */
    T update(T entity) throws DAOException;


    /**
     * Flush.
     *
     * @throws DAOException the DAO exception
     */
    void flush() throws DAOException;


    /**
     * Refresh.
     *
     * @param entity the entity
     */
    void refresh(T entity);

    /**
     * Creates the bulk.
     *
     * @param entitys the entitys
     * @throws DAOException the DAO exception
     */
    public void createBulk(List<T> entitys) throws DAOException;
}
