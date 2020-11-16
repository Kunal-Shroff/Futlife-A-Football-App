package com.example.futlife.BundesligaSubModule;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.futlife.R;
import com.example.futlife.bundteams.*;

/**
 * A simple {@link Fragment} subclass.
 */
public class BLTeamFrag extends Fragment {


    public BLTeamFrag() {
        // Required empty public constructor
    }

    private ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18, imageView19, imageView20;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blteam, container, false);

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

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.bundesligamodule, new augsburg());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });


        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.bundesligamodule, new bayern());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.bundesligamodule, new bayer());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.bundesligamodule, new dortmund());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.bundesligamodule, new dusseldorf());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.bundesligamodule, new frankfurt());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.bundesligamodule, new frieburg());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.bundesligamodule, new hertha());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.bundesligamodule, new hoffenhiem());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.bundesligamodule, new leipzig());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.bundesligamodule, new mainz());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.bundesligamodule, new paderborn());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.bundesligamodule, new unionberlin());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.bundesligamodule, new werderbremen());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        imageView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.bundesligamodule, new wolfsburg());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });





        return  view;
    }

}
