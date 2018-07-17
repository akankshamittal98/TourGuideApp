package com.example.hp_user.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class csAdapter extends BaseAdapter {
    int rLayout;
    Context c;
    ArrayList<csTravel> ldata;

    public csAdapter(int rLayout, Context c, ArrayList<csTravel> ldata) {
        this.rLayout = rLayout;
        this.c = c;
        this.ldata = ldata;
    }

    @Override
    public int getCount() {
        return ldata.size();
    }

    @Override
    public Object getItem(int i) {
        return ldata.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View ConvertView, ViewGroup viewGroup) {
        ConvertView = LayoutInflater.from(c).inflate(rLayout,null);
        TextView t1=(TextView)ConvertView.findViewById(R.id.t1);
        TextView t2=(TextView)ConvertView.findViewById(R.id.t2);
        TextView t3=(TextView)ConvertView.findViewById(R.id.t3);
        t1.setText(ldata.get(position).getName()+"");
        t2.setText(ldata.get(position).getLocation()+"");
        t3.setText(ldata.get(position).getDetails()+"");
        return ConvertView;
    }
}
