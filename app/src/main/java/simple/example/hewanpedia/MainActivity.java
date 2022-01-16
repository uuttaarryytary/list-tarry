package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Intent pindah;
    ImageButton btnHarimau,btnKupu,btnSinga,tombol;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    @SuppressLint("WrongViewCast")
    private void inisialisasiView() {
        btnHarimau = findViewById(R.id.btn_buka_ras_harimau);
        btnKupu = findViewById(R.id.btn_buka_ras_kupu);
        btnSinga = findViewById(R.id.btn_buka_ras_singa);
        tombol = (ImageButton) findViewById(R.id.btn_buka_profile);
        btnHarimau.setOnClickListener(view -> bukaGaleri("Kucing"));
        btnKupu.setOnClickListener(view -> bukaGaleri("Monyet"));
        btnSinga.setOnClickListener(view -> bukaGaleri("Anjing"));
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(pindah);
            }
        });
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

}