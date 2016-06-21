package com.codemobiles.myfz;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class RegisterFz extends Activity {
    EditText ET_NAME,ET_USER_NAME,ET_USER_PASS,ET_USER_EMAIL,ET_USER_PHONE;
    String name,user_name,User_pass,user_email,user_phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_fz);
        ET_NAME = (EditText)findViewById(R.id.editText);
        ET_USER_NAME = (EditText)findViewById(R.id.editText2);
        ET_USER_PASS = (EditText)findViewById(R.id.editText3);
        ET_USER_EMAIL = (EditText)findViewById(R.id.editText5);
        ET_USER_PHONE = (EditText)findViewById(R.id.editText6);
    }
    public void  userReg(View view)
    {
        name = ET_NAME.getText().toString();
        user_name = ET_USER_NAME.getText().toString();
        User_pass = ET_USER_PASS.getText().toString();
        user_email = ET_USER_EMAIL.getText().toString();
        user_phone = ET_USER_PHONE.getText().toString();
        String method = "RegisterFz";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,name,user_name,User_pass,user_email,user_phone);
        finish();
    }
}


