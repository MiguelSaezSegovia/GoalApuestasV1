package com.example1.goalapuestasv1;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PanPrinc extends AppCompatActivity {
    protected String mScreenName;

    protected SharedPreferences prefs;

    private ListView listv;
    private ArrayList<String> names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);
        mostarlv();
    }

    public void mostarlv() {
        listv = (ListView) findViewById(R.id.lv);
        names = new ArrayList<String>();
        names.add("news");
        names.add("matches of the day");
        names.add("Settings");
        names.add("bets");
        names.add("live matches");
        names.add("rooms");
        names.add("classification");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        listv.setAdapter(adapter);
        MyAdapter myAdapter = new MyAdapter(this, R.layout.list_item, names);
        listv.setAdapter(myAdapter);
        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(PanPrinc.this, "you have pressed: " + names.get(position), Toast.LENGTH_LONG).show();

            }

        });
    }

    public void displayAlertDialog(String title, String message)
    {
        new AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }



    public void displayDynamicDialog(String title, String message, DialogInterface.OnClickListener listener)
    {
        new AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, listener)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
}
