package com.utopia.friendsjunction.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.utopia.friendsjunction.R;
import com.utopia.friendsjunction.model.Jumper;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void performSignUp(View view) {
        EditText username = (EditText) findViewById(R.id.usernameTxt);
        EditText password = (EditText) findViewById(R.id.pwdTxt);
        EditText fullname = (EditText) findViewById(R.id.fullnameTxt);
        EditText emailOrMobile = (EditText) findViewById(R.id.emailTxt);

        if((username != null) || (password != null) || (fullname != null) || (emailOrMobile != null)){
            String[] names = fullname.getText().toString().split("", 2);
            Jumper jumper = Jumper.builder()
                    .withJumperName(username.getText().toString())
                    .withFirstName(names[0])
                    .withLastName(names[1])
                    .build();
            if(cloudSigUp(jumper)){
                Intent intent = new Intent(this, DisplayClouds.class);
                startActivity(intent);
            }
        } else {
            //TODO return to signup ui
        }
    }

    public Boolean cloudSigUp(Jumper jumper){
        // TODO : Perform cloud signup operation.
        return true;
    }
}
