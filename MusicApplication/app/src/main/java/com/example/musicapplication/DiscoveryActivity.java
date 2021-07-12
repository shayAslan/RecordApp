package com.example.musicapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class DiscoveryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discovery);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        replace(new HomeFragment());

        findViewById(R.id.btn_main_menu).setOnClickListener(view ->
                replace(new RecordingFragment()));
        findViewById(R.id.btn_main_record).setOnClickListener(view ->
                replace(new HomeFragment()));
        findViewById(R.id.btn_main_home).setOnClickListener(view ->
                replace(new MenuFragment()));
    }

    private void replace(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_fram, fragment);
        fragmentTransaction.commit();
    }


}