package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

//        EditText url = (EditText) findViewById(R.id.edit_message);
//        String message = url.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, new RemoteSalesGateway().executeHttpCall("http://androidexample.com/media/webservice/JsonReturn.php"));

        startActivity(intent);
    }
}
