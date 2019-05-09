package com.example.paymenttest.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.example.paymenttest.R;
import com.example.paymenttest.adapters.DishInfoAdapter;
import com.example.paymenttest.adapters.FoodCatAdapter;
import com.example.paymenttest.constants.ConstantMethods;
import com.example.paymenttest.constants.OnclickRecyclerItem;
import com.example.paymenttest.modals.server.DishCategoryInfo;
import com.example.paymenttest.modals.server.DishCategoryInfoParent;
import com.example.paymenttest.modals.server.DishInfoParent;
import com.example.paymenttest.modals.server.DrinkCatInfo;
import com.example.paymenttest.modals.server.DrinkCatInfoParent;
import com.example.paymenttest.modals.server.DrinkInfoParent;
import com.example.paymenttest.modals.server.PizzaInfoParent;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import static com.example.paymenttest.constants.ApiInterface.REST_ID;
import static com.example.paymenttest.constants.ApiInterface.URL_GET_DRINK_CATEGORY;
import static com.example.paymenttest.constants.ApiInterface.URL_GET_FOOD_ITEM_BASED_ON_SUBCATEGORY;
import static com.example.paymenttest.constants.ApiInterface.URL_GET_FOOD_SUB_CATEGORY_FOR_DISH;
import static com.example.paymenttest.constants.ApiInterface.URL_GET_PIZZA_ITEM_BASED_ON_SUBCATEGORY;
import static com.example.paymenttest.constants.ApiInterface.URL_GET_VIEW_DRINK_ITEM;

