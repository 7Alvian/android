package com.example.submission1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView rvBias;
    private ArrayList<Bias> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBias = findViewById(R.id.rv_bias);
        rvBias.setHasFixedSize(true);

        list.addAll(BiasData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.profile:
                Intent moveIntent = new Intent(MainActivity.this,Author.class);
                startActivity(moveIntent);
                return true;
        }
        return false;
    }

    private void showRecyclerList() {
        rvBias.setLayoutManager(new LinearLayoutManager(this));
        ListBiasAdapter listBiasAdapter = new ListBiasAdapter(list);
        rvBias.setAdapter(listBiasAdapter);

        listBiasAdapter.setOnItemClickCallback(new ListBiasAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Bias data) {
                showSelectedItem(data);
            }
        });
    }

    private void showSelectedItem(Bias bias){
        Toast.makeText(this,"Anda memilih "+bias.getName(),Toast.LENGTH_SHORT).show();
    }

//    public void des(View view){
//        Intent des = new Intent(MainActivity.this, Content.class);
//        startActivity(des);
//    }

    @Override
    public void onClick(View v) {
        Intent moveIntent = new Intent(MainActivity.this,Author.class);
        startActivity(moveIntent);
    }
}
