package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView Numero;
    Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, nPunto, oMulti, oSuma, oResta, oDivi, oIgual, oCE;
    String n="";
    double numero1=0, numero2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Numero=findViewById(R.id.Numero);
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        n3=findViewById(R.id.n3);
        n4=findViewById(R.id.n4);
        n5=findViewById(R.id.n5);
        n6=findViewById(R.id.n6);
        n7=findViewById(R.id.n7);
        n8=findViewById(R.id.n8);
        n9=findViewById(R.id.n9);
        n0=findViewById(R.id.n0);
        nPunto=findViewById(R.id.npunto);
        oMulti=findViewById(R.id.oMulti);
        oDivi=findViewById(R.id.oDivide);
        oSuma=findViewById(R.id.oSuma);
        oResta=findViewById(R.id.oResta);
        oIgual=findViewById(R.id.oIgual);
        oCE=findViewById(R.id.oCE);
        n0.setOnClickListener(this);
        n1.setOnClickListener(this);
        n2.setOnClickListener(this);
        n3.setOnClickListener(this);
        n4.setOnClickListener(this);
        n5.setOnClickListener(this);
        n6.setOnClickListener(this);
        n7.setOnClickListener(this);
        n8.setOnClickListener(this);
        n9.setOnClickListener(this);
        nPunto.setOnClickListener(this);
        oMulti.setOnClickListener(this);
        oDivi.setOnClickListener(this);
        oSuma.setOnClickListener(this);
        oResta.setOnClickListener(this);
        oIgual.setOnClickListener(this);
        oCE.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.n0:
                n+=0;
                Numero.setText(n);
                break;
            case R.id.n1:
                n+=1;
                Numero.setText(n);
                break;
            case R.id.n2:
                n+=2;
                Numero.setText(n);
                break;
            case R.id.n3:
                n+=3;
                Numero.setText(n);
                break;
            case R.id.n4:
                n+=4;
                Numero.setText(n);
                break;
            case R.id.n5:
                n+=5;
                Numero.setText(n);
                break;
            case R.id.n6:
                n+=6;
                Numero.setText(n);
                break;
            case R.id.n7:
                n+=7;
                Numero.setText(n);
                break;
            case R.id.n8:
                n+=8;
                Numero.setText(n);
                break;
            case R.id.n9:
                n+=9;
                Numero.setText(n);
                break;
            case R.id.npunto:
                break;
            case R.id.oDivide:
                break;
            case R.id.oMulti:
                break;
            case R.id.oResta:
                break;
            case R.id.oSuma:
                int resultado = Integer.parseInt(n)+Integer.parseInt(n);
                n = String.valueOf(resultado);
                n="";
                Numero.setText(n);
                break;
            case R.id.oCE:
                break;
            case R.id.oIgual:

    }
}