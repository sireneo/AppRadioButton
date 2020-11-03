package com.sijc.radio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Se esta creando", Toast.LENGTH_SHORT).show();

        et1 = (EditText) findViewById(R.id.txt_num1);
        et2 = (EditText) findViewById(R.id.txt_num2);
        tv1 = (TextView) findViewById(R.id.txt_resultado);
        rb1 = (RadioButton) findViewById(R.id.rb_suma);
        rb2 = (RadioButton) findViewById(R.id.rb_resta);

    }

    //metodpo que p[ermite calcular suma y rsta
    public void Calcular(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);


        if (rb1.isChecked() == true) {
            int suma = num1 + num2;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        } else if (rb2.isChecked() == true) {
            int resta = num1 - num2;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Inciando", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de hacerse visible.
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Visible", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Segundo plano", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "No es visible", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Finalizacion", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de ser destruida.
    }
}