package com.example.futlife.CommonFiles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.futlife.R;

import java.util.ArrayList;

public class PLtopAdapter extends RecyclerView.Adapter<PLtopAdapter.ViewHolder> {
    private ArrayList<TopConstruct> android;

    public PLtopAdapter(ArrayList<TopConstruct> android) {
        this.android = android;
    }

    @NonNull
    @Override
    public PLtopAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_top_pl,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.position.setText(android.get(position).getPlayer_place()+".");
        holder.pname.setText(android.get(position).getPlayer_name());
        holder.team.setText(android.get(position).getTeam_name());
        holder.goals.setText(android.get(position).getGoals());

    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView pname,team,goals,position;

        public ViewHolder(View itemView) {
            super(itemView);

            pname = itemView.findViewById(R.id.pname);
            team = itemView.findViewById(R.id.tname);
            goals=itemView.findViewById(R.id.goals);
            position= itemView.findViewById(R.id.position);

        }
    }
}
