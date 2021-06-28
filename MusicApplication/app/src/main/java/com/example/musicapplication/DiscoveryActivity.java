package com.example.musicapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class DiscoveryActivity extends AppCompatActivity {

    MeowBottomNavigation meowBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discovery);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        meowBottomNavigation = findViewById(R.id.main_nav);

        meowBottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.ic_menu));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.ic_mic));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.ic_home));

        meowBottomNavigation.show(2, true);
        replace(new RecordingFragment());
        meowBottomNavigation.setOnClickMenuListener(model -> {

            switch (model.getId()) {

                case 1:
                    replace(new MenuFragment());
                    break;

                case 2:
                    replace(new RecordingFragment());
                    break;

                case 3:
                    replace(new HomeFragment());
                    break;
            }
            return null;
        });


    }

    private void replace(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_fram, fragment);
        fragmentTransaction.commit();

    }


}