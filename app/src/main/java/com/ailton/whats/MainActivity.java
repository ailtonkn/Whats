package com.ailton.whats;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {


    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View numerator = findViewById(R.id.numerotxtenviar);
        View engagement = findViewById(R.id.mensagemtxtenviar);
        View boto = findViewById(R.id.botaoenviar);


        boto.setOnClickListener(view -> {

            String numero = String.valueOf(numerator.getTextDirection());
            String mensagem = String.valueOf(engagement.getTextDirection());

            Uri webpage = Uri.parse("https://wa.me/"+ numero +"?text="+ mensagem);
            Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(webIntent);

        });



    }
}