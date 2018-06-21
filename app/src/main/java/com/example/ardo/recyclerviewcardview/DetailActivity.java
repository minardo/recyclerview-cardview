package com.example.ardo.recyclerviewcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imgDetailAvatar;
    TextView txtDetailJudul, txtDetailWaktu, txtDetailDeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgDetailAvatar = (ImageView) findViewById(R.id.img_detail_avatar);
        txtDetailJudul = (TextView) findViewById(R.id.txt_detail_judul);
        txtDetailWaktu = (TextView) findViewById(R.id.txt_detail_waktu);
        txtDetailDeskripsi = (TextView) findViewById(R.id.txt_detail_deskripsi);

        getData();
    }

    private void getData() {
        txtDetailJudul.setText(getIntent().getStringExtra("id_judul"));
        txtDetailWaktu.setText(getIntent().getStringExtra("id_waktu"));
        txtDetailDeskripsi.setText(getIntent().getStringExtra("id_desc"));

        Glide.with(this)
                .load(getIntent().getIntExtra("id_img", 0))
                .into(imgDetailAvatar);
    }
}
