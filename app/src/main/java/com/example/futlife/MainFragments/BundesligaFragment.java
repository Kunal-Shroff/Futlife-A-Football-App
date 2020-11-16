package com.example.futlife.MainFragments;


import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.futlife.BundesligaSubModule.BundesligaPA;
import com.example.futlife.MainActivity;
import com.example.futlife.PremierLeagueSubModule.PremierLeaguePA;
import com.example.futlife.R;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class BundesligaFragment extends Fragment {


    public BundesligaFragment() {
        // Required empty public constructor
    }
    private TabLayout tabLayout;
    private ViewPager viewPager;

    public BundesligaPA pageAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_bundesliga, container, false);
        tabLayout = view.findViewById(R.id.tablayout);
        viewPager = view.findViewById(R.id.viewpagerBL);

        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Bundesliga");

        pageAdapter = new BundesligaPA(getFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                if (tab.getPosition() == 0){

                    pageAdapter.notifyDataSetChanged();
                }
                else if (tab.getPosition() == 1){

                    pageAdapter.notifyDataSetChanged();

                }
                else if (tab.getPosition() == 2){

                    pageAdapter.notifyDataSetChanged();

                }
                else if (tab.getPosition() == 3){

                    pageAdapter.notifyDataSetChanged();

                }
                else if (tab.getPosition() == 4){

                    pageAdapter.notifyDataSetChanged();

                }



            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

       return view;
    }

}
