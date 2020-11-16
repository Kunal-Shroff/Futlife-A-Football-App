package com.example.futlife.MainFragments;


import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.futlife.MainActivity;
import com.example.futlife.PremierLeagueSubModule.PremierLeaguePA;
import com.example.futlife.R;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class PremierLeagueFragment extends Fragment {


    public PremierLeagueFragment() {
        // Required empty public constructor
    }

    private TabLayout tabLayout;
    private ViewPager viewPager;

    public PremierLeaguePA pageAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_premier_league, container, false);
        tabLayout = view.findViewById(R.id.tablayout);
        viewPager = view.findViewById(R.id.viewpagerPL);

        ((MainActivity)getActivity()).getSupportActionBar().setTitle("PremierLeague");
        pageAdapter = new PremierLeaguePA(getFragmentManager(),tabLayout.getTabCount());
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


    @Override
    public void onPause() {
        super.onPause();


    }
}
