package com.example.tacademy.eunbiminitest.tstore;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.tacademy.eunbiminitest.data.TStorePhoneModel;

/**
 * Created by seoeunbi on 2016. 5. 10..
 */
public class ModelViewHolder extends RecyclerView.ViewHolder {
    TextView nameView;

    public ModelViewHolder(View itemView) {
        super(itemView);
        nameView = (TextView)itemView;
    }
    TStorePhoneModel model;
    public void setModel(TStorePhoneModel model){
        this.model= model;
        nameView.setText(model.modelName + "(" + model.modelCode + ")");
    }
}
