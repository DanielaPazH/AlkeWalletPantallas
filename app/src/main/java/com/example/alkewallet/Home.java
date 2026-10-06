package com.example.alkewallet;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        Button btnEnviarDinero = findViewById(R.id.btnEnviarDinero);

        btnEnviarDinero.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, SendMoney.class);
            startActivity(intent);

        });
        Button btnSolicitarDinero = findViewById(R.id.btnIngresarDinero);

        btnSolicitarDinero.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, RequestMoney.class);
            startActivity(intent);
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}