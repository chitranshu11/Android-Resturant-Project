package com.chitranshu.oneresturant;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.chitranshu.oneresturant.Data.Cart;
import com.chitranshu.oneresturant.Models.CartItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CartActivity extends AppCompatActivity {
    double total;
    HashMap<String,Integer> selectedModelList;
    HashMap<String,Double> priceMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        selectedModelList = Cart.getInstance().getCartItem();
        priceMap = Cart.getInstance().getPriceMap();

        ArrayList<CartItem> cartItems = new ArrayList<>();
        TextView itemName = findViewById(R.id.item_name);
        TextView itemQuantity = findViewById(R.id.item_quantity);

        total = 0;

        for (Map.Entry<String, Integer> e : selectedModelList.entrySet()) {
//            CartItem item = new CartItem(e.getKey(),e.getValue());
//            cartItems.add(item);
            total = total + ((double) e.getValue() * priceMap.get(e.getKey()));

            String name = itemName.getText().toString();
            name += "\n" + e.getKey();

            String quantity = itemQuantity.getText().toString();
            quantity += "\n" + e.getValue();

            itemName.setText(name);
            itemQuantity.setText(quantity);
         }

        double cst = total * 0.025;
        double gst = total * 0.025;
        double grandTotal = total + cst + gst;

        TextView totalView = findViewById(R.id.item_total);
        TextView cstView = findViewById(R.id.item_cst);
        TextView gstView = findViewById(R.id.item_gst);
        TextView grandTotalView = findViewById(R.id.item_grandTotal);

        totalView.setText(String.valueOf(total));
        cstView.setText(String.valueOf(cst));
        gstView.setText(String.valueOf(gst));
        grandTotalView.setText(String.valueOf(grandTotal));

        Button orderButton = findViewById(R.id.order_button);

        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(total <= 0) {
                    Toast toast=Toast. makeText(getApplicationContext(),"Add Items to Place Order",Toast. LENGTH_LONG);
                    toast. setMargin(50,50);
                    toast. show();
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Order Place Successfully", Toast.LENGTH_LONG);
                    toast.setMargin(50, 50);
                    toast.show();
                    selectedModelList.clear();
                    priceMap.clear();
                }
            }
        });
    }
}