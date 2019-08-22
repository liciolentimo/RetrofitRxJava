package com.example.retrofitrxjava.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitrxjava.Model.Posts;
import com.example.retrofitrxjava.R;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostViewHolder> {
    Context context;
    List<Posts> postsList;

    public PostsAdapter(Context context, List<Posts> postsList) {
        this.context = context;
        this.postsList = postsList;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_layout,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.txtAuthor.setText(String.valueOf(postsList.get(position).userId));
        holder.txtTitle.setText(String.valueOf(postsList.get(position).title));
        holder.txtContent.setText(new StringBuilder(postsList.get(position).body.substring(0,20))
        .append("...").toString());

    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }
}
