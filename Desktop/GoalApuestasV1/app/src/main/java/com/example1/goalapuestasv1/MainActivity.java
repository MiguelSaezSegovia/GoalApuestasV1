package com.example1.goalapuestasv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageView iv;
Intent t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        {

        }

    }
public void ajustes(View view){
    t2= new Intent(this,MainActivity.class);
    startActivity(t2);
}


}