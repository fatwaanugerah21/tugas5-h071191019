package com.example.h071191019;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private RecyclerView rvHeroes;
    private ArrayList<Movie> list = new ArrayList<>();

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);
        rvHeroes = view.findViewById(R.id.rvHeroes);
        rvHeroes.setHasFixedSize(true);

        list.addAll(MoviesData.getListData());
        showRecycleList();
        return view;
    }


    private void showRecycleList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListAdapter listAdapter = new ListAdapter(list);
        rvHeroes.setAdapter(listAdapter);

        listAdapter.setOnItemClickCallback(new ListAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Movie data) {
                Intent intent = new Intent(getActivity(), MovieDetail.class);
//                intent.putExtra("movie_data", data);
//                intent.putExtra("name", data.getName());
//                intent.putExtra("genre", data.getGenre());
//                intent.putExtra("detail", data.getDetail());
//                intent.putExtra("photo", data.getPhoto());
                startActivity(intent);
            }
        });
    }




}
