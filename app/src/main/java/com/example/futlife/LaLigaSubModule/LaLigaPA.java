package com.example.futlife.LaLigaSubModule;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.futlife.LaLigaSubModule.*;


public class LaLigaPA extends FragmentPagerAdapter {

    private int numoftabs;

    public LaLigaPA(@NonNull FragmentManager fm, int numoftabs) {
        super(fm);
        this.numoftabs = numoftabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                return new LLTableFrag();
            case 1:
                return new LLTopSFrag();
            case 2:
                return new LLScheduleFrag();
            case 3:
                return new LLTeamFrag();


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
