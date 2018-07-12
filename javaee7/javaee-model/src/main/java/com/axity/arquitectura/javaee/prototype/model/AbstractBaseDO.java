package com.axity.arquitectura.javaee.prototype.model;

import java.io.Serializable;

public abstract class AbstractBaseDO<I extends Serializable> implements Cloneable, Serializable {



    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The last modified username. */
    private String lastModifiedUsername;


    /** The id. */
    private I id;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public I getId() {
        // TODO Auto-generated method stub
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */

    public void setId(I id) {
        this.id=id;
    }

    /**
     * Gets the last modified username.
     *
     * @return the last modified username
     */
    public String getLastModifiedUsername(){
        return lastModifiedUsername;
    }

    /**
     * Sets the last modified username.
     *
     * @param newVal the new last modified username
     */
    public void setLastModifiedUsername(String newVal){
        lastModifiedUsername = newVal;
    }




}
