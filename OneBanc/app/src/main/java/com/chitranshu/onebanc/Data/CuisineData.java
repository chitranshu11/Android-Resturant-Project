package com.chitranshu.onebanc.Data;

import com.chitranshu.onebanc.Models.CuisineModel;
import com.chitranshu.onebanc.R;

import java.util.ArrayList;

public class CuisineData {

    public static ArrayList<CuisineModel> getList() {
        ArrayList<CuisineModel> list = new ArrayList<CuisineModel>();
        list.add(new CuisineModel(R.drawable.chinese,"Chinese"));
        list.add(new CuisineModel(R.drawable.italian,"Italian"));
        list.add(new CuisineModel(R.drawable.north_indian,"North Indian"));
        list.add(new CuisineModel(R.drawable.south_indian,"South Indian"));
        list.add(new CuisineModel(R.drawable.mexican,"Mexican"));
        return list;
    }
}
