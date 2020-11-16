package com.example.futlife.Ligue1SubModule;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.futlife.R;
import com.example.futlife.ligue1teams.*;

/**
 * A simple {@link Fragment} subclass.
 */
public class Ligue1TeamFrag extends Fragment {


    public Ligue1TeamFrag() {
        // Required empty public constructor
    }

    private ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18, imageView19, imageView20;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_ligue1_team, container, false);

        imageView1 = view.findViewById(R.id.imageView1);
        imageView2 = view.findViewById(R.id.imageView2);
        imageView3 = view.findViewById(R.id.imageView3);
        imageView4 = view.findViewById(R.id.imageView4);
        imageView5 = view.findViewById(R.id.imageView5);
        imageView6 = view.findViewById(R.id.imageView6);
        imageView7 = view.findViewById(R.id.imageView7);
        imageView8 = view.findViewById(R.id.imageView8);
        imageView9 = view.findViewById(R.id.imageView9);
        imageView10 = view.findViewById(R.id.imageView10);
        imageView11 = view.findViewById(R.id.imageView11);
        imageView12 = view.findViewById(R.id.imageView12);
        imageView13 = view.findViewById(R.id.imageView13);
        imageView14 = view.findViewById(R.id.imageView14);
        imageView15 = view.findViewById(R.id.imageView15);
        imageView16 = view.findViewById(R.id.imageView16);
        imageView17 = view.findViewById(R.id.imageView17);
        imageView18 = view.findViewById(R.id.imageView18);
        imageView19 = view.findViewById(R.id.imageView19);
        imageView20 = view.findViewById(R.id.imageView20);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.ligue1module, new angers());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.ligue1module, new bordeaux());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.ligue1module, new dijon());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.ligue1module, new lille());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.ligue1module, new lyon());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.ligue1module, new metz());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.ligue1module, new monaco());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.ligue1module, new montpellier());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.ligue1module, new nice());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.ligue1module, new nimes());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.ligue1module, new psg());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.ligue1module, new reims());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.ligue1module, new rennes());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.ligue1module, new saint());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.ligue1module, new strasbourg());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.ligue1module, new toulouse());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });







        return view;
    }

}
