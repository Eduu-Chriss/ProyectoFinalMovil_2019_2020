package com.proyectofinal.app.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.proyectofinal.app.R;
import com.proyectofinal.app.util.BDHelper;

public class LoginActivity extends AppCompatActivity {

    private EditText etCorreo;
    private EditText etContrasena;

    private BDHelper conexionBD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etCorreo = (EditText) findViewById(R.id.et_nombre_usuario);
        etContrasena = (EditText) findViewById(R.id.et_contrasena);

        conexionBD = new BDHelper(this);

    }

    public void ingresar(View view){

        String correo = etCorreo.getText().toString();
        String contrasena = etContrasena.getText().toString();

        if(conexionBD.validarSesion(correo, contrasena)){

            Intent intencion = new Intent(this, PrincipalActivity.class);
            startActivity(intencion);
        }else{

            Toast.makeText(this, "¡Usuario o Contraseña incorrectos!", Toast.LENGTH_SHORT).show();
        }

    }

    public void registrarUsuario(View view){

        Intent intencion = new Intent(this, RegistroUsuarioActivity.class);
        startActivity(intencion);
    }

    public void recuperarContrasena(View view){

    }
}
