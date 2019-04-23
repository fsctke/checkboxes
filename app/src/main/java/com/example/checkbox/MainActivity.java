package com.example.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox mycheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mycheckBox = (CheckBox) findViewById(R.id.checkBox);
        mycheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    Toast.makeText(MainActivity.this, "box is checked", Toast.LENGTH_SHORT).show();

                } else if (isChecked == false) {
                    Toast.makeText(MainActivity.this, "box is not checked", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
