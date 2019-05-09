package com.example.paymenttest.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.example.paymenttest.R;
import com.example.paymenttest.constants.OnclickRecyclerItem;
import com.example.paymenttest.modals.server.DishCategoryInfoParent;
import com.example.paymenttest.modals.server.DrinkCatInfoParent;

public class FoodCatAdapter extends RecyclerView.Adapter<FoodCatAdapter.FCHolder> {
    private DishCategoryInfoParent example;
    private LayoutInflater layoutInflater;
    public static int selected_item = 0;
    private OnclickRecyclerItem onclickRecyclerItem;
    DrinkCatInfoParent drinkCatInfoParent;
    private String foodType;

    public FoodCatAdapter(DishCategoryInfoParent example, Context context, OnclickRecyclerItem onclickRecyclerItem,String foodType){
        this.example = example;
        this.onclickRecyclerItem = onclickRecyclerItem;
        layoutInflater = LayoutInflater.from(context);
        this.foodType = foodType;
    }
    public FoodCatAdapter(DrinkCatInfoParent drinkCatInfoParent, Context context, OnclickRecyclerItem onclickRecyclerItem,String foodType){
        this.drinkCatInfoParent = drinkCatInfoParent;
        this.onclickRecyclerItem = onclickRecyclerItem;
        layoutInflater = LayoutInflater.from(context);
        this.foodType = foodType;
    }
    @NonNull
    @Override
    public FCHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = layoutInflater.inflate(R.layout.adapter_food_cat,viewGroup,false);
        return new FCHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final FCHolder fcHolder, final int position) {
        switch (foodType){
            case "Dishes":
                fcHolder.catName.setText(example.getDishCategoryInfo().get(position).getCname());
                fcHolder.rowItm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclickRecyclerItem.onItemClick(position,example.getDishCategoryInfo().get(position));
                        selected_item=position;
                        notifyDataSetChanged();
                    }
                });
                break;
            case "Drinks":
                fcHolder.catName.setText(drinkCatInfoParent.getDrinkCatInfo().get(position).getDrinkCatName());
                fcHolder.rowItm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onclickRecyclerItem.onItemClick(position,drinkCatInfoParent.getDrinkCatInfo().get(position));
                        selected_item=position;
                        notifyDataSetChanged();
                    }
                });
                break;
        }
        if(position == selected_item) {
            fcHolder.rowItm.setBackgroundColor(Color.parseColor("#d3d3d3"));
        } else {
            fcHolder.rowItm.setBackgroundColor(Color.parseColor("#ffffff"));
        }
    }

    @Override
    public int getItemCount() {
        switch (foodType){
            case "Dishes":
                return example.getDishCategoryInfo().size();
            case "Drinks":
                return drinkCatInfoParent.getDrinkCatInfo().size();
        }
        return 0;
    }

    class FCHolder extends RecyclerView.ViewHolder{
        public TextView catName;
        public RelativeLayout rowItm;
        public FCHolder(@NonNull View itemView) {
            super(itemView);
            catName = itemView.findViewById(R.id.cat_name);
            rowItm = itemView.findViewById(R.id.row_view);
        }
    }
}
