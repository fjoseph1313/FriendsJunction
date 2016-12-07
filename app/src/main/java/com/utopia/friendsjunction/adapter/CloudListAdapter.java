package com.utopia.friendsjunction.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.utopia.friendsjunction.R;
import com.utopia.friendsjunction.model.Cloud;

/**
 * Created by fjoseph1313 on 12/6/2016.
 */

public class CloudListAdapter extends ArrayAdapter<Cloud> {

    private Context context;
    private Cloud[] clouds;
    private int resource;

    public CloudListAdapter(Context context, int resource, Cloud[] clouds) {
        super(context, R.layout.clouds, clouds);

        this.clouds = clouds;
        this.context = context;
        this.resource = resource;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View rowView = inflater.inflate(R.layout.clouds, null, true);

        TextView cloudName = (TextView) rowView.findViewById(R.id.cloudName);
        TextView cloudDesc = (TextView) rowView.findViewById(R.id.cloudDesc);
        ImageView cloudIcon = (ImageView) rowView.findViewById(R.id.cloudIcon); //This is fixed at the moment

        String cloudDescription = String.format("Cloud Status : %s",
                clouds[position].getCloudStatus());
        cloudName.setText(clouds[position].getCloudName());
        cloudDesc.setText(cloudDescription);

        return rowView;

    }
}
