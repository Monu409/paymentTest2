package com.example.paymenttest.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.paymenttest.R;
import com.example.paymenttest.activities.ForceModifireActivity;
import com.example.paymenttest.modals.server.DishInfo;
import com.example.paymenttest.modals.server.DishInfoParent;
import com.example.paymenttest.modals.server.DrinkInfoParent;
import com.example.paymenttest.modals.server.PizzaInfoParent;
import com.example.paymenttest.modals.server.local.ItemsChoose;
import com.example.paymenttest.modals.server.local.ItemsChooseParent;

import java.util.ArrayList;
import java.util.List;

public class DishInfoAdapter extends RecyclerView.Adapter<DishInfoAdapter.DIHolder> {
    private LayoutInflater layoutInflater;
    private Object object;
    private String foodType;
    private Context context;

    public DishInfoAdapter(Object object, Context context,String foodType){
        layoutInflater = LayoutInflater.from(context);
        this.object = object;
        this.foodType = foodType;
        this.context = context;
    }
    @NonNull
    @Override
    public DIHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = layoutInflater.inflate(R.layout.adapter_dish_info,viewGroup,false);
        return new DIHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DIHolder diHolder, final int i) {
        switch (foodType){
            case "Dishes":
                final DishInfoParent dishInfoParent = (DishInfoParent)object;
                diHolder.nameTxt.setText(dishInfoParent.getDishInfo().get(i).getPname());
                diHolder.priceTxt.setText(dishInfoParent.getDishInfo().get(i).getPrice());
                diHolder.dishDec.setText(dishInfoParent.getDishInfo().get(i).getDescription());
                diHolder.fullView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ItemsChoose itemsChoose  = new ItemsChoose();
                        String fmId = dishInfoParent.getDishInfo().get(i).getForcedModiferId();
                        String omId = dishInfoParent.getDishInfo().get(i).getOptionalModiferId();
                        if(fmId.equals("0")){

                        }
                        else {
                            itemsChoose.setDishInfo(dishInfoParent.getDishInfo().get(i));
                            Intent intent = new Intent(context, ForceModifireActivity.class);
                            intent.putExtra("fm_id", fmId);
                            intent.putExtra("om_id", omId);
                            intent.putExtra("item_choose_modal",itemsChoose);
                            context.startActivity(intent);
                        }
                    }
                });
                break;
            case "Drinks":
                DrinkInfoParent drinkInfoParent = (DrinkInfoParent)object;
                diHolder.nameTxt.setText(drinkInfoParent.getDrinkInfo().get(i).getDrinkName());
                diHolder.priceTxt.setText(drinkInfoParent.getDrinkInfo().get(i).getDrinkPrice());
                diHolder.dishDec.setText(drinkInfoParent.getDrinkInfo().get(i).getDrinkDescription());
                break;
            case "Pizza":
                PizzaInfoParent pizzaInfoParent = (PizzaInfoParent)object;
                diHolder.nameTxt.setText(pizzaInfoParent.getPizzaInfo().get(i).getTitle());
                diHolder.priceTxt.setText(pizzaInfoParent.getPizzaInfo().get(i).getPoints());
                diHolder.dishDec.setText(pizzaInfoParent.getPizzaInfo().get(i).getDescription());
                break;
        }
    }

    @Override
    public int getItemCount() {
        switch (foodType){
            case "Dishes":
                DishInfoParent dishInfoParent = (DishInfoParent)object;
                return dishInfoParent.getDishInfo().size();
            case "Drinks":
                DrinkInfoParent drinkInfoParent = (DrinkInfoParent)object;
                return drinkInfoParent.getDrinkInfo().size();
            case "Pizza":
                PizzaInfoParent pizzaInfoParent = (PizzaInfoParent)object;
                return pizzaInfoParent.getPizzaInfo().size();
        }
        return 0;
    }

    class DIHolder extends RecyclerView.ViewHolder {
        TextView nameTxt,priceTxt,dishDec;
        CardView fullView;
        public DIHolder(@NonNull View itemView) {
            super(itemView);
            nameTxt = itemView.findViewById(R.id.dishName);
            priceTxt = itemView.findViewById(R.id.dishPrice);
            dishDec = itemView.findViewById(R.id.dishDesc);
            fullView = itemView.findViewById(R.id.second_view);
        }
    }
}
