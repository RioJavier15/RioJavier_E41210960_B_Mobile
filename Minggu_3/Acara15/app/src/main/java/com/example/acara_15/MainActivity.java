package com.example.acara_15;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private List<mahasiswa> mahasiswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mahasiswaList = addData();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        com.example.acara_15.adapter adapter = new adapter((ArrayList<mahasiswa>) mahasiswaList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }



    //recycleview
    private List<mahasiswa> addData() {
        List<mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;
        mahasiswaList.add(new mahasiswa("Rio Javier Reyhan", "E41210960", "089686673221"));;



        return mahasiswaList;
    }
}