package com.utopia.friendsjunction.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.utopia.friendsjunction.R;
import com.utopia.friendsjunction.model.Balloon;

import java.util.List;

/**
 * Created by fjoseph1313 on 12/7/2016.
 */

public class BalloonListAdapter extends ArrayAdapter<Balloon>{

    private Context context;
    private int resource;
    private List<Balloon> balloons;

    public BalloonListAdapter(Context context, int resource, List<Balloon> balloons) {
        super(context, R.layout.balloons, balloons);
        this.context = context;
        this.resource = resource;
        this.balloons = balloons;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(context);
        View rowView = inflater.inflate(R.layout.balloons, null, true);

        TextView balloon_name = (TextView) rowView.findViewById(R.id.balloonName);
        TextView balloon_status = (TextView) rowView.findViewById(R.id.balloonStatus);
        TextView balloon_arrows = (TextView) rowView.findViewById(R.id.balloonArrows);

        //use position and list of balloons to display each with respect to the view
        balloon_name.setText(balloons.get(position).getBalloonName());
        balloon_status.setText(balloons.get(position).getBalloonStatus());
        balloon_arrows.setText("1313 Arrows"); //TODO String format of arrows required

        return rowView;
    }
}
