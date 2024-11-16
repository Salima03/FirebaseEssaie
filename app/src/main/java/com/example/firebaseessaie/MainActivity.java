package com.example.firebaseessaie;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récupérer le bouton
        Button myButton = findViewById(R.id.myButton);

        // Ajouter un écouteur d'événements au bouton
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Afficher un Toast lorsqu'on clique sur le bouton
                Toast.makeText(MainActivity.this, "Bouton cliqué !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
