package com.example.fungsiintent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void panggil(View view) {
        String nomor ="085156270985";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri. fromParts("tel", nomor, null));
        startActivity(panggil);
    }

    public void buka(View view){
        String url = "https://smkn4bdg.sch.id";
        Intent bukabrowser = new Intent(Intent.ACTION_VIEW);
        bukabrowser.setData(Uri.parse(url));
        startActivity(bukabrowser);
    }

    public void tentang(View view){
        Intent tentang = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(tentang);
    }
}
