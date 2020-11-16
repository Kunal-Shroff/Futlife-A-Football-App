package com.example.futlife.PremierLeagueSubModule;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.futlife.CommonFiles.PLtopAdapter;
import com.example.futlife.CommonFiles.PLtopResponse;
import com.example.futlife.CommonFiles.TopConstruct;
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
public class TopPLFragment extends Fragment {


    public TopPLFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private ArrayList<TopConstruct> data;
    private PLtopAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_top_pl, container, false);
        recyclerView = view.findViewById(R.id.card_recycler_viewPLTop);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        loadJSON();
        return view;
    }
    private void loadJSON() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://allsportsapi.com/api/football/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PLtopInterface request = retrofit.create( PLtopInterface.class);
        Call<PLtopResponse> call = request.getJSON();
        call.enqueue(new Callback<PLtopResponse>() {
            @Override
            public void onResponse(Call<PLtopResponse> call, Response<PLtopResponse> response) {

                PLtopResponse jsonResponse = response.body();
                data = new ArrayList<>(Arrays.asList(jsonResponse.getAndroid()));
                adapter = new PLtopAdapter(data);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<PLtopResponse> call, Throwable t) {
                Toast.makeText(getContext(), "No Internet Connection "+t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
