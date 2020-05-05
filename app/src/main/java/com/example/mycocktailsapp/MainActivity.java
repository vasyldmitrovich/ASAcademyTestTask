package com.example.mycocktailsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    EditText editText;
    ImageView imageViewSearch;
    String inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewSearch = (ImageView) findViewById(R.id.imageViewSearch);
        imageViewSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageViewSearch:
                Intent intent = new Intent(this,SearchActivity.class);
                editText = (EditText) findViewById(R.id.editTextInput);
                inputText = editText.getText().toString().toLowerCase();

                intent.putExtra("s",inputText);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}