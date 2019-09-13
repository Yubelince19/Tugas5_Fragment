package com.e.proteintracker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

public class Main3FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_fragment);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameMain, new ProteinFragment());
        ft.commit();

        ProteinFragment proteinFragment = ProteinFragment.newInstance("Hai","Progmobers");
                ft.replace(R.id.frameMain,proteinFragment);

    }
}


