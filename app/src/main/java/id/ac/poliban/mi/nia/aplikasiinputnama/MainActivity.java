package id.ac.poliban.mi.nia.aplikasiinputnama;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNama = findViewById(R.id.edNama);
        Button btTampilkan = findViewById(R.id.btTampilkan);

        btTampilkan.setOnClickListener(v -> {
            Toast.makeText(this, "Hai " + edNama.getText().toString(), Toast.LENGTH_SHORT).show();
        });
    }

}
