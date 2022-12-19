package com.example.ltproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
public class MainActivity extends AppCompatActivity {

    Button mButton;
    EditText mEdit,medit2;
    TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button)findViewById(R.id.button1);

        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mEdit   = (EditText)findViewById(R.id.editText1);
                medit2   = (EditText)findViewById(R.id.editText2);
                mText = (TextView)findViewById(R.id.textView1);
                mText.setText(mEdit.getText().toString()+medit2.getText().toString());
            }
        });
    }
}
