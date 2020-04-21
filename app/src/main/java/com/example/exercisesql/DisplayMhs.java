package com.example.exercisesql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.CalendarContract;
import android.widget.EditText;

public class DisplayMhs extends AppCompatActivity {
EditText nama;
EditText phone;
EditText Alamat;
EditText Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_mhs);
        nama = (EditText) findViewById(R.id.editTextNama);
        phone = (EditText) findViewById(R.id.editTextName);
        Email = (EditText) findViewById(R.id.editTextEmail);
        Alamat = (EditText) findViewById(R.id.editTextPhone);

    }
}
