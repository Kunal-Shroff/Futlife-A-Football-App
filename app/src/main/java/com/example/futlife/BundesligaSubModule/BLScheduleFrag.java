package com.example.futlife.BundesligaSubModule;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.futlife.CommonFiles.FixtureConstruct;
import com.example.futlife.CommonFiles.PLfixtureAdapter;
import com.example.futlife.CommonFiles.PLfixtureResponse;
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
public class BLScheduleFrag extends Fragment {


    public BLScheduleFrag() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private ArrayList<FixtureConstruct> data;
    private PLfixtureAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blschedule, container, false);

        recyclerView = view.findViewById(R.id.card_recycler_viewBLSchedule);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        loadJSON();
        return  view;
    }
    private void loadJSON() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://allsportsapi.com/api/football/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        BundfixtureInterface request = retrofit.create( BundfixtureInterface .class);
        Call<PLfixtureResponse> call = request.getJSON();
        call.enqueue(new Callback<PLfixtureResponse>() {
            @Override
            public void onResponse(Call<PLfixtureResponse> call, Response<PLfixtureResponse> response) {

                PLfixtureResponse jsonResponse = response.body();
                data = new  ArrayList<>(Arrays.asList(jsonResponse.getAndroid()));
                adapter = new PLfixtureAdapter(data);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<PLfixtureResponse> call, Throwable t) {
                Log.d("Error",t.getMessage());
            }
        });
    }
}
