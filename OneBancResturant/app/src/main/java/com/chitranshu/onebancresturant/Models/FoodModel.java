package com.chitranshu.onebancresturant.Models;

public class FoodModel {
    int pic;
    String name;
    double price;
    String rating;
    int quantity_ordered;

    public FoodModel(int pic, String name, double price, String rating, int quantity_ordered) {
        this.pic = pic;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.quantity_ordered = quantity_ordered;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getQuantity_ordered() {
        return quantity_ordered;
    }

    public void setQuantity_ordered(int quantity_ordered) {
        this.quantity_ordered = quantity_ordered;
    }
}
