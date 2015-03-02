package com.ocs.exception;

/**
 * Created by Goodarzi on 03/02/2015.
 */
public class DataAccessException extends IRuntimeException {
    Throwable cause;

    public DataAccessException(Throwable var1, Short var2) {
        super(var1, var2);
        this.cause = var1;
    }

    public Throwable getException() {
        return this.cause;
    }
}
