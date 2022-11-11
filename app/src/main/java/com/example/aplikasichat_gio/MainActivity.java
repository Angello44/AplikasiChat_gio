package com.example.aplikasichat_gio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView penerima;
    public static final String KONTAK = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pageNgabIronman(View view){
        Intent page1 = new Intent(MainActivity.this, Halamanpesan.class);
        page1.putExtra(KONTAK, "HULK");
        startActivity(page1);
    }

    public void pageNgabDeadpool(View view) {
        Intent page1 = new Intent(MainActivity.this, Halamanpesan.class);
        page1.putExtra(KONTAK, "FLASH");
        startActivity(page1);
    }

    public void pageCilGroot(View view) {
        Intent page1 = new Intent(MainActivity.this, Halamanpesan.class);
        page1.putExtra(KONTAK, "WOLVERINE");
        startActivity(page1);
    }

    public void pageNgabThanos(View view) {
        Intent page1 = new Intent(MainActivity.this, Halamanpesan.class);
        page1.putExtra(KONTAK, "BATMAN");
        startActivity(page1);
    }
}