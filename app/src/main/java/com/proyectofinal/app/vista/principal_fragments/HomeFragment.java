package com.proyectofinal.app.vista.principal_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.proyectofinal.app.R;
import com.proyectofinal.app.util.ActividadRecyclerPlantilla;
import com.proyectofinal.app.util.RecyclerViewActividadesAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment{


    private View homeFragment;
    private RecyclerView contenedorActividades;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        homeFragment = inflater.inflate(R.layout.fragment_home, container, false);

        iniciarComponentes();
        setVistaActividades();

        return homeFragment;
    }

    private void iniciarComponentes(){

        contenedorActividades = homeFragment.findViewById(R.id.contenedor_niveles);
    }

    private void setVistaActividades(){

        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        contenedorActividades.setLayoutManager(manager);

        RecyclerViewActividadesAdapter adapter = new RecyclerViewActividadesAdapter(ActividadRecyclerPlantilla.getListaActividades());

        contenedorActividades.setAdapter(adapter);
    }


}