public class DishesActivity extends AppCompatActivity implements View.OnClickListener, OnclickRecyclerItem {
    private ImageView topDishImg,topDringImg,topPizzaImg,topSpclImg,topSetmenuImg;
    private RecyclerView catRcylr,foodDataRcylr;
    private String catId;
    private String foodType;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dishes);
        topDishImg = findViewById(R.id.top_cat_dish);
        topDringImg = findViewById(R.id.top_cat_drink);
        topPizzaImg = findViewById(R.id.top_cat_pizza);
        topSpclImg = findViewById(R.id.top_cat_ofer);
        topSetmenuImg = findViewById(R.id.top_cat_set_menu);
        catRcylr = findViewById(R.id.cat_rcylr);
        foodDataRcylr = findViewById(R.id.food_data_rcylr);
        catRcylr.setLayoutManager(new LinearLayoutManager(this));
        foodDataRcylr.setLayoutManager(new LinearLayoutManager(this));
        topDishImg.setOnClickListener(this);
        topDringImg.setOnClickListener(this);
        topPizzaImg.setOnClickListener(this);
        topSpclImg.setOnClickListener(this);
        topSetmenuImg.setOnClickListener(this);
        foodType = "Dishes";
        getCatData("Dishes");
        ConstantMethods.showDialog(this);
    }

    private void changeTopIcons(){
        topDishImg.setImageResource(R.drawable.dish_icon_normal_2x);
        topDringImg.setImageResource(R.drawable.drink_icon_normal_2x);
        topPizzaImg.setImageResource(R.drawable.pizza_icon_normal_2x);
        topSpclImg.setImageResource(R.drawable.offer_inactive_2x);
        topSetmenuImg.setImageResource(R.drawable.setmenu_inactive_2x);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.top_cat_dish:
                changeTopIcons();
                topDishImg.setImageResource(R.drawable.dish_icon_act_2x);
                getCatData("Dishes");
                foodType = "Dishes";
                catRcylr.setVisibility(View.VISIBLE);
                break;
            case R.id.top_cat_drink:
                changeTopIcons();
                topDringImg.setImageResource(R.drawable.drink_icon_act_2x);
                getCatData("Drinks");
                foodType = "Drinks";
                catRcylr.setVisibility(View.VISIBLE);
                break;
            case R.id.top_cat_pizza:
                changeTopIcons();
                topPizzaImg.setImageResource(R.drawable.pizza_icon_act_2x);
                getFoodData("","Pizza");
                catRcylr.setVisibility(View.INVISIBLE);
                break;
            case R.id.top_cat_ofer:
                changeTopIcons();
                topSpclImg.setImageResource(R.drawable.offer_active_2x);
                break;
            case R.id.top_cat_set_menu:
                changeTopIcons();
                topSetmenuImg.setImageResource(R.drawable.setmenu_active_2x);
                break;
        }
    }
    private void getCatData(final String foodType){
        String url="";
        switch (foodType){
            case "Dishes":
                url = URL_GET_FOOD_SUB_CATEGORY_FOR_DISH + REST_ID;
                break;
            case "Drinks":
                url = URL_GET_DRINK_CATEGORY + REST_ID;
                break;
        }
        AndroidNetworking.get(url)
                .build()
                .getAsString(new StringRequestListener() {
                    @Override
                    public void onResponse(String response) {
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        Gson gson = gsonBuilder.create();
                        switch (foodType){
                            case "Dishes":
                                DishCategoryInfoParent example = gson.fromJson(response, DishCategoryInfoParent.class);
                                catId = example.getDishCategoryInfo().get(0).getCategoryId();
                                FoodCatAdapter foodCatAdapter = new FoodCatAdapter(example,DishesActivity.this,DishesActivity.this,foodType);
                                catRcylr.setAdapter(foodCatAdapter);
                                getFoodData(catId,foodType);
                                break;
                            case "Drinks":
                                DrinkCatInfoParent drinkCatInfoParent = gson.fromJson(response, DrinkCatInfoParent.class);
                                catId = drinkCatInfoParent.getDrinkCatInfo().get(0).getDrinkCatId();
                                FoodCatAdapter drinkCatAdptr = new FoodCatAdapter(drinkCatInfoParent, DishesActivity.this, DishesActivity.this,foodType);
                                catRcylr.setAdapter(drinkCatAdptr);
                                getFoodData(catId,foodType);
                                break;
                        }

                    }

                    @Override
                    public void onError(ANError anError) {

                    }
                });
    }

    private void getFoodData(String catId,final String foodType){
        String url = "";
        switch (foodType){
            case "Dishes":
                url = URL_GET_FOOD_ITEM_BASED_ON_SUBCATEGORY + REST_ID+"/catId/"+catId;
                break;
            case "Drinks":
                url = URL_GET_VIEW_DRINK_ITEM + REST_ID+"/drinkCatId/"+catId;
                break;
            case "Pizza":
                url = URL_GET_PIZZA_ITEM_BASED_ON_SUBCATEGORY + REST_ID;
                break;
        }
        AndroidNetworking.get(url)
                .build()
                .getAsString(new StringRequestListener() {
                    @Override
                    public void onResponse(String response) {
                        ConstantMethods.hideDialog();
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        Gson gson = gsonBuilder.create();
                        switch (foodType){
                            case "Dishes":
                                DishInfoParent dishInfoParent = gson.fromJson(response, DishInfoParent.class);
                                DishInfoAdapter dishInfoAdapter = new DishInfoAdapter(dishInfoParent,DishesActivity.this,foodType);
                                foodDataRcylr.setAdapter(dishInfoAdapter);
                                break;
                            case "Drinks":
                                DrinkInfoParent drinkInfoParent = gson.fromJson(response,DrinkInfoParent.class);
                                DishInfoAdapter drinkInfoAdapter = new DishInfoAdapter(drinkInfoParent,DishesActivity.this,foodType);
                                foodDataRcylr.setAdapter(drinkInfoAdapter);
                                break;
                            case "Pizza":
                                PizzaInfoParent pizzaInfoParent = gson.fromJson(response,PizzaInfoParent.class);
                                DishInfoAdapter pizzaInfoAdapter = new DishInfoAdapter(pizzaInfoParent,DishesActivity.this,foodType);
                                foodDataRcylr.setAdapter(pizzaInfoAdapter);
                                break;
                        }


                    }

                    @Override
                    public void onError(ANError anError) {
                        ConstantMethods.hideDialog();
                    }
                });
    }

    @Override
    public void onItemClick(int position, Object object) {
        switch (foodType){
            case "Dishes":
                DishCategoryInfo dishCategoryInfo = (DishCategoryInfo)object;
                catId = dishCategoryInfo.getCategoryId();
                getFoodData(catId,foodType);
                break;
            case "Drinks":
                DrinkCatInfo drinkCatInfo = (DrinkCatInfo)object;
                catId = drinkCatInfo.getDrinkCatId();
                getFoodData(catId,foodType);
                break;
        }

    }
}
