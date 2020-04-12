package com.example.afliesapp_basic_homescreen;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    TextView home_title;
    TextView app_title;
    TextView today;
    TextView tomorrow;
    TextView overmorrow;

    ListView today_list;
    ListView tomorrow_list;
    ListView overmorrow_list;

    Button goToCalen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.home_toolbar);
        setSupportActionBar(toolbar);

        home_title = (TextView) findViewById(R.id.home_title);
        app_title = (TextView) findViewById(R.id.app_title);
        today = (TextView) findViewById(R.id.today);
        tomorrow  = (TextView) findViewById(R.id.tomorrow);
        overmorrow = (TextView) findViewById(R.id.overmorrow);

        today_list = (ListView) findViewById(R.id.today_list);
        tomorrow_list = (ListView) findViewById(R.id.tomorrow_list);
        overmorrow_list = (ListView) findViewById(R.id.overmorrow_list);

        goToCalen  = (Button) findViewById(R.id.goToCalen);

        today_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, SwitchTest.class);
                startActivity(intent);
            }
        });

        tomorrow_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, SwitchTest.class);
                startActivity(intent);
            }
        });

        overmorrow_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, SwitchTest.class);
                startActivity(intent);
            }
        });


        goToCalen.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, SwitchTest.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
