package com.example.tacademy.eunbiminitest.youtube;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tacademy.eunbiminitest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class YoutubeSearchFragment extends Fragment {


    public YoutubeSearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_youtube_search, container, false);
    }

}
