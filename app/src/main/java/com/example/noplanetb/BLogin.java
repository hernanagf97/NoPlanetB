package com.example.noplanetb;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BLogin extends AppCompatActivity {
    private Button btnIngresar;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnIngresar = findViewById(R.id.boton_siguiente);
        context = this;
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, BMain.class);
                startActivity(i);
                finish();
            }
        });

    }
}
