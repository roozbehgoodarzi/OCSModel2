package com.ocs.util;

/**
 * Created by Goodarzi on 02/02/2015.
 */
public class OCSModel {
    private static OCSModel _instance;

    public static OCSModel getInstance() {

        if (_instance == null)
            _instance = new OCSModel();
        return _instance;
    }


    public Object getServiceInterface(Class type){
        return ContextLoader.getBean(type);
    }

}
