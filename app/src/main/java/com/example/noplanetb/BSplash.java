package com.example.noplanetb;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import java.io.File;

public class BSplash extends AppCompatActivity {
    ImageView imglogo;
    LinearLayout lyout;
    TextView txtlogo, txtloading;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        imglogo = (ImageView) findViewById(R.id.logo);
        lyout = findViewById(R.id.layout);
        txtlogo = findViewById(R.id.Titulo);
        txtloading = findViewById(R.id.subTitulo);
        context = this;
        setContentView(R.layout.splashscreen);
        getSupportActionBar().hide();
        Glide.with(this)
                .load(R.drawable.rocketlogo)
                .into(imglogo);
        //Glide.with(this).load(R.drawable.rocketlogo).apply(RequestOptions.circleCropTransform()).into(imglogo);

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        txtlogo.startAnimation(anim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(context, BLogin.class);
                startActivity(i);
                finish();

            }
        }, 3000);


    }
}
