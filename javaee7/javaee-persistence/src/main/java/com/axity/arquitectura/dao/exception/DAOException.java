package com.axity.arquitectura.dao.exception;

/**
 * The Class DAOException.
 */
public class DAOException extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;


    /**
     * Instantiates a new DAO exception.
     *
     * @param e the e
     * @param errDaoRecordDuplicate the err dao record duplicate
     * @param entityType the entity type
     */
    public DAOException(Throwable e, DAOError errDaoRecordDuplicate, Class entityType) {
        super(entityType.getName()+" " +errDaoRecordDuplicate.name(),e);

    }

    /**
     * Instantiates a new DAO exception.
     *
     * @param e the e
     * @param errEntityNotFoundGeneral the err entity not found general
     * @param entityType the entity type
     */
    public DAOException(IllegalArgumentException e, DAOError errEntityNotFoundGeneral, Class entityType) {
        super(entityType.getName()+" " +errEntityNotFoundGeneral.name(), e);
    }

    /**
     * Instantiates a new DAO exception.
     *
     * @param error the error
     */
    public DAOException(DAOError error) {
        super(error.name());
    }




}