package com.example.tacademy.eunbiminitest.tstore;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by seoeunbi on 2016. 5. 10..
 */


public class ImageViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    public ImageViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView)itemView;
    }

    public void setPreViewImage(String url){
        Glide.with(imageView.getContext()).load(url).into(imageView);
    }
}
