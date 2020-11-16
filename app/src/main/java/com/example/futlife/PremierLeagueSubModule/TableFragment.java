package com.example.futlife.PremierLeagueSubModule;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.futlife.CommonFiles.standingsConstructor;
import com.example.futlife.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 */
public class TableFragment extends Fragment {


    public TableFragment() {
        // Required empty public constructor
    }


    private RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_table, container, false);

        recyclerView = view.findViewById(R.id.recyclerviewPLTable);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        Getdata();

        return view;
    }
    private void Getdata(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://apiv2.apifootball.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        plSint ourRetrofit= retrofit.create(plSint.class);


        Call<List<standingsConstructor>> listCall = ourRetrofit.getDataSet();

        listCall.enqueue(new Callback<List<standingsConstructor>>() {
            @Override
            public void onResponse(Call<List<standingsConstructor>> call, Response<List<standingsConstructor>> response) {

                ShowIt(response.body());
            }

            @Override
            public void onFailure(Call<List<standingsConstructor>> call, Throwable t) {

                Toast.makeText(getContext(), "Please check your Internet Connection", Toast.LENGTH_LONG ).show();



            }
        });

    }

    private void ShowIt(List<standingsConstructor> response) {

        plAdapter adapter = new plAdapter(response,getContext());


        recyclerView.setAdapter(adapter);

    }
}
