package com.example.futlife.Livescore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.futlife.R;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private ArrayList<AndroidVersionConstruct> android;

    public DataAdapter(ArrayList<AndroidVersionConstruct> android) {
        this.android = android;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        holder.home.setText(android.get(position).getEvent_home_team());
        holder.eventdate.setText(android.get(position).getEvent_date());
        holder.away.setText(android.get(position).getEvent_away_team());
        holder.leaguename.setText(android.get(position).getLeague_name());
        holder.status.setText(android.get(position).getEvent_status());
        holder.countryname.setText(android.get(position).getCountry_name());
        holder.currentscore.setText(android.get(position).getEvent_final_result());
        holder.time.setText(android.get(position).getEvent_time());

    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView home,eventdate,finalresult,away,leaguename,time,countryname,status,currentscore;

        public ViewHolder(View itemView) {
            super(itemView);

            home = itemView.findViewById(R.id.home);
            eventdate = itemView.findViewById(R.id.eventdate);
            away=itemView.findViewById(R.id.away);
            leaguename = itemView.findViewById(R.id.leaguename);
            time = itemView.findViewById(R.id.time);
            countryname=itemView.findViewById(R.id.countryname);
            status =itemView.findViewById(R.id.status);
            currentscore = itemView.findViewById(R.id.currentscore);
        }
    }


}
