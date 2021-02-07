package com.chitranshu.onebancresturant.Data;

import java.util.HashMap;

public class Cart {
    private HashMap<String, Integer> cartItem = new HashMap<>();
    private HashMap<String, Double> priceMap = new HashMap<>();


    private static Cart instance;

    private Cart() {}

    public static Cart getInstance() {
        if(instance == null)
            instance = new Cart();
        return instance;
    }

    public  HashMap<String, Integer> getCartItem() {
        return cartItem;
    }
    public  HashMap<String, Double> getPriceMap() {
        return priceMap;
    }
}
