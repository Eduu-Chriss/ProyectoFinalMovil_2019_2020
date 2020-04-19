package com.proyectofinal.app.vista.principal_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.proyectofinal.app.R;

public class CuentaUsuarioFragment extends Fragment {

    private TextView tvUsuario;
    private TextView tvNombre;
    private TextView tvNivel;
    private TextView tvProgresoTotal;
    private Button btnEditar;
    private Button btnAprender;
    private Button btnEstadisticas;
    private Button btnCerrarSesion;
    private ProgressBar progresoTotal;
    private RadioGroup grupoBtn;

    private View cuentaUsuarioFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        cuentaUsuarioFragment = inflater.inflate(R.layout.fragment_cuenta_usuario, container, false);

        iniciarComponentes();

        return cuentaUsuarioFragment;
    }

    private void iniciarComponentes(){

        tvUsuario = cuentaUsuarioFragment.findViewById(R.id.tv_nombre_usuario);
        tvNombre = cuentaUsuarioFragment.findViewById(R.id.tv_nombre);
        tvNivel = cuentaUsuarioFragment.findViewById(R.id.tv_nombre_nivel);
        tvProgresoTotal = cuentaUsuarioFragment.findViewById(R.id.tv_porcentaje);
        progresoTotal = cuentaUsuarioFragment.findViewById(R.id.progreso_idioma);
    }

}
