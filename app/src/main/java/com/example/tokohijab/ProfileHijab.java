package com.example.tokohijab;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tokohijab.model.Hijab;

public class ProfileHijab extends AppCompatActivity {

    Hijab hijab;
    TextView txJudul,txJenis,txBahan,txDeskripsi;
    ImageView ivFotoHijab;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koleksi);
        Intent intent = getIntent();
        hijab = (Hijab) intent.getSerializableExtra(DaftarHijabActivity.HIJAB_TERPILIH);
        inisialisasiView();
        tampilkanProfil(hijab);
    }

    private void inisialisasiView() {
        txJudul = findViewById(R.id.txJudul);
        txJenis = findViewById(R.id.txJenis);
        txBahan = findViewById(R.id.txBahan);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoHijab = findViewById(R.id.gambarHijab);
        btnBack = findViewById(R.id.btn_back_to_list);
        btnBack.setOnClickListener(view -> {
            onBackPressed();
        });
    }


    private void tampilkanProfil(Hijab hijab) {
        Log.d("Profil","Menampilkan "+hijab.getJenis());
        txJudul.setText(hijab.getJenis());
        txJenis.setText(hijab.getNama());
        txBahan.setText(hijab.getBahan());
        txDeskripsi.setText(hijab.getDeskripsi());
        ivFotoHijab.setImageDrawable(this.getDrawable(hijab.getDrawableRes()));
    }




}