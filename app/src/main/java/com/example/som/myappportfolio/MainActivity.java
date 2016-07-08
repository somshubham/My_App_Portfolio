package com.example.som.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button b1 = (Button) findViewById(R.id.popular_movies_button);
        b1.setOnClickListener(this);
        Button b2 = (Button) findViewById(R.id.stock_hawk_button);
        b2.setOnClickListener(this);
        Button b3 = (Button) findViewById(R.id.build_it_bigger_button);
        b3.setOnClickListener(this);
        Button b4 = (Button) findViewById(R.id.make_your_app_material_button);
        b4.setOnClickListener(this);
        Button b5 = (Button) findViewById(R.id.go_ubiquitous_button);
        b5.setOnClickListener(this);
        Button b6 = (Button) findViewById(R.id.capstone_button);
        b6.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {



        switch(v.getId()) {
            case R.id.popular_movies_button:
                Toast.makeText(MainActivity.this, "This button will launch popular movies app! ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.stock_hawk_button:
                Toast.makeText(MainActivity.this, "This button will launch stock hawk app! ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.build_it_bigger_button:
                Toast.makeText(MainActivity.this, "This button will launch build it bigger app! ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.make_your_app_material_button:
                Toast.makeText(MainActivity.this, "This button will launch make your app material app! ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.go_ubiquitous_button:
                Toast.makeText(MainActivity.this, "This button will launch go ubiquitous app! ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone_button:
                Toast.makeText(MainActivity.this, "This button will launch capstone app! ", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
