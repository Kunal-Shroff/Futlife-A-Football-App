package com.example.futlife.Ligue1SubModule;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.futlife.LaLigaSubModule.LLTableFrag;


public class Ligue1PA extends FragmentPagerAdapter {

    private int numoftabs;

    public Ligue1PA(@NonNull FragmentManager fm, int numoftabs) {
        super(fm);
        this.numoftabs = numoftabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                return new Ligue1TableFrag();
            case 1:
                return new Ligue1TopSFrag();
            case 2:
                return new Ligue1ScheduleFrag();

            case 3:
                return new Ligue1TeamFrag();


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
