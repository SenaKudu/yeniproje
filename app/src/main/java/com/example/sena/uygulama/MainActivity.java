package com.example.sena.uygulama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView List= (ListView) findViewById(R.id.List);
        ArrayList<urunClass> urunler =new ArrayList<>();
        urunler.add(new urunClass("kafeinsiz kahve",1,""));
        urunler.add(new urunClass("kafeinli kahve",1,"")) ;
        urunler.add(new urunClass("americano kahve",1,""));
        customAdapter yorumAdapter = new customAdapter(this,urunClass);
        List.setAdapter(yorumAdapter);
    }
}
