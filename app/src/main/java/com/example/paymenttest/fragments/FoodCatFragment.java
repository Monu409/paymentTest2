package com.example.paymenttest.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.example.paymenttest.R;
import com.example.paymenttest.constants.ApiInterface;
import com.example.paymenttest.modals.server.DishCategoryInfoParent;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FoodCatFragment extends Fragment {
    private RecyclerView catRcylr;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food_cat,container,false);
        catRcylr = view.findViewById(R.id.cat_rcylr);
        catRcylr.setLayoutManager(new LinearLayoutManager(getActivity()));
        getData();
        return view;
    }

    private void getData(){
        AndroidNetworking.get(ApiInterface.URL_GET_FOOD_SUB_CATEGORY_FOR_DISH+"30692730")
                .build()
                .getAsString(new StringRequestListener() {
                    @Override
                    public void onResponse(String response) {
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        Gson gson = gsonBuilder.create();
                        DishCategoryInfoParent example = gson.fromJson(response, DishCategoryInfoParent.class);
//                        FoodCatAdapter foodCatAdapter = new FoodCatAdapter(example,getActivity());
//                        catRcylr.setAdapter(foodCatAdapter);
                    }

                    @Override
                    public void onError(ANError anError) {

                    }
                });
    }
}
