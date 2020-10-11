package com.example.app_1_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.Activity2;

public class MainActivity extends AppCompatActivity {

    //Int vars
    private EditText Name;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Name = (EditText) findViewById( R.id.UsrName );
        Password = (EditText) findViewById( R.id.Usrpass );
        Login = (Button) findViewById( R.id.button1 );
        String sentPSS = Password.getText().toString();
        String sentUSR = Name.getText().toString();

        Login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login(Name.getText().toString(),Password.getText().toString());
            }
        } );
    }
    private void Login (String UserName, String Password) {
        if ((UserName.equals( "Sean1" ) && (Password.equals( "1234" )))){
            Intent intent = new Intent(MainActivity.this, Activity2.class );
            intent.putExtra( "UN", UserName );
            intent.putExtra( "PS", Password );
            startActivity( intent );
        }

    }
}