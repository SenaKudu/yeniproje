package com.example.sena.uygulama;

/**
 * Created by sena on 11.06.2017.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by enjloezz on 11.06.2017.
 */

public class customAdapter extends BaseAdapter {
    private ArrayList<urunClass> urunListesi;
    private LayoutInflater mInflater;
    private Activity activity;

    public customAdapter(Activity activity, ArrayList<urunClass> urunListesi) {

        this.activity = activity;
        mInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        this.urunListesi = urunListesi;
    }

    @Override
    public int getCount() {
        return urunListesi.size();
    }

    @Override
    public Object getItem(int i) {
        return urunListesi.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final urunClass urun = urunListesi.get(i);
        final View satirView;
        satirView = mInflater.inflate(R.layout.xdd, null);
        TextView urunIsmi = (TextView) satirView.findViewById(R.id.textView);
        TextView urunFiyati=(TextView) satirView.findViewById(R.id.textView2);
        urunIsmi.setText(urun.getUrunIsmi());
        urunFiyati.setText(urun.getUrunFiyati());

        return satirView;
    }


}
