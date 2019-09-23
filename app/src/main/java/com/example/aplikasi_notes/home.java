package com.example.aplikasi_notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class home extends AppCompatActivity {
    private RecyclerView recyclerView;
    private itemAdapter adapter;
    private ArrayList<item> itemArrayList;
    private DatabaseReference database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        addData();
//        database.child("aplikasinotes").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//
//                itemArrayList = new ArrayList<>();
//
//                for (DataSnapshot noteDataSnapshot : dataSnapshot.getChildren()){
//                    item request = noteDataSnapshot.getValue(item.class);
//                    request.setTanggal(request.getTanggal());
//
//                    itemArrayList.add(request);
//                }
//
//            }
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//                System.out.println(databaseError.getDetails()+""+databaseError.getMessage());
//            }
//        });


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new itemAdapter(itemArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(home.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }
    public void tambah_data(View view){
        Intent i = new Intent(home.this,tambah_data.class);
        startActivity(i);
    }

    void addData(){



        itemArrayList = new ArrayList<>();
        itemArrayList.add(new item("Dimas Maulana", "1414370309", "123456789"));
        itemArrayList.add(new item("Fadly Yonk", "1214234560", "987654321"));
        itemArrayList.add(new item("Ariyandi Nugraha", "1214230345", "987648765"));
        itemArrayList.add(new item("Aham Siswana", "1214378098", "098758124"));
    }
}
