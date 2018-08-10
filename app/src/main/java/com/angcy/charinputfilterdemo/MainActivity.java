package com.angcy.charinputfilterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText2 = findViewById(R.id.edit_text2);
        EditText editText3 = findViewById(R.id.edit_text3);

        InputFilter[] filters = new InputFilter[1];
        CharInputFilter inputFilter = new CharInputFilter();
        filters[0] = inputFilter;

        inputFilter.setFilterModel(CharInputFilter.MODEL_CHAR_LETTER | CharInputFilter.MODEL_CHINESE);
        inputFilter.setMaxInputLength(5);
        editText2.setFilters(filters);

        //
        filters = new InputFilter[1];
        inputFilter = new CharInputFilter();
        filters[0] = inputFilter;

        inputFilter.setFilterModel(CharInputFilter.MODEL_ASCII_CHAR);
        inputFilter.setMaxInputLength(100);
        editText3.setFilters(filters);
    }
}
