package com.example.adrian.tarae1layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton botonDragonair ;
    ImageButton botonMagmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonDragonair =(ImageButton)findViewById(R.id.imagenDragonair);
        botonMagmar = (ImageButton)findViewById(R.id.imagenMagmar);

        botonDragonair.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0){
                Intent intent  = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
            }
        });


        botonMagmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(intent);
            }
        });



    }
}
