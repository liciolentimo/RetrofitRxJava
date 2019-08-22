package com.example.retrofitrxjava.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitrxjava.R;

public class PostViewHolder extends RecyclerView.ViewHolder {
    TextView txtTitle,txtContent,txtAuthor;

    public PostViewHolder(@NonNull View itemView) {
        super(itemView);

        txtTitle = itemView.findViewById(R.id.txtTitle);
        txtContent = itemView.findViewById(R.id.txtContent);
        txtAuthor = itemView.findViewById(R.id.txtAuthor);
    }
}
