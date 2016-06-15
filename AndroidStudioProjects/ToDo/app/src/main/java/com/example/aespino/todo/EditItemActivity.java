package com.example.aespino.todo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    EditText etEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        String itemText = getIntent().getStringExtra("itemText");
        etEditText = (EditText) findViewById(R.id.etEditText);
        etEditText.setText(itemText);
    }
}
