package com.axity.arquitectura.dao.exception;

/**
 * The Enum DAOError.
 *
 * @author jcorona
 * @since 5/11/2015 - 04:58:44 PM
 */
public enum DAOError {
	
	/** Variable err dao not found. */
	ERR_DAO_NOT_FOUND,
	
	/** Variable err dao record not found. */
	ERR_DAO_RECORD_NOT_FOUND,
	
	/** Variable err dao record duplicate. */
	ERR_DAO_RECORD_DUPLICATE,
	
	/** Variable err dao record non unique. */
	ERR_DAO_RECORD_NON_UNIQUE,
	
	/** Variable err dao communication. */
	ERR_DAO_COMMUNICATION,
	
	/** Variable err dao constraint. */
	ERR_DAO_CONSTRAINT,
	
	/** Variable err dao persistence not found. */
	ERR_DAO_PERSISTENCE_NOT_FOUND,
	
	/** Variable err dao general. */
	ERR_DAO_GENERAL,
	
	/** Variable err entity not found general. */
	ERR_ENTITY_NOT_FOUND_GENERAL;
	
}