package com.example.tacademy.eunbiminitest.tstore;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tacademy.eunbiminitest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TStoreFragment extends Fragment {


    public TStoreFragment() {
        // Required empty public constructor
    }

    FragmentTabHost tabHost;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceStateV) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_tstore, container, false);
        tabHost = (FragmentTabHost) view.findViewById(R.id.tabhost);
        tabHost.setup(getContext(), getChildFragmentManager(),android.R.id.tabcontent);

        tabHost.addTab(tabHost.newTabSpec("category").setIndicator("Categoty"), TStoreCategoryFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("serarch").setIndicator("search"), TStoreSearchFragment.class, null);

        return view;
    }

}
