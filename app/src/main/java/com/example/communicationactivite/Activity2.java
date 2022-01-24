package com.example.communicationactivite;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.communicationactivite.databinding.Activity2Binding;
import com.example.communicationactivite.databinding.ActivityMainBinding;

public class Activity2 extends AppCompatActivity {
    private Activity2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = Activity2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.textview.setText(getIntent().getStringExtra("text"));
    }
}
