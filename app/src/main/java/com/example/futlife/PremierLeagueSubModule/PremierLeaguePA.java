package com.example.futlife.PremierLeagueSubModule;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PremierLeaguePA extends FragmentPagerAdapter {

    private int numoftabs;

    public PremierLeaguePA(@NonNull FragmentManager fm, int numoftabs) {
        super(fm);
        this.numoftabs = numoftabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                return new TableFragment();
            case 1:
                return new TopPLFragment();
            case 2:
                return new ScheduleFragment();

            case 3:
                return new TeamsFragment();


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
