package com.example.app_quiz_atv1_turmaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonResponder;
    RadioButton radioButtonPastel, radioButtonLasanha, radioButtonStrogonoff, radioButtonMocoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonResponder = findViewById(R.id.buttonResponderQ1);
        radioButtonPastel = findViewById(R.id.radioButtonPastelQ1);
        radioButtonLasanha = findViewById(R.id.radioButtonLasanhaQ1);
        radioButtonStrogonoff = findViewById(R.id.radioButtonStrogonoffQ1);
        radioButtonMocoto = findViewById(R.id.radioButtonMocotoQ1);

        buttonResponder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButtonStrogonoff.isChecked()==true) {
                    Toast.makeText(MainActivity.this, "Alternativa Correta", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Alternativa Incorreta", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}




public class ActivityQ2 extends AppCompatActivity {

    Button buttonResponderQ2;
    RadioButton radioButtonPizza, radioButtonChurrasco, radioButtonHamburguer, radioButtonEsfiha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Q2);

        buttonResponderQ2 = findViewById(R.id.buttonResponderQ2);
        radioButtonPizza = findViewById(R.id.radioButtonPizzaQ2);
        radioButtonChurrasco = findViewById(R.id.radioButtonChurrascoQ2);
        radioButtonHamburguer = findViewById(R.id.radioButtonHamburguerQ2);
        radioButtonEsfiha = findViewById(R.id.radioButtonEsfihaQ2);

        buttonResponderQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButtonChurrasco.isChecked()==true) {
                    Toast.makeText(ActivityQ2.this, "Alternativa Correta", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(ActivityQ2.this, "Alternativa Incorreta", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}




public class ActivityQ3 extends AppCompatActivity {

    Button buttonResponderQ3;
    RadioButton radioButtonChocolate, radioButtonChurros, radioButtonPave, radioButtonMousse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Q3);

        buttonResponderQ3 = findViewById(R.id.buttonResponderQ3);
        radioButtonChocolate = findViewById(R.id.radioButtonChocolateQ3);
        radioButtonChurros = findViewById(R.id.radioButtonChurrosQ3);
        radioButtonPave = findViewById(R.id.radioButtonPaveQ3);
        radioButtonMousse = findViewById(R.id.radioButtonMousseQ3);

        buttonResponderQ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButtonChocolate.isChecked()==true) {
                    Toast.makeText(ActivityQ3.this, "Alternativa Correta", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(ActivityQ3.this, "Alternativa Incorreta", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}