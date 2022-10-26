package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Numero;
    Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, nPunto, oMulti, oSuma, oResta, oDivi, oIgual, oCE;
    double n;
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
        n1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Numero.setText(String.valueOf(1));
                        n=1;
                    }
                }
        );
        n2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Numero.setText(String.valueOf(2));
                        n=1;
                    }
                }
        );
        n3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Numero.setText(String.valueOf(3));
                        n=Double.parseDouble((String) Numero.getText());
                    }
                }
        );
    }

}