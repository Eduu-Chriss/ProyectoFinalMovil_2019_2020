package com.proyectofinal.app.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.proyectofinal.app.R;

import java.util.ArrayList;

public class RecyclerActividadAdapter extends RecyclerView.Adapter<ActividadViewHolder>{

    // VARIABLES
    private ArrayList<ActividadView> listaActividades;

    // CONSTRUCTOR
    public RecyclerActividadAdapter(ArrayList<ActividadView> listaActividades) {
        this.listaActividades = listaActividades;
    }

    /*Este método realiza una copia exacta de cada
    * vista nivel dependiendo del numero de elementos de
    * la lista que llega.*/
    @NonNull
    @Override
    public ActividadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean attachToParentFast = false;

        View vista = inflater.inflate(R.layout.actividad, parent, attachToParentFast);

        ActividadViewHolder actividadViewHolder = new ActividadViewHolder(vista, parent.getContext());

        return actividadViewHolder;
    }

    /*Este método permite asignarle diferente logica a cada vista
    * del RecyclerView*/
    @Override
    public void onBindViewHolder(@NonNull ActividadViewHolder holder, int position) {

        holder.bind(listaActividades.get(position));
    }

    @Override
    public int getItemCount() {
        return listaActividades.size();
    }

}
