package com.example.h071191019;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHeroes;
    private ArrayList<Movie> list = new ArrayList<Movie>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvHeroes = findViewById(R.id.rvHeroes);
        rvHeroes.setHasFixedSize(true);

        list.addAll(MoviesData.getListData());
        showRecycleList();

    }

    private void showRecycleList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listAdapter = new ListAdapter(list);
        rvHeroes.setAdapter(listAdapter);

        listAdapter.setOnItemClickCallback(new ListAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Movie data) {
                showSelectedHero(data);
            }
        });
    }
    private void showSelectedHero(Movie movie) {
        Toast.makeText(this, "Kamu memilih " + movie.getName(), Toast.LENGTH_SHORT).show();
    }

}