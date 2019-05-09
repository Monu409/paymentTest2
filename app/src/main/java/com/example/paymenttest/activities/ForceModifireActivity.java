package com.example.paymenttest.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.example.paymenttest.R;
import com.example.paymenttest.adapters.ForceModifireAdapter;
import com.example.paymenttest.constants.ConstantMethods;
import com.example.paymenttest.constants.OnclickRecyclerItem;
import com.example.paymenttest.modals.server.FmInfo;
import com.example.paymenttest.modals.server.FmInfoParent;
import com.example.paymenttest.modals.server.OmInfo;
import com.example.paymenttest.modals.server.local.ItemsChoose;
import com.example.paymenttest.modals.server.local.ItemsChooseParent;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import static com.example.paymenttest.constants.ApiInterface.REST_ID;
import static com.example.paymenttest.constants.ApiInterface.URL_GET_ITEM_FORCE_MODIFIER;

public class ForceModifireActivity extends AppCompatActivity implements OnclickRecyclerItem {
    private RecyclerView fmRcylr;
    private TextView addToOrder;
    private ItemsChoose itemsChoose;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_force_modifire);
        fmRcylr = findViewById(R.id.fm_rcylr);
        addToOrder = findViewById(R.id.add_to_order);
        fmRcylr.setLayoutManager(new LinearLayoutManager(this));
        ConstantMethods.showDialog(this);
        getFmData();
        itemsChoose = (ItemsChoose) getIntent().getSerializableExtra("item_choose_modal");
        addToOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String omId = getIntent().getStringExtra("om_id");
                if(omId.equals("0")){

                }
                else{
                    Intent intent = new Intent(ForceModifireActivity.this, OptionalMoidifreActivity.class);
                    intent.putExtra("om_id",omId);
                    intent.putExtra("item_choose_modal",itemsChoose);
                    startActivity(intent);
                }
            }
        });
    }

    private void getFmData(){
        String fmId = getIntent().getStringExtra("fm_id");
        String url = URL_GET_ITEM_FORCE_MODIFIER + REST_ID + "/fmCatId/"+fmId;
        AndroidNetworking
                .get(url)
                .build()
                .getAsString(new StringRequestListener() {
                    @Override
                    public void onResponse(String response) {
                        ConstantMethods.hideDialog();
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        Gson gson = gsonBuilder.create();
                        FmInfoParent fmInfoParent = gson.fromJson(response,FmInfoParent.class);
                        ForceModifireAdapter forceModifireAdapter = new ForceModifireAdapter(fmInfoParent,ForceModifireActivity.this, ForceModifireActivity.this);
                        fmRcylr.setAdapter(forceModifireAdapter);
                    }

                    @Override
                    public void onError(ANError anError) {

                    }
                });
    }

    @Override
    public void onItemClick(int position, Object o) {
        FmInfo fmInfo = (FmInfo) o;
        itemsChoose.setFmInfo(fmInfo);
    }
}
