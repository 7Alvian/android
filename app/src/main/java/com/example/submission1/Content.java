package com.example.submission1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Content extends AppCompatActivity implements View.OnClickListener {
    public static final String imgImport = "0";
    public static final String nameImport = "Nama";
    public static final String contentImport = "Konten";
    public static final String fullNameImport = "Nama Lengkap";
    public static final String birthImport = "Tgl lahir";
    public static final String heightImport = "Tinggi";
    public static final String weightImport = "Berat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        setTitle(getIntent().getStringExtra(nameImport));

        ImageView img = findViewById(R.id.imageView);
        TextView name = findViewById(R.id.namaLengkap);
        TextView content = findViewById(R.id.konten);
        TextView fullname = findViewById(R.id.tv_item_fullname);
        TextView birth = findViewById(R.id.tv_item_birth);
        TextView height = findViewById(R.id.tv_item_height);
        TextView weight = findViewById(R.id.tv_item_weight);

        int imgContent = getIntent().getIntExtra(imgImport, 0);
        String nameContent = getIntent().getStringExtra(nameImport);
        String contentContent = getIntent().getStringExtra(contentImport);
        String fullnameContent = getIntent().getStringExtra(fullNameImport);
        String birthContent = getIntent().getStringExtra(birthImport);
        String heightContent = getIntent().getStringExtra(heightImport);
        String weightContent = getIntent().getStringExtra(weightImport);

        img.setImageResource(imgContent);
        name.setText(nameContent);
        content.setText(contentContent);
        fullname.setText(fullnameContent);
        birth.setText(birthContent);
        height.setText(heightContent);
        weight.setText(weightContent);

    }

    @Override
    public void onClick(View v) {
        Intent moveIntent = new Intent(this,MainActivity.class);
        startActivity(moveIntent);
    }
}
