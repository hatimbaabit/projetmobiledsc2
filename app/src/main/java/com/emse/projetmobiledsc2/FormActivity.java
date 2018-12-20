package com.emse.projetmobiledsc2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText edittext;
    private Button buttonvalidate;

    public static String NAME_KEY ="USERNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        initViews();
    }

    private void initViews(){
        edittext =  (EditText) findViewById(R.id.text_add);
        buttonvalidate = (Button) findViewById(R.id.button_add);

        buttonvalidate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_add :
                saveData();
                break;
        }

    }

//    private void saveData(){
//        Intent intent = new Intent();
//        intent.putExtra(NAME_KEY, edittext.getText().toString());
//        setResult(RESULT_OK,intent);
//        finish();
//    }
    private void saveData(){
       String name=edittext.getText().toString();
       if(!name.isEmpty()){
           DataManager.getInstance().addName(name);
       }
        finish();
    }
}
