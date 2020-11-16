package com.example.futlife.EuropaLeague;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.futlife.ChampionsLeague.CLSchedule;
import com.example.futlife.ChampionsLeague.CLTable;


public class ELPageAdapter extends FragmentPagerAdapter {

    private int numoftabs;

    public ELPageAdapter(@NonNull FragmentManager fm, int numoftabs) {
        super(fm);
        this.numoftabs = numoftabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                return new ELTopS();
            case 1:
                return new ELSchedule();


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
