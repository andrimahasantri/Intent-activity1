package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvDash;
    Button btProfil, btTentang, btHubungi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btProfil = findViewById(R.id.btProfil);
        btTentang = findViewById(R.id.btTentang);
        btHubungi = findViewById(R.id.Hubungi);

        btProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(i);
            }
        });
        btTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, TentangSaya.class);
                startActivity(i);
            }
        });
        btHubungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, HubungiKami. class);
                startActivity(i);
            }
        });
    }
}