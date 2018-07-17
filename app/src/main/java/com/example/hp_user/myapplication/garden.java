package com.example.hp_user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class garden extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garden);
        ListView l=(ListView)findViewById(R.id.list);
        csTravel o=new csTravel();
        o.setName("RockGarden");
        o.setDetails("Nice place");
        o.setLocation("Chandigarh sector 44");
        ArrayList<csTravel> data=new ArrayList<>();
        data.add(o);
        csAdapter a=new csAdapter(R.layout.rowlayout,this,data);
        l.setAdapter(a);
    }
}
