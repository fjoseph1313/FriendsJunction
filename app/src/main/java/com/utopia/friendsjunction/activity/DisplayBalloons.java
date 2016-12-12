package com.utopia.friendsjunction.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.utopia.friendsjunction.R;
import com.utopia.friendsjunction.adapter.BalloonListAdapter;
import com.utopia.friendsjunction.model.Balloon;

import java.util.Arrays;
import java.util.List;

public class DisplayBalloons extends AppCompatActivity {

    public static final String BALLOON_SELECTED = "BALLOON_ID";
    private List<Balloon> balloons = Arrays.asList(
            Balloon.builder().withBalloonName("Happy People Balloon").withBalloonStatus("Hovering...").build(),
            Balloon.builder().withBalloonName("Freedom Balloon").withBalloonStatus("Sinking...").build(),
            Balloon.builder().withBalloonName("Obama Balloon").withBalloonStatus("Flying...").build(),
            Balloon.builder().withBalloonName("Time Traveler's Balloon").withBalloonStatus("Hovering...").build()
            );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_balloons);

        //unleash adapter and implement onListItemClickListener
        Intent intent = getIntent();
        Long cloud_id = intent.getLongExtra(DisplayClouds.CLOUD_SELECTED, 1L);
        BalloonListAdapter balAdapter = new BalloonListAdapter(getApplicationContext(), 0, getBalloonsFromTheCloud(cloud_id));
        ListView listView = (ListView) findViewById(R.id.balloonsListView);
        listView.setAdapter(balAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Balloon balloon = balloons.get(i);
                String selectedItem = balloon.getBalloonName();
                Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_SHORT).show();
                //TODO : Launch arrows shooting ui
                Long balloon_id = balloon.getId();
                Intent intent = new Intent(getApplicationContext(), DisplayArrows.class);
                intent.putExtra(BALLOON_SELECTED, balloon_id);
                startActivity(intent);
            }
        });
    }

    public List<Balloon> getBalloonsFromTheCloud(Long cloud_id){
        //TODO : Delegate the call to the cloud
        this.setBalloons(balloons);
        return balloons;
    }

    public List<Balloon> getBalloons(){
        return balloons;
    }

    public void setBalloons(List<Balloon> balloons){
        this.balloons = balloons;
    }
}
