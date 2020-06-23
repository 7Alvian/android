package com.example.submission1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Author extends AppCompatActivity {

    public static final String imgImportAuthor = "0";
    public static final String namaImportAuthor = "Nama";
    public static final String daerahImportAuthor = "Daerah";
    public static final String emailImportAuthor = "Email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);

        setTitle("Author Profile");
        ImageView imgAuthor = findViewById(R.id.profile_image);
        TextView nameAuthor = findViewById(R.id.nameAuthor);
        TextView daerahAuthor = findViewById(R.id.daerahAuthor);
        TextView emailAuthor = findViewById(R.id.emailAuthor);
    }
}
