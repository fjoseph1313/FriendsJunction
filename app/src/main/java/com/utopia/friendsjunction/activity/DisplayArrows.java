package com.utopia.friendsjunction.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.utopia.friendsjunction.R;
import com.utopia.friendsjunction.adapter.ArrowListAdapter;
import com.utopia.friendsjunction.model.Arrow;
import com.utopia.friendsjunction.model.Balloon;
import com.utopia.friendsjunction.model.Jumper;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DisplayArrows extends AppCompatActivity {

    private List<Arrow> arrows = Arrays.asList(
            Arrow.builder().withJumper(Jumper.builder().withJumperName("fjoseph1313").build())
                    .withArrowText("This is the first arrow shooting..").withArrowDate(new Date()).build(),
            Arrow.builder().withJumper(Jumper.builder().withJumperName("mah_him").build())
                    .withArrowText("Talking of Shooting, its really an easy thing.. Just shot a balloon").withArrowDate(new Date()).build(),
            Arrow.builder().withJumper(Jumper.builder().withJumperName("tolusenior").build())
                    .withArrowText("I see, i'm watching..").withArrowDate(new Date()).build(),
            Arrow.builder().withJumper(Jumper.builder().withJumperName("fjoseph1313").build())
                    .withArrowText("Did you see mine too? @tolusenior").withArrowDate(new Date()).build(),
            Arrow.builder().withJumper(Jumper.builder().withJumperName("fjoseph1313").build())
                    .withArrowText("Dude @tolusenior, respond .. why are you not answering? Or perhaps the arrow didnt make it to the balloon?").withArrowDate(new Date()).build(),
            Arrow.builder().withJumper(Jumper.builder().withJumperName("AJ the Gr8").build())
                    .withArrowText("Chill out dude @fjoseph1313, We have seen the arrow and the balloon went voila ....").withArrowDate(new Date()).build()
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_arrows);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //TODO : Get the intent from balloon, and display arrows operations
        Intent intent = getIntent();
        Long balloon_id = intent.getLongExtra(DisplayBalloons.BALLOON_SELECTED, 1L);
        ArrowListAdapter arrowListAdapter = new ArrowListAdapter(getApplicationContext(), 0, getArrowsListFromTheCloud(balloon_id));
        ListView arrowsView = (ListView) findViewById(R.id.arrowsListView);
        arrowsView.setAdapter(arrowListAdapter);
    }


    public List<Arrow> getArrowsListFromTheCloud(Long balloon_id){
        //TODO : Delegate to the cloud to get arrows
        return arrows;
    }

    /**
     * Method to perform arrow shooting into a balloon
     * Required: a specific Balloon and an arrow.
     */
    public void shootArrow(View view){
        //TODO : Perform shooting an arrow
        EditText arrowTxt = (EditText) findViewById(R.id.arrowTxt);
        Toast.makeText(getApplicationContext(), arrowTxt.getText().toString(), Toast.LENGTH_SHORT).show();
        arrowTxt.clearFocus();
    }
}
