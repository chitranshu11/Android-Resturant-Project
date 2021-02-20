package com.chitranshu.oneresturant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chitranshu.oneresturant.Adapters.CuisineAdapter;
import com.chitranshu.oneresturant.Adapters.FoodAdapter;
import com.chitranshu.oneresturant.Data.CuisineData;
import com.chitranshu.oneresturant.Data.FoodData;
import com.chitranshu.oneresturant.Models.CuisineModel;
import com.chitranshu.oneresturant.Models.FoodModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView cuisineRecyclerView;
    RecyclerView topThreeFoodRC;
    ImageView plusImage;
    ImageView minusImage;
    Button cartButton;
    Button languageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cuisineRecyclerView = findViewById(R.id.cuisineRecyclerView);
        topThreeFoodRC = findViewById(R.id.topFoodRecyclerView);
        cartButton = findViewById(R.id.button_cart);

        displayCuisine();
        displayTopThreeFood();
        cartFunction();

        languageButton = findViewById(R.id.button_language);
        languageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast. makeText(getApplicationContext(),"To be added",Toast. LENGTH_LONG);
                toast. setMargin(50,50);
                toast. show();
            }
        });

    }
    private void displayCuisine() {
        ArrayList<CuisineModel> cuisineList = CuisineData.getList();

        CuisineAdapter adapter = new CuisineAdapter(cuisineList,this);
        cuisineRecyclerView.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        cuisineRecyclerView.setLayoutManager(manager);

    }

    private void displayTopThreeFood() {
        ArrayList<FoodModel> topThreeList = FoodData.getTopThree();

        FoodAdapter adapter = new FoodAdapter(topThreeList,this);
        topThreeFoodRC.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        topThreeFoodRC.setLayoutManager(manager);
    }
    private void cartFunction() {
        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });
    }
}