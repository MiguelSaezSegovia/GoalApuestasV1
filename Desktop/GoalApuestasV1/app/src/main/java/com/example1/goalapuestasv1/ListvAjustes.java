package com.example1.goalapuestasv1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class ListvAjustes extends AppCompatActivity {
    ListView lv;
    ArrayList<String> names;
    ClassAjustes mainAjustes;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);

    }
    public void mostarlv(){
        lv = (ListView) findViewById(R.id.lvAj);
        names= new ArrayList<String>();
        names.add(mainAjustes.idioma);
        names.add(mainAjustes.preguntasF);
        names.add(mainAjustes.Ayuda);

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,names);
        lv.setAdapter(adapter);
        ItemAdapter myAdapter= new ItemAdapter(this,R.layout.list_item,names);
        lv.setAdapter(myAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long  id) {
                Toast.makeText(ListvAjustes.this,"has pulsado: "+names.get(position),Toast.LENGTH_LONG).show();

            }

        });

    }

}
