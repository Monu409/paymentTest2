package com.example.paymenttest.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.example.paymenttest.R;
import com.example.paymenttest.constants.OnclickRecyclerItem;
import com.example.paymenttest.modals.server.OmInfo;
import com.example.paymenttest.modals.server.OmInfoParent;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by SQ-OGBE PC on 06/08/2017.
 */

public class OptionModifireAdapter extends RecyclerView.Adapter<OptionModifireAdapter.ViewHolder> {
    OmInfoParent omInfoParent;
    SparseBooleanArray itemStateArray= new SparseBooleanArray();
    List<OmInfo> omInfos = new ArrayList<>();
    private OnclickRecyclerItem onclickRecyclerItem;
    public OptionModifireAdapter(OmInfoParent omInfoParent, OnclickRecyclerItem onclickRecyclerItem) {
        this.omInfoParent = omInfoParent;
        this.onclickRecyclerItem = onclickRecyclerItem;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutForItem = R.layout.adapter_option_modifire;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutForItem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        if (omInfoParent == null) {
            return 0;
        }
        return omInfoParent.getOmInfo().size();
    }


    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        CheckBox mCheckedTextView;
        TextView omTxtName,omTxtPrice;

        ViewHolder(View itemView) {
            super(itemView);
            mCheckedTextView =  itemView.findViewById(R.id.checked_text_view);
            omTxtName =  itemView.findViewById(R.id.om_txt);
            omTxtPrice =  itemView.findViewById(R.id.om_price_txt);
            mCheckedTextView.setButtonDrawable(R.drawable.change_check_image);
            itemView.setOnClickListener(this);
        }

        void bind(int position) {
            // use the sparse boolean array to check
            if (!itemStateArray.get(position, false)) {
                mCheckedTextView.setChecked(false);}
            else {
                mCheckedTextView.setChecked(true);
            }
            omTxtName.setText(omInfoParent.getOmInfo().get(position).getOmItemName());
            omTxtPrice.setText(omInfoParent.getOmInfo().get(position).getPrice());
        }

        @Override
        public void onClick(View v) {
            int adapterPosition = getAdapterPosition();
            if (!itemStateArray.get(adapterPosition, false)) {
                mCheckedTextView.setChecked(true);
                itemStateArray.put(adapterPosition, true);
                omInfos.add(omInfoParent.getOmInfo().get(adapterPosition));
            }
            else  {
                mCheckedTextView.setChecked(false);
                itemStateArray.put(adapterPosition, false);
                omInfos.remove(omInfoParent.getOmInfo().get(adapterPosition));
            }
            onclickRecyclerItem.onItemClick(adapterPosition,omInfos);
        }

    }
}