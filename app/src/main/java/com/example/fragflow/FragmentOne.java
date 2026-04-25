package com.example.fragflow;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentOne extends Fragment {

    public FragmentOne() {
        super(R.layout.fragment_one);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView tv = view.findViewById(R.id.textOne);
        Button btn = view.findViewById(R.id.btnHello);

        btn.setOnClickListener(v -> tv.setText("Hello from Fragment 1"));
    }

    @Override
    public void onResume() {
        super.onResume();
        android.util.Log.d("FragmentOne", "onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        android.util.Log.d("FragmentOne", "onPause()");
    }

}