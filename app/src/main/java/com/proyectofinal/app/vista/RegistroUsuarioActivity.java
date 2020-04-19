package com.proyectofinal.app.vista;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.proyectofinal.app.R;
import com.proyectofinal.app.modelo.Usuario;
import com.proyectofinal.app.servicios.UsuarioService;

public class RegistroUsuarioActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etNombre;
    private EditText etCorreo;
    private EditText etContrasena;
    private EditText etRepiteContrasena;
    private RadioButton rbtnMotivoSeleccionado;
    private RadioButton rbtnSexoSeleccionado;
    private Button btnRegistrar;
    private Button btnRegresar;

    private RadioGroup rgroupMotivo;
    private RadioGroup rgroupSexo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        iniciarComponentes();
    }

    private void iniciarComponentes(){

        etNombre =  findViewById(R.id.et_nombre);
        etCorreo  = findViewById(R.id.et_nombre);
        etContrasena  = findViewById(R.id.et_contrasena);
        etRepiteContrasena  = findViewById(R.id.et_repetir);
        btnRegistrar  = findViewById(R.id.btn_registrarme);
        btnRegresar  = findViewById(R.id.btn_regresar);
        rgroupMotivo =  findViewById(R.id.rgroup_motivo);
        rgroupSexo=  findViewById(R.id.rgroup_sexo);

        btnRegistrar.setOnClickListener(this);
        btnRegresar.setOnClickListener(this);
    }

    private void registrarUsuario(){


    }

    private void lanzarMensaje(String mensaje){

        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view){


        if(view.getId() == btnRegistrar.getId()){

            registrarUsuario();

        }else if(view.getId() == btnRegresar.getId()){

            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
