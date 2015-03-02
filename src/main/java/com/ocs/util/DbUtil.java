package com.ocs.util;

import java.util.List;

/**
 * Created by Goodarzi on 03/02/2015.
 */
public class DbUtil {
    public static boolean checkUniqueResult(List list) {
        if (list.size()>1)
            return false;
        return true;

    }

    public static boolean checkResultExist(List list) {
        if (list.size() == 0)
            return false;
        return true;
    }
}
