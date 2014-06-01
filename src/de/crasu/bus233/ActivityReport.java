package de.crasu.bus233;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityReport extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report);
    }

    public void clickReport(View view) {
        Log.i("ActivityReport", "clicked");
        startActivity(new Intent(this, ActivityMail.class));
    }


    public void clickAbort(View view) {
        Log.i("ActivityDash", "Abort");
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
    }
}