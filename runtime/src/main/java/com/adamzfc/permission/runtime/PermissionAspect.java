package com.adamzfc.permission.runtime;

/**
 * Created by adamzfc on 3/6/17.
 */

//@Aspect
public class PermissionAspect {

//    @Around("execution(@com.app.annotation.aspect.Permission * *(..)) && @annotation(permission)")
//    public void aroundJoinPoint(ProceedingJoinPoint joinPoint, Permission permission) throws Throwable {
//        AppCompatActivity ac = (AppCompatActivity) App.getAppContext().getCurActivity();
//        new AlertDialog.Builder(ac)
//                .setTitle("提示")
//                .setMessage("为了应用可以正常使用，请您点击确认申请权限。")
//                .setNegativeButton("取消", null)
//                .setPositiveButton("允许", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        PermissionUtil.requestPermissionsResult(ac, 1, permission.value()
//                                , new PermissionUtil.OnPermissionListener() {
//                                    @Override
//                                    public void onPermissionGranted() {
//                                        try {
//                                            joinPoint.proceed();//获得权限，执行原方法
//                                        } catch (Throwable e) {
//                                            e.printStackTrace();
//                                        }
//                                    }
//
//                                    @Override
//                                    public void onPermissionDenied() {
//                                        PermissionUtil.showPermissionTipsDialog(ac);
//                                    }
//                                });
//                    }
//                })
//                .create()
//                .show();
//    }
}
