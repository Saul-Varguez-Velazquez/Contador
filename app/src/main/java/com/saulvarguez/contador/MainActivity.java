package com.saulvarguez.contador;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String KEY_CONTEO = "com.saulvarguez.contador.MainActivity.conteo";
    public static final String TAG = "Contador";
    private int conteo;
    private EditText conteoEditText;
    private Button contarButton;
    private Button reiniciarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Se ejecuto el método onCreate()...");

        if (savedInstanceState == null) {
            conteo = 0;
        } else {
            conteo = savedInstanceState.getInt(KEY_CONTEO);
        }
        conteoEditText = findViewById(R.id.conteo_edittext);
        contarButton = findViewById(R.id.contar_button);
        reiniciarButton = findViewById(R.id.reiniciar_button);

        contarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                conteo++;
                conteoEditText.setText(Integer.toString(conteo));
            }
        });

        reiniciarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                conteo = 0;
                conteoEditText.setText(Integer.toString(conteo));
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Se ejecuto el método onDestroy()...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Se ejecuto el método onResume()...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"Se ejecuto el método onRestart()...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Se ejecuto el método onStop()...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Se ejecuto el método onPause()...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Se ejecuto el método onStart()...");

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_CONTEO, conteo);
    }
}
