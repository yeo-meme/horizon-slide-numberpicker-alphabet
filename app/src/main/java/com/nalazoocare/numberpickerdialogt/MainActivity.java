package com.nalazoocare.numberpickerdialogt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.provider.ContactsContract;

import com.nalazoocare.numberpickerdialogt.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.picker.setSelectedTextColor(ContextCompat.getColor(this, R.color.colorPrimary));


        String[] data = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        binding.picker.setMinValue(1);
        binding.picker.setMaxValue(data.length);
        binding.picker.setDisplayedValues(data);
        binding.picker.setValue(7);

        binding.picker.setWrapSelectorWheel(true);
    }
}
