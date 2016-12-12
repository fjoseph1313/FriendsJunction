package com.utopia.friendsjunction.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.utopia.friendsjunction.R;
import com.utopia.friendsjunction.model.Arrow;

import java.util.List;

/**
 * Created by fjoseph1313 on 12/8/2016.
 */

public class ArrowListAdapter extends ArrayAdapter<Arrow> {

    private Context context;
    private int resource;
    private List<Arrow> arrows;

    public ArrowListAdapter(Context context, int resource, List<Arrow> arrows) {
        super(context, R.layout.arrows, arrows);
        this.context = context;
        this.resource = resource;
        this.arrows = arrows;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View rowView = inflater.inflate(R.layout.arrows, null, true);

        Arrow arrow = arrows.get(position);

        TextView jumperName = (TextView) rowView.findViewById(R.id.shooterView);
        TextView arrowTxt = (TextView) rowView.findViewById(R.id.arrowView);
        TextView arrowDate = (TextView) rowView.findViewById(R.id.shotDtView);
        TextView vanes = (TextView) rowView.findViewById(R.id.vanes);
        //use position and list to bind an arrow in a view.
        jumperName.setText(arrow.getJumper().getJumperName());
        arrowTxt.setText(arrow.getArrowText());
        arrowDate.setText(arrow.getArrowDate().toString());
        vanes.setText("982 Vanes");

        return rowView;
    }
}
