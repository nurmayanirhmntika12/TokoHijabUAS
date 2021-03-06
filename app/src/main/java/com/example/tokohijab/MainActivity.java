package com.example.tokohijab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton btnPashmina,btnSquare,btnBergo;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }
    private void inisialisasiView() {
        btnPashmina = findViewById(R.id.btn_buka_koleksi_pashmina);
        btnSquare = findViewById(R.id.btn_buka_koleksi_square);
        btnBergo = findViewById(R.id.btn_buka_koleksi_bergo);
        btnPashmina.setOnClickListener(view -> bukaGaleri(getString(R.string.pashmina_title)));
        btnSquare.setOnClickListener(view -> bukaGaleri(getString(R.string.square_title)));
        btnBergo.setOnClickListener(view -> bukaGaleri(getString(R.string.bergo_title)));
    }

    private void bukaGaleri(String jenisHijab) {
        Log.d("MAIN","Buka activity pashmina");
        Intent intent = new Intent(this, DaftarHijabActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHijab);
        startActivity(intent);
    }

    public void bukaBiodata(View view) {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

}