package de.crasu.bus233;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityFinish extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish);
        TextView finishTextView = (TextView) findViewById(R.id.finishTextView);

        Intent intent = getIntent();
        String value = intent.getStringExtra("finishText");

        finishTextView.setText(value);
    }
}