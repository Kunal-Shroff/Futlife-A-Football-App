package com.example.futlife.ChampionsLeague;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.futlife.PremierLeagueSubModule.ScheduleFragment;
import com.example.futlife.PremierLeagueSubModule.TableFragment;
import com.example.futlife.PremierLeagueSubModule.TeamsFragment;
import com.example.futlife.PremierLeagueSubModule.TopPLFragment;


public class CLPageAdapter extends FragmentPagerAdapter {

    private int numoftabs;

    public CLPageAdapter(@NonNull FragmentManager fm, int numoftabs) {
        super(fm);
        this.numoftabs = numoftabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                return new CLTable();
            case 1:
                return new CLSchedule();


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
