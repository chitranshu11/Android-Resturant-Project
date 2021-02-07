package com.chitranshu.onebancresturant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chitranshu.onebancresturant.Adapters.FoodAdapter;
import com.chitranshu.onebancresturant.Data.FoodData;
import com.chitranshu.onebancresturant.Models.FoodModel;

import java.util.ArrayList;


public class FoodMenuActivity extends AppCompatActivity {
    RecyclerView menuRecyclerView;
    TextView cuisineType;
    Button cartButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);

        Intent intent = getIntent();
        String menuStr = intent.getStringExtra("food");

        ArrayList<FoodModel> foodMenu = new ArrayList<>();

        switch (menuStr) {
            case "Chinese":
                foodMenu = FoodData.getChinese();
                break;
            case "Italian":
                foodMenu = FoodData.getItalian();
                break;
            case "Mexican":
                foodMenu = FoodData.getMexican();
                break;
            case "North Indian":
                foodMenu = FoodData.getNorthIndian();
                break;
            case "South Indian":
                foodMenu = FoodData.getSouthIndian();
                break;
        }
        cuisineType = findViewById(R.id.cuisine_type);
        cuisineType.setText(menuStr);

        menuRecyclerView = findViewById(R.id.menu_recyclerView);

        FoodAdapter adapter = new FoodAdapter(foodMenu,this);
        menuRecyclerView.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        menuRecyclerView.setLayoutManager(manager);

        cartButton = (Button) findViewById(R.id.cart_button);
        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),CartActivity.class);
                startActivity(intent1);
            }
        });
    }
}