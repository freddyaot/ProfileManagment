package com.engim.alfonso.myapplication.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.engim.alfonso.myapplication.R;

/**
 * Created by Alfonso-LAPTOP on 22/03/2018.
 */

public class EditProfileActivity extends AppCompatActivity {


    private EditText nameEdit;
    private EditText emailEdit;
    private EditText bioEdit;
    private EditText telEdit;
    private Button photoButton;

    private String name;
    private String bio;
    private String tel;
    private String email;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.edit_activity);

        nameEdit = findViewById(R.id.nameEdit);
        telEdit = findViewById(R.id.teldEdit);
        bioEdit = findViewById(R.id.bioEdit);
        emailEdit = findViewById(R.id.emailEdit);
        photoButton = findViewById(R.id.buttonPhoto);

        if(savedInstanceState != null){
            name = savedInstanceState.getString("name");
            email = savedInstanceState.getString("email");
            bio = savedInstanceState.getString("bio");
            tel = savedInstanceState.getString("tel");
            nameEdit.setText(name);
            emailEdit.setText(email);
            telEdit.setText(tel);
            bioEdit.setText(bio);
        }

        setListeners();

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("name",name);
        outState.putString("email", email);
        outState.putString("bio", bio);
        outState.putString("tel", tel);
    }

    private void setListeners(){


        nameEdit.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                name = editable.toString();
            }
        });


        emailEdit.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {

            email = editable.toString();

        }
    });

        telEdit.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            tel = editable.toString();
        }
    });

        bioEdit.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            bio = editable.toString();
        }
    });

        photoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snapPhoto();
            }
        });
    }


    private void snapPhoto(){

    }
}
