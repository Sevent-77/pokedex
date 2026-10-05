package com.example.pokedex;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class Description extends AppCompatActivity {

    TextView txtNome;
    TextView textType;
    TextView textDescription;
    ImageView imgAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_description);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imgAvatar = findViewById(R.id.imagePokemon);
        txtNome = findViewById(R.id.textName);
        textType = findViewById(R.id.textType);
        textDescription = findViewById(R.id.textDescription);

        String nome = getIntent().getStringExtra("Nome");
        String tipo = getIntent().getStringExtra("Tipo");
        String imagem = getIntent().getStringExtra("Imagem");
        String descricao = getIntent().getStringExtra("Descricao");

        txtNome.setText(nome);
        textType.setText(tipo);
        textDescription.setText(descricao);

        Glide.with(this).load(imagem).into(imgAvatar);



    }
}