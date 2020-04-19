package com.proyectofinal.app.vista.principal_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.proyectofinal.app.R;
import com.proyectofinal.app.util.ActividadView;
import com.proyectofinal.app.util.RecyclerActividadAdapter;

public class HomeFragment extends Fragment{


    private Button btnIntro;
    private ProgressBar progresoTotal;
    private ProgressBar progresoIntro;
    private TextView tvProgresoTotal;
    private RecyclerView contenedorActividades;

    private View homeFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        homeFragment = inflater.inflate(R.layout.fragment_home, container, false);

        iniciarComponentes();
        setVistaActividades();

        return homeFragment;
    }

    private void iniciarComponentes(){

        btnIntro =  homeFragment.findViewById(R.id.btn_intro);
        progresoTotal = homeFragment.findViewById(R.id.progreso_home);
        progresoIntro = homeFragment.findViewById(R.id.progreso_intro);
        tvProgresoTotal = homeFragment.findViewById(R.id.tv_porcentaje_total);
        contenedorActividades = homeFragment.findViewById(R.id.contenedor_niveles);
    }

    private void setVistaActividades(){

        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        contenedorActividades.setLayoutManager(manager);

        RecyclerActividadAdapter adapter = new RecyclerActividadAdapter(ActividadView.getListaActividades());

        contenedorActividades.setAdapter(adapter);
    }


}
