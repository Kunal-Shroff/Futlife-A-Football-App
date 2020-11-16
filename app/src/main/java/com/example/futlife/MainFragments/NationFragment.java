package com.example.futlife.MainFragments;


import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.futlife.MainActivity;
import com.example.futlife.Nations.*;
import com.example.futlife.R;

import java.util.ArrayList;
import java.util.Arrays;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 */
public class NationFragment extends Fragment {


    public NationFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private ArrayList<leagueconstructor> data;
    private leagueAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_nation, container, false);

        recyclerView = view.findViewById(R.id.recyclerviewNations);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        loadJSON();

        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Nations");
        return view;
    }
    private void loadJSON() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://allsportsapi.com/api/football/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        leagueinterface request = retrofit.create(leagueinterface.class);
        Call<leagueResponse> call = request.getDataSet();
        call.enqueue(new Callback<leagueResponse>() {
            @Override
            public void onResponse(Call<leagueResponse> call, Response<leagueResponse> response) {

                leagueResponse jsonResponse = response.body();
                data = new ArrayList<>(Arrays.asList(jsonResponse.getAndroid()));
                adapter = new leagueAdapter(data);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<leagueResponse> call, Throwable t) {
                Log.d("Error",t.getMessage());
            }
        });
    }
}
