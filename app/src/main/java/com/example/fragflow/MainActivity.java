package com.example.fragflow;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btnFragment1);
        btn2 = findViewById(R.id.btnFragment2);

        if (savedInstanceState == null) {
            load(new FragmentOne(), false);
        }

        btn1.setOnClickListener(v -> load(new FragmentOne(), true));
        btn2.setOnClickListener(v -> load(new FragmentTwo(), true));
    }

    private void load(Fragment f, boolean back) {
        var t = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, f);

        if (back) t.addToBackStack(null);

        t.commit();
    }
}