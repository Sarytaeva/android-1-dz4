package com.example.android_1_dz4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Model> arrayList;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<>();
        arrayList.add(new Model(R.drawable.ic_eurasia, "Eurasia", " ",1 ));
        arrayList.add(new Model(R.drawable.ic_africa, "Africa", " ",3 ));
        arrayList.add(new Model(R.drawable.ic_north_amerika, "North America", " ",2 ));
        arrayList.add(new Model(R.drawable.ic_south_america, "South America", " ",4 ));
        arrayList.add(new Model(R.drawable.ic_antarkdida, "Antarctica", " ",6 ));
        arrayList.add(new Model(R.drawable.ic_australia, "Australia", " ",5 ));

        RecyclerView recyclerView = findViewById(R.id.www);
        adapter = new Adapter();
        adapter.listSize(arrayList);
        recyclerView.setAdapter(adapter);

        adapter.setOnClick(new OnClick() {
            @Override
            public void onClick(Model model) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("country", model.getId());
                startActivity(intent);
            }
        });

    }
}