package com.adamzfc.permission.runtime;

import android.app.Activity;

/**
 * Created by adamzfc on 3/6/17.
 */
public class PermissionContext {
//    private static PermissionContext ourInstance = new PermissionContext();
    private static Activity mActivity;

//    public static PermissionContext getInstance() {
//        return ourInstance;
//    }

//    private PermissionContext() {
//    }

    public static void attachActivity(Activity activity) {
        mActivity = activity;
    }

    public static Activity getContext() {
        return mActivity;
    }

    public static void detach() {
        mActivity = null;
    }
}
