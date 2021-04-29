package com.example.h071191019;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    private ArrayList<Movie> listMovie;

    public  ListAdapter(ArrayList<Movie> list){
        this.listMovie = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.design, parent, false);
        return  new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Movie Movie = listMovie.get(position);
        Glide.with(holder.itemView.getContext()).load(Movie.getPhoto()).apply(new RequestOptions().override(55, 55));
        holder.tvName.setText(Movie.getName());
        holder.tvDetail.setText(Movie.getDetail());
        holder.tvGenre.setText(Movie.getGenre());
        holder.imgPhoto.setImageResource(Movie.getPhoto());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                onItemClickCallback.onItemClicked(listMovie.get(holder.getAdapterPosition()));
                Intent intent = new Intent(holder.itemView.getContext(), MovieDetail.class);
                intent.putExtra("photo", Movie.getPhoto());
                intent.putExtra("name", Movie.getName());
                intent.putExtra("genre", Movie.getGenre());
                intent.putExtra("detail", Movie.getDetail());

                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvGenre;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.photo);
            tvName = itemView.findViewById(R.id.tvJudul);
            tvGenre = itemView.findViewById(R.id.tvGenre);
            tvDetail = itemView.findViewById(R.id.tvDescription);
        }
    }



    private OnItemClickCallback onItemClickCallback;


    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Movie data);
    }
}

