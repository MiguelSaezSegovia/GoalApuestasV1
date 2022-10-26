package com.example1.goalapuestasv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
private Context context;
private int layout;
private ArrayList<String> names;
public MyAdapter(Context context, int layout, ArrayList<String>names){

    this.context=context;
    this.layout=layout;
    this.names=names;
}
    @Override
    public int getCount() {
        return this.names.size();
    }

    @Override
    public Object getItem(int postion) {
        return this.names.get(postion);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int postion, View convertview, ViewGroup viewGroup) {
       View v = convertview;
       LayoutInflater layoutInflater= LayoutInflater.from(this.context);
       v=layoutInflater.inflate(R.layout.list_item,null);
       String currentName=names.get(postion);
       TextView textView=(TextView) v.findViewById(R.id.textView);
       textView.setText(currentName);

        return v;
    }
}
