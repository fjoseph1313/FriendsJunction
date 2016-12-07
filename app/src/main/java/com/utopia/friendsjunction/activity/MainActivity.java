package com.utopia.friendsjunction.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.utopia.friendsjunction.R;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_USERNAME = "USERNAME";
    private List<String> appUsers = Arrays.asList("user:user", "admin:admin", "username:password");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView signUpView = (TextView) findViewById(R.id.signupView);
        signUpView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    public void performLogin(View view) {

        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        String uname = username.getText().toString();
        String pwd = password.getText().toString();
        String credential = String.format("%s:%s", uname, pwd);
        // TODO Cloud authentication should be called here.
        if(checkCredentials(credential)){
            Intent intent = new Intent(this, DisplayClouds.class);
            //intent.putExtra(EXTRA_USERNAME, uname);
            startActivity(intent);
        }else{
            //TODO Redirect back to login page with Access Denied message.
        }
    }

    public Boolean checkCredentials(String credential){
        Iterator<String> iter = appUsers.iterator();
        while(iter.hasNext()){
            String cred = iter.next();
            if(cred.equalsIgnoreCase(credential)){
                return true;
            }
        }
        return false;
    }
}
