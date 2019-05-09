package com.example.paymenttest.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.example.paymenttest.R;
import com.example.paymenttest.adapters.OptionModifireAdapter;
import com.example.paymenttest.constants.ConstantMethods;
import com.example.paymenttest.constants.OnclickRecyclerItem;
import com.example.paymenttest.constants.TinyDB;
import com.example.paymenttest.modals.server.OmInfo;
import com.example.paymenttest.modals.server.OmInfoParent;
import com.example.paymenttest.modals.server.local.ItemsChoose;
import com.example.paymenttest.modals.server.local.ItemsChooseParent;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import static com.example.paymenttest.constants.ApiInterface.REST_ID;
import static com.example.paymenttest.constants.ApiInterface.URL_GET_ITEM_OPTION_MODIFIER;

public class OptionalMoidifreActivity extends AppCompatActivity implements OnclickRecyclerItem {
    private RecyclerView omRcylr;
    private OptionModifireAdapter optionModifireAdapter;
    private ItemsChoose itemsChoose;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optional_modifire);
        omRcylr = findViewById(R.id.om_rcylr);
        TextView addTxt = findViewById(R.id.add_to_order);
        omRcylr.setLayoutManager(new LinearLayoutManager(this));
        itemsChoose = (ItemsChoose) getIntent().getSerializableExtra("item_choose_modal");
        addTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<ItemsChoose> itemsChooses = new ArrayList<>();
                ItemsChooseParent itemsChooseParent = new ItemsChooseParent();
                itemsChooses.add(itemsChoose);
                itemsChooseParent.setItemsChooses(itemsChooses);
                Gson gson = new Gson();
                String json = gson.toJson(itemsChooseParent);
                Log.e("finally",json);
            }
        });
        getOMData();
    }

    private void getOMData(){
        String omId = getIntent().getStringExtra("om_id");
        AndroidNetworking
                .get(URL_GET_ITEM_OPTION_MODIFIER + REST_ID + "/omCatId/"+omId)
                .build()
                .getAsString(new StringRequestListener() {
                    @Override
                    public void onResponse(String response) {
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        Gson gson = gsonBuilder.create();
                        OmInfoParent omInfoParent = gson.fromJson(response, OmInfoParent.class);
                        optionModifireAdapter = new OptionModifireAdapter(omInfoParent,OptionalMoidifreActivity.this);
                        omRcylr.setAdapter(optionModifireAdapter);
                    }

                    @Override
                    public void onError(ANError anError) {

                    }
                });
    }

    @Override
    public void onItemClick(int position, Object o) {
        ItemsChoose itemsChoose = new ItemsChoose();
        List<OmInfo> omInfos = (List<OmInfo>)o;
        itemsChoose.setOmInfos(omInfos);
    }
}
