package com.proyectofinal.app.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.proyectofinal.app.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void ingresar(View view){

        Intent intencion = new Intent(this, PrincipalActivity.class);
        startActivity(intencion);
    }

    public void registrarUsuario(View view){

        Intent intencion = new Intent(this, RegistroUsuarioActivity.class);
        startActivity(intencion);
    }

    public void recuperarContrasena(View view){

    }
}
