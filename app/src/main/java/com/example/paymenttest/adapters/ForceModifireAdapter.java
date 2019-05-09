package com.example.paymenttest.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.paymenttest.R;
import com.example.paymenttest.constants.OnclickRecyclerItem;
import com.example.paymenttest.modals.server.FmInfoParent;

public class ForceModifireAdapter extends RecyclerView.Adapter<ForceModifireAdapter.FMHolder> {
    private FmInfoParent fmInfoParent;
    private LayoutInflater layoutInflater;
    public static int selected_item = -1;
    private OnclickRecyclerItem onclickRecyclerItem;

    public ForceModifireAdapter(FmInfoParent fmInfoParent, Context context,OnclickRecyclerItem onclickRecyclerItem){
        this.fmInfoParent = fmInfoParent;
        layoutInflater = LayoutInflater.from(context);
        this.onclickRecyclerItem = onclickRecyclerItem;
    }
    @NonNull
    @Override
    public FMHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = layoutInflater.inflate(R.layout.adapter_force_modifire,viewGroup,false);
        return new FMHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final FMHolder fmHolder, final int position) {
        fmHolder.fmNameTxt.setText(fmInfoParent.getFmInfo().get(position).getFmItemName());
        fmHolder.fmPriceTxt.setText(fmInfoParent.getFmInfo().get(position).getPrice());
        fmHolder.rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onclickRecyclerItem.onItemClick(position,fmInfoParent.getFmInfo().get(position));
                selected_item = position;
                notifyDataSetChanged();
            }
        });
        if(position == selected_item) {
            fmHolder.selectedImg.setImageResource(R.drawable.checked);
        } else {
            fmHolder.selectedImg.setImageResource(R.drawable.un_checked);
        }
    }

    @Override
    public int getItemCount() {
        return fmInfoParent.getFmInfo().size();
    }

    class FMHolder extends RecyclerView.ViewHolder {
        TextView fmNameTxt,fmPriceTxt;
        ImageView selectedImg;
        RelativeLayout rowView;
        public FMHolder(@NonNull View itemView) {
            super(itemView);
            fmNameTxt = itemView.findViewById(R.id.fm_txt);
            fmPriceTxt = itemView.findViewById(R.id.fm_price_txt);
            selectedImg = itemView.findViewById(R.id.selected_icon);
            rowView = itemView.findViewById(R.id.row_view);
        }
    }
}
