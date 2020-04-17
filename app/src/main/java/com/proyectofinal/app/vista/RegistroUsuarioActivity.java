package com.proyectofinal.app.vista;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.proyectofinal.app.R;

public class RegistroUsuarioActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);
    }

    public void registrar(View view){

        Toast.makeText(this, "Usuario Registrado Exitosamente!", Toast.LENGTH_SHORT).show();
    }
}
