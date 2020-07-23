package com.bk.instagramui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvProfile;
    private RecyclerView rvContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProfile = findViewById(R.id.rv_pro);
        rvContent = findViewById(R.id.rv_con);

        ProfileAdapter adapter = new ProfileAdapter();
        adapter.pAddItem(new Profile("user1", R.drawable.propic1));
        adapter.pAddItem(new Profile("user2", R.drawable.propic2));
        adapter.pAddItem(new Profile("user3", R.drawable.propic3));
        adapter.pAddItem(new Profile("user4", R.drawable.propic3));
        adapter.pAddItem(new Profile("user5", R.drawable.propic3));
        adapter.pAddItem(new Profile("user6", R.drawable.propic3));
        adapter.pAddItem(new Profile("user7", R.drawable.propic3));

        rvProfile.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false));
        rvProfile.setAdapter(adapter);

        ContentAdapter CAdapter = new ContentAdapter();
        CAdapter.CAddItem(new Content(R.drawable.postpic1));
        CAdapter.CAddItem(new Content(R.drawable.postpic2));
        CAdapter.CAddItem(new Content(R.drawable.postpic3));
        CAdapter.CAddItem(new Content(R.drawable.postpic4));
        CAdapter.CAddItem(new Content(R.drawable.postpic5));
        CAdapter.CAddItem(new Content(R.drawable.postpic2));

        rvContent.setLayoutManager(new LinearLayoutManager(this));
        rvContent.setAdapter(CAdapter);
    }
}