package com.example.tacademy.eunbiminitest.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dongja94 on 2016-05-09.
 */
public class TStoreProducts {
    @SerializedName("product")
    public List<TStoreProduct> productList;
}
