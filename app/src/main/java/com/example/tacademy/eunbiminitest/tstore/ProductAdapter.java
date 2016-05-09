package com.example.tacademy.eunbiminitest.tstore;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tacademy.eunbiminitest.R;
import com.example.tacademy.eunbiminitest.data.TStoreProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tacademy on 2016-05-09.
 */
public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {
    List<TStoreProduct> items = new ArrayList<>();

    public void clear() {
        items.clear();
        notifyDataSetChanged();
    }

    public void add(TStoreProduct product) {
        items.add(product);
        notifyDataSetChanged();
    }

    public void addAll(List<TStoreProduct> items) {
        this.items.addAll(items);
        notifyDataSetChanged();
    }

    ProductViewHolder.OnItemClickListener mListener;
    public void setOnItemClickListener(ProductViewHolder.OnItemClickListener listener) {
        mListener = listener;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_tstore_product, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        holder.setProduct(items.get(position));
        holder.setOnItemClickListener(mListener);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}