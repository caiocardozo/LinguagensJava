package br.com.ccard.linguagensprogramacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textJava = findViewById(R.id.tvJava);
        textJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, JavaActivity.class);
                startActivity(i);
            }
        });

        TextView textDotNet = findViewById(R.id.tvdotnet);
        textDotNet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, DotNetActivity.class);
                startActivity(i);
                        }
        });

        TextView textPython = findViewById(R.id.tvPython);
        textPython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, PythonActivity.class);
            startActivity(i);
        }

        });

        TextView textAngular = findViewById(R.id.tvAngular);
        textAngular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        Intent i = new Intent(MainActivity.this, AngularJSActivity.class);
        startActivity(i);
        }

        });

        TextView textReact = findViewById(R.id.tvReact);
        textReact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        Intent i = new Intent(MainActivity.this, ReactActivity.class);
        startActivity(i);
        }

        });

    }


}
