package com.proyectofinal.app.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.proyectofinal.app.R;

public class LoginActivity extends AppCompatActivity {

    private EditText etCorreo;
    private EditText etContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etCorreo = (EditText) findViewById(R.id.et_nombre_usuario);
        etContrasena = (EditText) findViewById(R.id.et_contrasena);


    }

    public void ingresar(View view){

        String correo = etCorreo.getText().toString();
        String contrasena = etContrasena.getText().toString();

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
