package com.example.futlife.ligue1teams;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.futlife.R;
import com.example.futlife.ligue1teamsAPI.*;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class psg extends Fragment {


    public psg() {
        // Required empty public constructor
    }

    private TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_psg, container, false);
        textView = view.findViewById(R.id.textapi);
        getData();
        return view;
    }
    private void getData(){

        Call<List<psgAPI>> call = psgmain.getpsgfootballteam().getpsgplayers();

        call.enqueue(new Callback<List<psgAPI>>() {
            @Override
            public void onResponse(Call<List<psgAPI>> call, Response<List<psgAPI>> response) {


                if (!response.isSuccessful()){

                    textView.setText("code: " + response.code());
                    return;

                }
                List<psgAPI> footballs =  response.body();

                for (psgAPI football : footballs
                ) {


                    String content = "";
                    content+="Name- " + football.getPlayer_name()+ "\n";
                    content+="Number- " + football.getPlayer_number()+ "\n";
                    content+="Country- " + football.getPlayer_country()+ "\n";
                    content+="Position- " + football.getPlayer_type()+ "\n";
                    content+="Age- " + football.getPlayer_age()+ "\n";
                    content+="Matches Played- " + football.getPlayer_match_played()+ "\n";
                    content+="Goal Scored- " + football.getPlayer_goals()+ "\n";
                    content+="Yellow Card- " + football.getPlayer_yellow_cards()+ "\n";
                    content+="Red Card- " + football.getPlayer_red_cards()+ "\n\n\n";



                    textView.append(content);

                }


            }

            @Override
            public void onFailure(Call<List<psgAPI>> call, Throwable t) {

                textView.setText(t.getMessage());
            }
        });



    }
}
