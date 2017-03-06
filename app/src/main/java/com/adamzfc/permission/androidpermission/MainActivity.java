package com.adamzfc.permission.androidpermission;

import android.Manifest;
import android.support.annotation.RequiresPermission;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.adamzfc.permission.annotations.Permission;
import com.adamzfc.permission.runtime.PermissionAspect;
import com.adamzfc.permission.runtime.PermissionContext;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        PermissionAspect.attachActivity(this);
        PermissionContext.attachActivity(this);
    }

    @Permission(Manifest.permission.CAMERA)
    public void click(View view) {
        Toast.makeText(this, "ttttttttttt", Toast.LENGTH_SHORT).show();
    }
}
