package com.example.tokohijab;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.tokohijab.model.Bergo;
import com.example.tokohijab.model.Hijab;
import com.example.tokohijab.model.Pashmina;
import  com.example.tokohijab.model.Square;

public class DataProvider {
    private static List<Hijab> hijabs = new ArrayList<>();

    private static List<Pashmina> initDataPashmina(Context ctx) {
        List<Pashmina> pashminas = new ArrayList<>();
        pashminas.add(new Pashmina(ctx.getString(R.string.plisket_nama), ctx.getString(R.string.plisket_bahan),
                ctx.getString(R.string.plisket_deskripsi), R.drawable.plisket));
        pashminas.add(new Pashmina(ctx.getString(R.string.babydol_nama), ctx.getString(R.string.babydol_bahan),
                ctx.getString(R.string.babydol_deskripsi), R.drawable.ceruty));
        pashminas.add(new Pashmina(ctx.getString(R.string.cricnle_nama), ctx.getString(R.string.crincle_bahan),
                ctx.getString(R.string.crincle_deskripsi), R.drawable.crincle));
        pashminas.add(new Pashmina(ctx.getString(R.string.payet_nama), ctx.getString(R.string.payet_bahan),
                ctx.getString(R.string.payet_deskripsi), R.drawable.pashmina_payet));
        pashminas.add(new Pashmina(ctx.getString(R.string.pmotif_nama), ctx.getString(R.string.pmotif_bahan),
                ctx.getString(R.string.pmotif_deskripsi), R.drawable.pashmina_motif));
        pashminas.add(new Pashmina(ctx.getString(R.string.ptali_nama), ctx.getString(R.string.ptali_bahan),
                ctx.getString(R.string.ptali_deskripsi), R.drawable.pashmina_tali));
        return pashminas;
    }

    private static List<Square> initDataSquare(Context ctx) {
        List<Square> squares = new ArrayList<>();
        squares.add(new Square(ctx.getString(R.string.square_nama), ctx.getString(R.string.square_bahan),
                ctx.getString(R.string.square_deskripsi), R.drawable.square));
        squares.add(new Square(ctx.getString(R.string.cornskin_nama), ctx.getString(R.string.cornskin_bahan),
                ctx.getString(R.string.cornskin_deskripsi), R.drawable.cornskin));
        squares.add(new Square(ctx.getString(R.string.voal_nama), ctx.getString(R.string.voal_bahan),
                ctx.getString(R.string.voal_deskripsi), R.drawable.voal));
        squares.add(new Square(ctx.getString(R.string.splisket_nama), ctx.getString(R.string.splisket_bahan),
                ctx.getString(R.string.splisket_deskripsi), R.drawable.segi4_plisket));
        squares.add(new Square(ctx.getString(R.string.syari_nama), ctx.getString(R.string.syari_bahan),
                ctx.getString(R.string.syari_deskripsi), R.drawable.segi4_syari));
        return squares;
    }

    private static List<Bergo> initDataBergo(Context ctx) {
        List<Bergo> bergos = new ArrayList<>();
        bergos.add(new Bergo(ctx.getString(R.string.padi_nama), ctx.getString(R.string.padi_bahan),
                ctx.getString(R.string.padi_deskripsi), R.drawable.padi));
        bergos.add(new Bergo(ctx.getString(R.string.maryam_nama), ctx.getString(R.string.maryam_bahan),
                ctx.getString(R.string.maryam_deskripsi), R.drawable.maryam));
        bergos.add(new Bergo(ctx.getString(R.string.sport_nama), ctx.getString(R.string.sport_bahan),
                ctx.getString(R.string.sport_deskripsi), R.drawable.sport));
        bergos.add(new Bergo(ctx.getString(R.string.lidi_nama), ctx.getString(R.string.lidi_bahan),
                ctx.getString(R.string.lidi_deskripsi), R.drawable.bergo_plisket));
        bergos.add(new Bergo(ctx.getString(R.string.rempel_nama), ctx.getString(R.string.rempel_bahan),
                ctx.getString(R.string.rempel_deskripsi), R.drawable.bergo_rempel));
        return bergos;
    }

    private static void initAllHijabs(Context ctx) {
        hijabs.addAll(initDataPashmina(ctx));
        hijabs.addAll(initDataSquare(ctx));
        hijabs.addAll(initDataBergo(ctx));
    }

    public static List<Hijab> getAllHijab(Context ctx) {
        if (hijabs.size() == 0) {
            initAllHijabs(ctx);
        }
        return  hijabs;
    }

    public static List<Hijab> getHijabsByTipe(Context ctx, String jenis) {
        List<Hijab> hijabsByType = new ArrayList<>();
        if (hijabs.size() == 0) {
            initAllHijabs(ctx);
        }
        for (Hijab h : hijabs) {
            if (h.getJenis().equals(jenis)) {
                hijabsByType.add(h);
            }
        }
        return hijabsByType;
    }

}