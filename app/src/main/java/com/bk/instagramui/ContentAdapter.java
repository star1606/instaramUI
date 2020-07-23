package com.bk.instagramui;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.MyViewHolder>{
    private static final String TAG = "ContentAdapter";

    private List<Content> CItems = new ArrayList<>();

    public void CAddItem(Content content){
        CItems.add(content);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_content1, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Content content = CItems.get(position);
        holder.setItem(content);

    }

    @Override
    public int getItemCount() {
        return CItems.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
            private ImageView ivImgResource;
        public MyViewHolder(@NonNull View itemView){
            super(itemView);

            ivImgResource = itemView.findViewById(R.id.content_img);

        }

        public void setItem(Content content){
            ivImgResource.setImageResource(content.getImgResource());
        }
    }
}
