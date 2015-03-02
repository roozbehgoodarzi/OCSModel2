package com.ocs.exception;

/**
 * Created by Goodarzi on 03/02/2015.
 */
public class IException extends Exception{
    Short sourceId = new Short("0");

    public Short getSourceId() {
        return this.sourceId;
    }

    public void setSourceId(Short var1) {
        this.sourceId = var1;
    }

    public IException(Short var1) {
        this.sourceId = var1;
    }

    public IException(String var1, Short var2) {
        super(var1);
        this.sourceId = var2;
    }

    public String toString() {
        return "sourceId = " + this.sourceId + ", " + super.toString();
    }
}
