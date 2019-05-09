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
import com.example.paymenttest.constants.ConstantMethods;
import com.example.paymenttest.modals.server.DishInfoParent;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FoodDataFragment extends Fragment {
    private RecyclerView foodDataRcylr;
    String catId = "106";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food_data,container,false);
        Bundle bundle = this.getArguments();
        catId = bundle.getString("message");
        foodDataRcylr = view.findViewById(R.id.food_data_rcylr);
        foodDataRcylr.setLayoutManager(new LinearLayoutManager(getActivity()));
        ConstantMethods.showDialog(getActivity());
        getData();
        return view;
    }

    private void getData(){
        AndroidNetworking.get(ApiInterface.URL_GET_FOOD_ITEM_BASED_ON_SUBCATEGORY+"30692730/catId/"+catId)
                .build()
                .getAsString(new StringRequestListener() {
                    @Override
                    public void onResponse(String response) {
                        ConstantMethods.hideDialog();
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        Gson gson = gsonBuilder.create();
                        DishInfoParent dishInfoParent = gson.fromJson(response, DishInfoParent.class);
//                        DishInfoAdapter dishInfoAdapter = new DishInfoAdapter(dishInfoParent,getActivity());
//                        foodDataRcylr.setAdapter(dishInfoAdapter);
                    }

                    @Override
                    public void onError(ANError anError) {
                        ConstantMethods.hideDialog();
                    }
                });
    }
}
