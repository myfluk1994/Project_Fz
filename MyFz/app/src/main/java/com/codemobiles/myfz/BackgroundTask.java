package com.codemobiles.myfz;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by myflu on 21/6/2559.
 */
public class BackgroundTask extends AsyncTask<String,Void,String> {
    Context ctx;
    BackgroundTask(Context ctx)
    {
        this.ctx = ctx;
    }
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... params) {
        String reg_url = "http://192.168.1.43/fz/register.php";
        //String login_url = "http://10.0.2.2/webapp/login.php";
        String method = params[0];
        if(method.equals("RegisterFz"))
        {
            String name = params[1];
         String user_name = params[2];
            String User_pass = params[3];
            String user_email = params[4];
            String user_phone = params[5];
            try {
                URL url = new URL(reg_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream OS = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(OS,"UTF-8"));
          String data = URLEncoder.encode("name_u","UTF-8") +" = "+URLEncoder.encode(name, "UTF-8")+"&"+
                  URLEncoder.encode("username_u","UTF-8") +" = "+URLEncoder.encode(user_name, "UTF-8")+"&"+
                  URLEncoder.encode("password_u","UTF-8") +" = "+URLEncoder.encode(User_pass, "UTF-8")+"&"+
                  URLEncoder.encode("email_u","UTF-8") +" = "+URLEncoder.encode(user_email, "UTF-8")+"&"+
                  URLEncoder.encode("phone_u","UTF-8") +" = "+URLEncoder.encode(user_phone, "UTF-8");
                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                OS.close();
                InputStream IS = httpURLConnection.getInputStream();
                IS.close();
                return "Registration Success..."+data;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (ProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String result) {
        Toast.makeText(ctx,result,Toast.LENGTH_LONG).show();
    }

}

