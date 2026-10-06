package com.example.alkewallet;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.widget.Button;
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        Button btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        Button btnCrearCuenta = findViewById(R.id.btnCrearCuenta);

        btnIniciarSesion.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, Login.class);
            startActivity(intent);
        });

        btnCrearCuenta.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, SignupUp.class);
            startActivity(intent);
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}