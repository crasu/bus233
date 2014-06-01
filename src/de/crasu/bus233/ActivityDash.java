package de.crasu.bus233;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import static android.content.Intent.CATEGORY_HOME;

public class ActivityDash extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dash);
    }

    public void clickNext(View view) {
        Log.i("ActivityDash", "clicked");
        startActivity(new Intent(this, ActivityReport.class));
    }
}
