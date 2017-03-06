package com.adamzfc.permission.runtime;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.util.Log;

import com.adamzfc.permission.annotations.Permission;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by adamzfc on 3/6/17.
 */

@Aspect
public class PermissionAspect {

    @Around("execution(@com.adamzfc.permission.annotations.Permission * *(..)) && @annotation(permission)")
    public void aroundJoinPoint(final ProceedingJoinPoint joinPoint, final Permission permission) throws Throwable {
        Log.d("TAG", "tttt");
        if (PermissionContext.getContext() != null) {

            final Activity ac = PermissionContext.getContext();
            new AlertDialog.Builder(ac)
                    .setTitle("提示")
                    .setMessage("为了应用可以正常使用，请您点击确认申请权限。")
                    .setNegativeButton("取消", null)
                    .setPositiveButton("允许", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            PermissionUtil.requestPermissionsResult(ac, 1, permission.value()
                                    , new PermissionUtil.OnPermissionListener() {
                                        @Override
                                        public void onPermissionGranted() {
                                            try {
                                                joinPoint.proceed();//获得权限，执行原方法
                                            } catch (Throwable e) {
                                                e.printStackTrace();
                                            }
                                        }

                                        @Override
                                        public void onPermissionDenied() {
                                            PermissionUtil.showPermissionTipsDialog(ac);
                                        }
                                    });
                        }
                    })
                    .create()
                    .show();
        }
    }

}
