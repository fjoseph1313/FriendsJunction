package com.utopia.friendsjunction.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.utopia.friendsjunction.R;
import com.utopia.friendsjunction.adapter.CloudListAdapter;
import com.utopia.friendsjunction.model.Cloud;

import java.util.Date;

public class DisplayClouds extends AppCompatActivity {

    public static final String CLOUD_SELECTED = "CLOUD_ID";
    private final Cloud[] clouds = {
            Cloud.builder().withCloudName("AJ's Cloud").withCloudStatus("Active").withCloudCreatedDate(new Date()).build(),
            Cloud.builder().withCloudName("Francis's Cloud").withCloudStatus("InActive").withCloudCreatedDate(new Date()).build(),
            Cloud.builder().withCloudName("Silicon Valley's Cloud").withCloudStatus("Online").withCloudCreatedDate(new Date()).build(),
            Cloud.builder().withCloudName("Warp Zone's Cloud").withCloudStatus("Offline").withCloudCreatedDate(new Date()).build(),
            Cloud.builder().withCloudName("Happy People's Cloud").withCloudStatus("Forming").withCloudCreatedDate(new Date()).build(),
            Cloud.builder().withCloudName("Freedom Square's Cloud").withCloudStatus("Dormant").withCloudCreatedDate(new Date()).build(),
            Cloud.builder().withCloudName("Assassins's Cloud").withCloudStatus("Abandoned").withCloudCreatedDate(new Date()).build()
        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_clouds);

        CloudListAdapter cloudAdapter = new CloudListAdapter(DisplayClouds.this, 0, getCloudsFromTheCloud());
        ListView listView = (ListView) findViewById(R.id.cloudsListView);
        listView.setAdapter(cloudAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = String.format("Jump In cloud : %s ? ..", getCloudsFromTheCloud()[i].getCloudName());
                Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_SHORT).show();
                //TODO : needs to launch a balloon display here
                Intent intent = new Intent(getApplicationContext(), DisplayBalloons.class);
                intent.putExtra(CLOUD_SELECTED, getCloudsFromTheCloud()[i].getId());
                startActivity(intent);
            }
        });
    }

    public Cloud[] getCloudsFromTheCloud(){
        //TODO cloud call to fetch the clouds list
        return clouds;
    }
}
