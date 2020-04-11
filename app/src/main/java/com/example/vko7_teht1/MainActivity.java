package com.example.vko7_teht1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.printHello();
        text = (TextView) findViewById(R.id.textView);
        text.setText("Hello World!");
    }

    public void printHello(View v) {
        System.out.println("Hello world!");
    }
}
