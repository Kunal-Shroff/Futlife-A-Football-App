package com.example.futlife.BundesligaSubModule;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;




public class BundesligaPA extends FragmentPagerAdapter {

    private int numoftabs;

    public BundesligaPA(@NonNull FragmentManager fm, int numoftabs) {
        super(fm);
        this.numoftabs = numoftabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                return new BLTableFrag();
            case 1:
                return new BLTopSFrag();
            case 2:
                return new BLScheduleFrag();

            case 3:
                return new BLTeamFrag();


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
