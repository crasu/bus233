package de.crasu.bus233;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class ActivityMail extends Activity {
    EditText editText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mail);

        editText = (EditText) findViewById(R.id.editText);
    }

    public void clickAbort(View view) {
        Log.i("ActivityDash", "Abort");
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
    }

    public void clickSend(View view) {
        Log.i("ActivityDash", "Abort");

        (new HttpTask()).execute(editText.getText().toString());

        Intent intent = new Intent(this, ActivityFinish.class);
        intent.putExtra("finishText", "Registierungs-Mail wurde verschickt.");
        startActivity(intent);
    }
}