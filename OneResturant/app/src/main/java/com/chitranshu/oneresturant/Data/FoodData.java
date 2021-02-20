package com.chitranshu.oneresturant.Data;

import com.chitranshu.oneresturant.Models.FoodModel;
import com.chitranshu.oneresturant.R;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<FoodModel> getTopThree() {
        ArrayList<FoodModel> list = new ArrayList<FoodModel>();
        list.add(new FoodModel(R.drawable.chinese,"Salad", 100,"4.8/5",0));
        list.add(new FoodModel(R.drawable.italian,"Pizza", 120,"4.6/5",0));
        list.add(new FoodModel(R.drawable.north_indian,"Chicken", 180,"4.9/5",0));
        return list;
    }

    public static ArrayList<FoodModel> getChinese() {
        ArrayList<FoodModel> list = new ArrayList<FoodModel>();
        list.add(new FoodModel(R.drawable.chinese,"Salad", 100,"4.8/5",0));
        list.add(new FoodModel(R.drawable.italian,"Pizza", 120,"4.6/5",0));
        list.add(new FoodModel(R.drawable.north_indian,"Burger", 180,"4.9/5",0));
        list.add(new FoodModel(R.drawable.south_indian,"Sandwich", 180,"4.9/5",0));
        list.add(new FoodModel(R.drawable.mexican,"Maggie", 180,"4.9/5",0));
        list.add(new FoodModel(R.drawable.north_indian,"Chicken", 180,"4.9/5",0));

        return list;
    }
    public static ArrayList<FoodModel> getItalian() {
        ArrayList<FoodModel> list = new ArrayList<FoodModel>();
        list.add(new FoodModel(R.drawable.north_indian,"Chicken", 180,"4.9/5",0));
        list.add(new FoodModel(R.drawable.north_indian,"Burger", 180,"4.9/5",0));
        list.add(new FoodModel(R.drawable.south_indian,"Sandwich", 180,"4.9/5",0));
        list.add(new FoodModel(R.drawable.chinese,"Salad", 100,"4.8/5",0));
        list.add(new FoodModel(R.drawable.italian,"Pizza", 120,"4.6/5",0));
        list.add(new FoodModel(R.drawable.mexican,"Rajma", 180,"4.9/5",0));


        return list;
    } public static ArrayList<FoodModel> getMexican() {
        ArrayList<FoodModel> list = new ArrayList<FoodModel>();
        list.add(new FoodModel(R.drawable.chinese,"Salad", 100,"4.8/5",0));
        list.add(new FoodModel(R.drawable.mexican,"Pulav", 180,"4.9/5",0));
        list.add(new FoodModel(R.drawable.north_indian,"Chicken", 180,"4.9/5",0));
        list.add(new FoodModel(R.drawable.italian,"Pizza", 120,"4.6/5",0));
        list.add(new FoodModel(R.drawable.north_indian,"Burger", 180,"4.9/5",0));
        list.add(new FoodModel(R.drawable.south_indian,"Sandwich", 180,"4.9/5",0));

        return list;
    } public static ArrayList<FoodModel> getSouthIndian() {
        ArrayList<FoodModel> list = new ArrayList<FoodModel>();

        list.add(new FoodModel(R.drawable.chinese,"Salad", 100,"4.8/5",0));
        list.add(new FoodModel(R.drawable.north_indian,"Chicken", 180,"4.9/5",0));
        list.add(new FoodModel(R.drawable.north_indian,"Burger", 180,"4.9/5",0));
        list.add(new FoodModel(R.drawable.italian,"Pizza", 120,"4.6/5",0));
        list.add(new FoodModel(R.drawable.south_indian,"Sandwich", 180,"4.9/5",0));
        list.add(new FoodModel(R.drawable.mexican,"Maggie", 180,"4.9/5",0));

        return list;
    } public static ArrayList<FoodModel> getNorthIndian() {
        ArrayList<FoodModel> list = new ArrayList<FoodModel>();
        list.add(new FoodModel(R.drawable.mexican,"Maggie", 180,"4.9/5",0));
        list.add(new FoodModel(R.drawable.south_indian,"Sandwich", 180,"4.9/5",0));
        list.add(new FoodModel(R.drawable.chinese,"Salad", 100,"4.8/5",0));
        list.add(new FoodModel(R.drawable.italian,"Pizza", 120,"4.6/5",0));
        list.add(new FoodModel(R.drawable.north_indian,"Burger", 180,"4.9/5",0));
        list.add(new FoodModel(R.drawable.mexican,"Maggie", 180,"4.9/5",0));
        list.add(new FoodModel(R.drawable.north_indian,"Chicken", 180,"4.9/5",0));

        return list;
    }
}
