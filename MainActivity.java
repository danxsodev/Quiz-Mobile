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