package com.example.futlife.CommonFiles;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.futlife.R;

public class standingsHolder extends RecyclerView.ViewHolder {

    public TextView pos;
    public TextView team;
    public TextView pl;
    public TextView won;
    public TextView drawn;
    public TextView lost;
    public TextView gf;
    public TextView ga;
    public TextView pts;
    public standingsHolder(@NonNull View itemView) {
        super(itemView);

        pos = itemView.findViewById(R.id.pos);
        team = itemView.findViewById(R.id.team);
        pl = itemView.findViewById(R.id.pl);
        won = itemView.findViewById(R.id.won);
        drawn = itemView.findViewById(R.id.drawn);
        lost = itemView.findViewById(R.id.lost);
        gf= itemView.findViewById(R.id.gf);
        ga= itemView.findViewById(R.id.ga);
        pts = itemView.findViewById(R.id.pts);
    }
}
