package de.crasu.bus233;

import android.os.AsyncTask;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HttpTask  extends AsyncTask<String, Boolean, String> {
    public void postData(String emailAddress) throws JSONException {
        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost("http://bus-233.appspot.com/signup");
        try {
            JSONObject email = new JSONObject().put("email", emailAddress);
            httppost.setEntity(new StringEntity(email.toString()));
            HttpResponse response = httpclient.execute(httppost);
        } catch (ClientProtocolException e) {
        } catch (IOException e) {
        }
    }

    @Override
    protected String doInBackground(String... params) {
        try {
            postData(params[0]);
        } catch (JSONException e) {
        }
        return null;
    }
}
