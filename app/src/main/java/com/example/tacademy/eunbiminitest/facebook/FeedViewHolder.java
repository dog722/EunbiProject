package com.example.tacademy.eunbiminitest.facebook;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.tacademy.eunbiminitest.data.FacebookFeed;

/**
 * Created by seoeunbi on 2016. 5. 11..
 */
public class FeedViewHolder extends RecyclerView.ViewHolder{
    TextView textView;
    public FeedViewHolder(View itemView) {
        super(itemView);
        textView = (TextView)itemView;
    }

    public  void setFacebookFeed (FacebookFeed feed){
        textView.setText(feed.story != null ? feed.story : feed.message);
    }
}
