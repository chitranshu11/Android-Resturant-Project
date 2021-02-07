package com.chitranshu.onebanc;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chitranshu.onebanc.Adapters.CuisineAdapter;
import com.chitranshu.onebanc.Data.CuisineData;
import com.chitranshu.onebanc.Models.CuisineModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.cuisineRecyclerView);

        ArrayList<CuisineModel> cuisineList = CuisineData.getList();

        CuisineAdapter adapter = new CuisineAdapter(cuisineList,this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

    }
}