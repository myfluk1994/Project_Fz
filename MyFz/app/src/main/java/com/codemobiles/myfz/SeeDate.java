package com.codemobiles.myfz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeeDate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_date);

     /*   Button gp = (Button) findViewById(R.id.button2);
        gp.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Phonenumber.class);
                startActivityForResult(intent, 0);

            }

        });*/
    }

    public void next(View view) {
        Intent intent = new Intent(getApplicationContext(), Mapsmeet.class);
        startActivity(intent);
    }
}
