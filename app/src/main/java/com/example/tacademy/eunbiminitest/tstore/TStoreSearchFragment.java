package com.example.tacademy.eunbiminitest.tstore;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tacademy.eunbiminitest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TStoreSearchFragment extends Fragment {


    public TStoreSearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tstore_search, container, false);
    }

}
