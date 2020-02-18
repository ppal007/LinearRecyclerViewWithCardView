package com.ppal007.recyclerviewwithcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.ppal007.recyclerviewwithcardview.adapter.RecyclerViewAdapter;
import com.ppal007.recyclerviewwithcardview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private String[] cuntryName;
    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);

        cuntryName = getResources().getStringArray(R.array.city_name_list);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext(), cuntryName);
        binding.recyclerView.setAdapter(recyclerViewAdapter);
    }
}
