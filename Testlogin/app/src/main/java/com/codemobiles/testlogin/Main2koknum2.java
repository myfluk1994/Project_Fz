package com.codemobiles.testlogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2koknum2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2koknum2);
        Button bbw = (Button) findViewById(R.id.button);
        bbw.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SeeDate.class);
                startActivityForResult(intent, 0);

                Button goo = (Button) findViewById(R.id.button6);
                goo.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        Intent intent = new Intent(v.getContext(), SeeDate.class);
                        startActivityForResult(intent, 0);


                        Button gk = (Button) findViewById(R.id.button7);
                        gk.setOnClickListener(new View.OnClickListener() {

                            public void onClick(View v) {
                                Intent intent = new Intent(v.getContext(), SeeDate.class);
                                startActivityForResult(intent, 0);


                                Button gee = (Button) findViewById(R.id.button8);
                                gee.setOnClickListener(new View.OnClickListener() {

                                    public void onClick(View v) {
                                        Intent intent = new Intent(v.getContext(), SeeDate.class);
                                        startActivityForResult(intent, 0);

                                    }

                                });

                            }

                        });

                    }

                });
            }


        });
    }
}
