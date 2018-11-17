package com.example.estrella.mrjuerga;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.estrella.mrjuerga.activities.Tienda;
import com.example.estrella.mrjuerga.generals.Settings;


public class MainActivity extends AppCompatActivity {

    Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciar = (Button) findViewById(R.id.btnIniciar);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(MainActivity.this,Tienda.class);
                startActivity(I);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Settings.DEBUG, "La aplicacion entró en start");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(Settings.DEBUG, "La aplicacion entró en resume");
        // put your code here...

    }
    @Override
    protected void onStop() {
        // call the superclass method first
        super.onStop();
        Log.d(Settings.DEBUG, "La aplicacion entró en stop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v(Settings.DEBUG, "La aplicacion entró en pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Settings.DEBUG, "La aplicacion entró en destroy");
    }
}
