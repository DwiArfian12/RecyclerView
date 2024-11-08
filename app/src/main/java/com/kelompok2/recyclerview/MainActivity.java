package com.kelompok2.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Dwi Arfian","dwiarfian@gmail.com",R.drawable.a));
        items.add(new Item("Lasmana Adi N.","lasmanaadi@gmail.com",R.drawable.b));
        items.add(new Item("Geloria Marsela N.","geloriamar@gmail.com",R.drawable.c));
        items.add(new Item("Marfa Lutfi E.","marfalutfi@gmail.com",R.drawable.d));
        items.add(new Item("Barkah Hidayat A.","barkahhidayat@gmail.com",R.drawable.e));
        items.add(new Item("Alussia Sawangan S.","alussiass@gmail.com",R.drawable.f));
        items.add(new Item("Zakariya Harsoyo P. P.","zakariyahpp@gmail.com",R.drawable.g));
        items.add(new Item("Irfan Cahyo Wibowo","irfancahyo@gmail.com",R.drawable.h));
        items.add(new Item("Ramadani Herlambang","ramadani@gmail.com",R.drawable.a));
        items.add(new Item("Elsa Zahra setiawati","elsazahra@gmail.com",R.drawable.b));
        items.add(new Item("Daffa Naufal F.","daffanaufal@gmail.com",R.drawable.c));
        items.add(new Item("Aditya Eka S.","adityaeka@gmail.com",R.drawable.d));
        items.add(new Item("Salsabila Mithaful A.","salsabilamitha@gmail.com",R.drawable.e));
        items.add(new Item("Juliara Virna S.","juliaravirna@gmail.com",R.drawable.f));
        items.add(new Item("Ahmad Ridho","ahmadridho@gmail.com",R.drawable.g));
        items.add(new Item("Berliana Putri M.","berlianaputri@gmail.com",R.drawable.h));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}