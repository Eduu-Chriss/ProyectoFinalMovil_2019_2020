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
import com.proyectofinal.app.servicios.UsuariosService;
import com.proyectofinal.app.util.BDHelper;
import com.proyectofinal.app.util.Validaciones;

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

    private final BDHelper bdHelper = new BDHelper(this);
    private final UsuariosService usuariosService = new UsuariosService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        iniciarComponentes();
    }

    private void iniciarComponentes(){

        etNombre = (EditText) findViewById(R.id.et_nombre);
        etCorreo  = (EditText)findViewById(R.id.et_nombre);
        etContrasena  = (EditText)findViewById(R.id.et_contrasena);
        etRepiteContrasena  = (EditText)findViewById(R.id.et_repetir);
        btnRegistrar  = (Button)findViewById(R.id.btn_registrarme);
        btnRegresar  = (Button)findViewById(R.id.btn_regresar);
        rgroupMotivo = (RadioGroup) findViewById(R.id.rgroup_motivo);
        rgroupSexo= (RadioGroup) findViewById(R.id.rgroup_sexo);

        btnRegistrar.setOnClickListener(this);
        btnRegresar.setOnClickListener(this);
    }

    private void registrarUsuario(){

        rbtnMotivoSeleccionado = findViewById(rgroupMotivo.getCheckedRadioButtonId());
        String motivo = rbtnMotivoSeleccionado.getText().toString();

        rbtnSexoSeleccionado = findViewById(rgroupSexo.getCheckedRadioButtonId());
        String sexo = rbtnSexoSeleccionado.getText().toString();

        String nombre = etNombre.getText().toString();
        String correo = etCorreo.getText().toString();
        String contrasena = etContrasena.getText().toString();
        String repContrasena = etRepiteContrasena.getText().toString();

        if(Validaciones.validarCorreo(correo)){

            if (bdHelper.existeUsuarioLocal(correo)) {

                if(!usuariosService.existeUsuarioRemoto(correo)){

                    if(!nombre.equals("")){

                        if(contrasena.equals(repContrasena)){

                            Usuario usuario = new Usuario();
                            usuario.setCorreo(correo);
                            usuario.setNombre(nombre);

                            if(sexo.equals("Masculino"))usuario.setUrlFoto(Usuario.AVATAR_HOMBRE);
                            if(sexo.equals("Femenino"))usuario.setUrlFoto(Usuario.AVATAR_MUJER);
                            if(sexo.equals("Prefiero no decirlo"))usuario.setUrlFoto(Usuario.AVATAR_INDIFERENTE);

                            usuario.setSexo(sexo);
                            usuario.setMotivo(motivo);
                            usuario.setContrasena(contrasena);

                            if(bdHelper.registrarUsuario(usuario)){

                                Intent intent = new Intent(this, PrincipalActivity.class);
                                startActivity(intent);
                                finish();

                            }else lanzarMensaje("¡Ocurrio un Error! :(");
                        }else lanzarMensaje("¡Las contraseñas no coinsiden!");
                    }else lanzarMensaje("¡Por favor ingrese su nombre!");
                }else lanzarMensaje("¡Este usuario ya se encuentra registrado!");
            }else lanzarMensaje("¡Este usuario ya se encuentra registrado!");
        }else lanzarMensaje("¡El correo ingresado no es válido!");
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
