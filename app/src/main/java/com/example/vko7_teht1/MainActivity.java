package com.example.vko7_teht1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView1);
        edit   = (EditText)findViewById(R.id.editText1);
    }

    public void saySomething(View v) {
        String s;
        s = edit.getText().toString();
        text.setText(s);
    }
}
