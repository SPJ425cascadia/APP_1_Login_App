package com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.app_1_login.R;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView((R.layout.activity_2));

        TextView TV = (TextView) findViewById( R.id.textView1 );
        String usrName = getIntent().getStringExtra( "UN" );
        String pasWord = getIntent().getStringExtra( "PS" );

        if ((usrName.equals( usrName ) && (pasWord.equals( pasWord )))){
            TV.setText( "Welcome" + " " + usrName );
        }
        else TV.setText( usrName + "Is Not Correct" );

    }
}

