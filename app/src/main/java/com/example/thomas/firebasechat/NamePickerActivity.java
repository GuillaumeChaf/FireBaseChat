package com.example.thomas.firebasechat;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class NamePickerActivity extends AppCompatActivity {

    public static final String TAG =
            NamePickerActivity.class.getSimpleName();

    Button     mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namepicker);
        Button mSubmitButton = (Button) findViewById(R.id.mSubmitButton);


    }
    EditText mNameEditText = (EditText) findViewById(R.id.mNameEditText);
    String editTextValueName = this.mNameEditText.getText().toString();

    EditText mEmailEditText = (EditText) findViewById(R.id.mEmailEditText);
    String editTextValueEmail = this.mEmailEditText.getText().toString();


    View.OnClickListener handler1 = new View.OnClickListener() {
        public void onClick(View v) {
            User user = UserStorage.getUser(v.getContext());
            if(user.getName() == "undefined" && user.getEmail() == "undefined") {
                UserStorage.saveUserInfo(v.getContext(), editTextValueName, editTextValueEmail);
            }
        }
    };
}



