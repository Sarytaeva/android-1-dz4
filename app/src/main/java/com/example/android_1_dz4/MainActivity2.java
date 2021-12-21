package com.example.android_1_dz4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private  Adapter adapter;
    private ArrayList<Model> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int id = getIntent().getIntExtra("country", 1);
        if (id == 1) {
            arrayList.add(new Model(R.drawable.ic_kg, "Kyrgyzstan", "Bishkek"));
            arrayList.add(new Model(R.drawable.ic_ru, "Russia", "Moscow"));
            arrayList.add(new Model(R.drawable.ic_italy, "Italia", "Roma"));
            arrayList.add(new Model(R.drawable.ic_kr, " Republic of Korea", "Seul"));
            arrayList.add(new Model(R.drawable.ic_ru, "France", "Paris"));
        }else if (id == 2){
            arrayList.add(new Model(R.drawable.ic_canada, "Canada", "Ottawa"));
            arrayList.add(new Model(R.drawable.ic_cu, "Cuba", "Havana"));
            arrayList.add(new Model(R.drawable.ic_mx, "Mexica", "Mexihco"));
            arrayList.add(new Model(R.drawable.ic_pa, "Panama", "Panama"));
            arrayList.add(new Model(R.drawable.ic_usa, "USA", "Washington"));
        }else if (id == 3){
            arrayList.add(new Model(R.drawable.ic_ao, "Angola", "Luanda"));
            arrayList.add(new Model(R.drawable.ic_gh, "Ghana", "Acra"));
            arrayList.add(new Model(R.drawable.ic_ke, "Kenya", "Nairobi"));
            arrayList.add(new Model(R.drawable.ic_ly, "Libia", "Tripoli"));
            arrayList.add(new Model(R.drawable.ic_bj, "Benin", "Porto-Nova"));

        }
        else if (id == 4) {
            arrayList.add(new Model(R.drawable.ic_brasil, "Brasil", "Brasilia"));
            arrayList.add(new Model(R.drawable.ic_arg,  "Argentina", "Buenos Aires"));
            arrayList.add(new Model(R.drawable.ic_peru, "Peru", "Lima"));
            arrayList.add(new Model(R.drawable.ic_chili, "Chile", "Santiago"));
            arrayList.add(new Model(R.drawable.ic_urugue, "Uruguay", "Montevideo"));
        }else if (id == 5) {
            arrayList.add(new Model(R.drawable.ic_aust, "Australia", "Kanberra"));
            arrayList.add(new Model(R.drawable.ic_to, "Tonga", "Nukualofa"));
            arrayList.add(new Model(R.drawable.ic_nz, "New Zealand", "Wellington"));
            arrayList.add(new Model(R.drawable.ic_pw, "Palau", "Ngerulmud"));
            arrayList.add(new Model(R.drawable.ic_ws, "Samoa", "Apia"));
        }else if (id == 6) {
            arrayList.add(new Model(R.drawable.ic_cu, "00", "....."));
            arrayList.add(new Model(R.drawable.ic_cu, "00", "....."));
            arrayList.add(new Model(R.drawable.ic_cu, "00", "....."));
            arrayList.add(new Model(R.drawable.ic_cu, "00", "....."));
            arrayList.add(new Model(R.drawable.ic_cu, "00", "....."));

        }


            RecyclerView recyclerView = findViewById(R.id.www1);
        adapter = new Adapter();
        adapter.setList(arrayList);
        recyclerView.setAdapter(adapter);
    }
}