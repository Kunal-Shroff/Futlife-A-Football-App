package com.example.futlife.Nations;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.futlife.Livescore.AndroidVersionConstruct;
import com.example.futlife.R;

import java.util.ArrayList;

public class leagueAdapter extends RecyclerView.Adapter<leagueAdapter.ViewHolder> {

    private ArrayList<leagueconstructor> android;

    public leagueAdapter(ArrayList<leagueconstructor> android) {
        this.android = android;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(leagueAdapter.ViewHolder holder, int position) {

        holder.countryname.setText(android.get(position).getCountry_name());
        holder.leaguename.setText(android.get(position).getLeague_name());


    }

    @Override
    public int getItemCount() {
        return android.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView leaguename,countryname;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            countryname = itemView.findViewById(R.id.countryname);

            leaguename = itemView.findViewById(R.id.leaguename);


        }
    }
}
