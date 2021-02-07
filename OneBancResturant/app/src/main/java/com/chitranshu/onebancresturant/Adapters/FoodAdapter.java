package com.chitranshu.onebancresturant.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chitranshu.onebancresturant.Data.Cart;
import com.chitranshu.onebancresturant.Models.FoodModel;
import com.chitranshu.onebancresturant.R;

import java.util.ArrayList;
import java.util.HashMap;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.viewHolder>{
    ArrayList<FoodModel> list;
    Context context;

    public FoodAdapter(ArrayList<FoodModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.food_cardview,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        FoodModel model = list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.name.setText(model.getName());
        holder.price.setText(String.valueOf(model.getPrice()));
        holder.rating.setText(model.getRating());

        TextView quantity = holder.quantity;
        HashMap<String, Integer> cartItem = Cart.getInstance().getCartItem();
        HashMap<String, Double> priceMap = Cart.getInstance().getPriceMap();


        holder.plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String qty = quantity.getText().toString();
                int quantity_selected = Integer.parseInt(qty);
                quantity_selected++;
                quantity.setText(String.valueOf(quantity_selected));
                /*.setQuantity_ordered(quantity_selected + model.getQuantity_ordered());

                if(model.getQuantity_ordered() > 0) {
                    cartItem.put(model.getName(), model.getQuantity_ordered());
                    priceMap.put(model.getName(),model.getPrice());

                }*/
                if(quantity_selected > 0) {
                    cartItem.put(model.getName(), quantity_selected);
                    priceMap.put(model.getName(),model.getPrice());

                }
            }
        });

        holder.miniusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String qstr = quantity.getText().toString();
                int quantity_selected = Integer.parseInt(qstr);
                if(quantity_selected > 0)
                quantity_selected--;
                else
                    quantity_selected = 0;
                quantity.setText(String.valueOf(quantity_selected));

                /*model.setQuantity_ordered(quantity_selected + model.getQuantity_ordered());

                if(model.getQuantity_ordered() > 0) {
                    cartItem.put(model.getName(), model.getQuantity_ordered());
                    priceMap.put(model.getName(),model.getPrice());
                }*/
                /*if(cartItem.containsKey(model.getName())) {
                    int q = cartItem.get(model.getName());
                    cartItem.put(model.getName(), q + quantity_selected);
                    priceMap.put(model.getName(),model.getPrice());

                }else*/ if(quantity_selected > 0) {
                    cartItem.put(model.getName(), quantity_selected);
                    priceMap.put(model.getName(),model.getPrice());

                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        TextView price;
        TextView rating;
        TextView quantity;
        ImageView plusButton;
        ImageView miniusButton;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.food_image);
            name = itemView.findViewById(R.id.food_name);
            price = itemView.findViewById(R.id.food_price);
            rating = itemView.findViewById(R.id.food_rating);
            quantity = itemView.findViewById(R.id.quantity_selected);
            plusButton = itemView.findViewById(R.id.increase_quantity);
            miniusButton = itemView.findViewById(R.id.decrease_quantity);
        }
    }
}
