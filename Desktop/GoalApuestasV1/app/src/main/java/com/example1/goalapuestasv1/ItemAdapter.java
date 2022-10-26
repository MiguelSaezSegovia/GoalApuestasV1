package com.example1.goalapuestasv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<String> names;

    public ItemAdapter(Context context,int layout, ArrayList<String>names){

        this.context=context;
        this.layout=layout;
        this.names=names;
    }
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        LayoutInflater layoutInflater= LayoutInflater.from(this.context);
        vi=layoutInflater.inflate(R.layout.activity_ajustes,null);
        String currentName=names.get(position);

        return vi;
    }
}
