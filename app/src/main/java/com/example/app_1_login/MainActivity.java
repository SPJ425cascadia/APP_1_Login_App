package com.example.app_1_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private final String[] Languages = {"Seattle", "Bothell", "Kirkland", "Bellevue",
            "Lynnwood", "Renton", "Redmond", "Spokane", "Vancouver",
            "Tacoma", "Olympia", "Bellingham", "Arlington", "Everett",
            "Woodinville", "Monroe", "New Castle", "Ballard", "Lacey", "duval"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        ArrayAdapter<String> adapter = new ArrayAdapter<>( this,R.layout.listview_layout,R.id.language, Languages);
        ListView lv = findViewById( R.id.language_list );
        lv.setAdapter( adapter );
    }
}