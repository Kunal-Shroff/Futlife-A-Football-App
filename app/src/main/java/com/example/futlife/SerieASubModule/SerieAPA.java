package com.example.futlife.SerieASubModule;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;




public class SerieAPA extends FragmentPagerAdapter {

    private int numoftabs;

    public SerieAPA(@NonNull FragmentManager fm, int numoftabs) {
        super(fm);
        this.numoftabs = numoftabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                return new SATableFrag();
            case 1:
                return new SATopSFrag();
            case 2:
                return new SAScheduleFrag();
            case 3:
                return new SATeamFrag();


            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return numoftabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
