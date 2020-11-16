package com.example.futlife.PremierLeagueSubModule;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.futlife.CommonFiles.standingsConstructor;
import com.example.futlife.CommonFiles.standingsHolder;
import com.example.futlife.R;

import java.util.List;

public class plAdapter extends RecyclerView.Adapter<standingsHolder> {

    private List<standingsConstructor> football;
    private Context context;

    public plAdapter(List<standingsConstructor> list, Context context) {
        this.football = list;
        this.context = context;
    }

    @NonNull
    @Override
    public standingsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.fragment_table,parent,false);

        return new standingsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull standingsHolder holder, int position) {

        standingsConstructor currentdata = football.get(position);

        holder.pos.setText(""+currentdata.getOverall_league_position());
        holder.team.setText(""+currentdata.getTeam_name().trim());
        holder.pl.setText(""+currentdata.getOverall_league_payed());
        holder.won.setText(""+currentdata.getOverall_league_W());
        holder.drawn.setText(""+currentdata.getOverall_league_D());
        holder.lost.setText(""+currentdata.getOverall_league_L());
        holder.gf.setText(""+currentdata.getOverall_league_GF());
        holder.ga.setText(""+currentdata.getOverall_league_GA());
        holder.pts.setText(""+currentdata.getOverall_league_PTS());
    }

    @Override
    public int getItemCount() {
        return football.size();
    }
}
