package com.codemobiles.myfz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Confirmpress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmpress);
        Button goo = (Button) findViewById(R.id.button17);
        goo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), HomeActivity.class);
                startActivityForResult(intent, 0);

                Button poo = (Button) findViewById(R.id.button18);
                poo.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        Intent intent = new Intent(v.getContext(), HomeActivity.class);
                        startActivityForResult(intent, 0);

                    }

                });

            }

        });
    }
}
