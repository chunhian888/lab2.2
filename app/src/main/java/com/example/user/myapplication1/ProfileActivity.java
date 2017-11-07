package com.example.user.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.BreakIterator;

public class ProfileActivity extends AppCompatActivity {
    private EditText editTextName,editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        editTextEmail = (EditText)findViewById(R.id.editTextEmail);
        editTextName = (EditText)findViewById(R.id.editTextName);
    }

    public void saveProfile(View view){
        Intent intent = getIntent();

        String name,email;
        name = editTextName.getText().toString();
        email = editTextEmail.getText().toString();
        intent.putExtra(MainActivity.PROFILE_NAME,name);
        intent.putExtra(MainActivity.PROFILE_EMAIL,email);

        setResult(RESULT_OK,intent);
        finish();
    }

}
