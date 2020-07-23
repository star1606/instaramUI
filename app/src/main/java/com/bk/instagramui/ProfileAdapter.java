package com.bk.instagramui;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.MyViewHolder>{

    private static final String TAG = "ProfileAdapter";

    private List<Profile> pItems = new ArrayList<>();

    public void pAddItem(Profile profile){pItems.add(profile);}


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: 실행" + pItems.size());
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_profile1, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Profile profile = pItems.get(position);
        holder.setItem(profile);
    }

    @Override
    public int getItemCount() { return pItems.size(); }



    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private CircleImageView imgPro;
        private TextView tvPro;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPro = itemView.findViewById(R.id.img_profile1);
            tvPro = itemView.findViewById(R.id.tv_profile1);
        }

        public void setItem(Profile profile){
            Log.d(TAG, "setItem: "+profile.getImgResource());
            tvPro.setText(profile.getUsername());
            imgPro.setImageResource(profile.getImgResource());
        }
    }
}
