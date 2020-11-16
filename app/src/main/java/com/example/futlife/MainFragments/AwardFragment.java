package com.example.futlife.MainFragments;


import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.futlife.MainActivity;
import com.example.futlife.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AwardFragment extends Fragment {


    public AwardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_award, container, false);

        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Awards");

        return view;
    }

}
