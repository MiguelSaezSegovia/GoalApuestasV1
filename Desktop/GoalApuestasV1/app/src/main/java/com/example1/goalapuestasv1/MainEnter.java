package com.example1.goalapuestasv1;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;


import androidx.annotation.Nullable;


import java.util.HashMap;
import java.util.Map;

public class MainEnter extends PanPrinc{


    private EditText userName, password;
    private Button loginButton;
    private TextView signUpButton;
   // private ProgressBar progressBar;
    private int SIGNUP_TRY = 10;

    public void setActivityName() {
        mScreenName = AppData.LOGIN_SCREEN;
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.et_user_name);
        password = findViewById(R.id.et_password);
        loginButton = findViewById(R.id.button_login);
    //    progressBar = findViewById(R.id.progress_bar_login);
        signUpButton = findViewById(R.id.signup_text);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userName.getText().toString().length() == 0 || password.getText().toString().length() == 0) {
                    displayAlertDialog(getString(R.string.error), getString(R.string.complete_all_the_fields));
                } else  {
                    Map<String, String> params = new HashMap<String, String>();
                    params.put("user_name", userName.getText().toString());
                    params.put("password", AppData.encodePassword(password.getText().toString()));
if(userName.getText().toString().equals("user")&& password.getText().toString().equals("user")){
    Intent mainIntent = new Intent(getApplicationContext(),PanPrinc.class);
    startActivity(mainIntent);
}else{
    System.out.println(userName.getText().toString()+"    "+password.getText().toString());
    displayAlertDialog(getString(R.string.error), getString(R.string.user_incorrect));
}
                }

            }
        });



        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), MainRegister.class);
                startActivity(mainIntent);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == SIGNUP_TRY && resultCode == Activity.RESULT_OK)
        {
            userName.setText(prefs.getString(AppData.USER_NAME,""));
            password.setText(prefs.getString(AppData.PASSWORD,"" ));
        }
        else
        {
            userName.setText("");
            password.setText("");
        }
    }

}