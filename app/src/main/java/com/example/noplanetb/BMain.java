package com.example.noplanetb;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Toast;

public class BMain extends AppCompatActivity {
    private SwipeRefreshLayout swipeLayout;
private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmain);
        swipeLayout = findViewById(R.id.swiperefresh);
        context = this;
        swipeLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                swipeLayout.setRefreshing(true);
                Toast.makeText(context,"Has hecho refresh", Toast.LENGTH_LONG).show();
                swipeLayout.setRefreshing(false);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_bmain, menu);
        return true;

    }
}
