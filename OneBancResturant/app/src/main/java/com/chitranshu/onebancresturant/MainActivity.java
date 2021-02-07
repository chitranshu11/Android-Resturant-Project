package com.chitranshu.onebancresturant;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chitranshu.onebancresturant.Adapters.CuisineAdapter;
import com.chitranshu.onebancresturant.Data.CuisineData;
import com.chitranshu.onebancresturant.Models.CuisineModel;

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