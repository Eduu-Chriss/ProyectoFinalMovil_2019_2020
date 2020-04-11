package com.proyectofinal.app.vista.principal_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.proyectofinal.app.R;
import com.proyectofinal.app.modelo.NivelIdioma;
import com.proyectofinal.app.modelo.Tema;
import com.proyectofinal.app.util.RecyclerViewNivelesAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment{


    private View homeFragment;
    private RecyclerView contenedorNiveles;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        homeFragment = inflater.inflate(R.layout.fragment_home, container, false);

        iniciarComponentes();
        setVistaNiveles();

        return homeFragment;
    }

    private void iniciarComponentes(){

        contenedorNiveles = homeFragment.findViewById(R.id.contenedor_niveles);
    }

    private void setVistaNiveles(){

        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        contenedorNiveles.setLayoutManager(manager);

        RecyclerViewNivelesAdapter adapter = new RecyclerViewNivelesAdapter(realizarPrubasRecyclerView());

        contenedorNiveles.setAdapter(adapter);
    }

    private List<NivelIdioma> realizarPrubasRecyclerView(){

        List<NivelIdioma> listaNiveles = new ArrayList<>();
        List<Tema> listaTemas = new ArrayList<>();
        List<Tema> listaTemas2 = new ArrayList<>();

        Tema tema1 = new Tema();
        tema1.setTitulo("Saludos");
        tema1.setImagen(R.mipmap.ic_saludo);
        tema1.setPorcentaje(25);

        Tema tema2 = new Tema();
        tema2.setTitulo("Alimentos");
        tema2.setImagen(R.mipmap.ic_comida);
        tema2.setPorcentaje(50);

        Tema tema3 = new Tema();
        tema3.setTitulo("Cuerpo Humano");
        tema3.setImagen(R.mipmap.ic_cuerpo);
        tema3.setPorcentaje(75);

        Tema tema4 = new Tema();
        tema4.setTitulo("Números");
        tema4.setImagen(R.mipmap.ic_numeros);
        tema4.setPorcentaje(100);

        Tema tema5 = new Tema();
        tema5.setTitulo("Prendas");
        tema5.setImagen(R.mipmap.ic_prendas);
        tema5.setPorcentaje(0);

        Tema tema6 = new Tema();
        tema6.setTitulo("Animales");
        tema6.setImagen(R.mipmap.ic_animales);
        tema6.setPorcentaje(0);

        Tema tema7 = new Tema();
        tema7.setTitulo("Enfermedades");
        tema7.setImagen(R.mipmap.ic_enfermedades);
        tema7.setPorcentaje(0);

        Tema tema8 = new Tema();
        tema8.setTitulo("Familia");
        tema8.setImagen(R.mipmap.ic_familia);
        tema8.setPorcentaje(0);

        listaTemas.add(tema1);
        listaTemas.add(tema2);
        listaTemas.add(tema3);
        listaTemas.add(tema4);
        listaTemas2.add(tema5);
        listaTemas2.add(tema6);
        listaTemas2.add(tema7);
        listaTemas2.add(tema8);

        NivelIdioma nivel1 = new NivelIdioma();
        nivel1.setId(1);
        nivel1.setListaTemas(listaTemas);
        nivel1.setEstado(true);

        NivelIdioma nivel2 = new NivelIdioma();
        nivel2.setId(2);
        nivel2.setListaTemas(listaTemas2);
        nivel2.setEstado(false);

        listaNiveles.add(nivel1);
        listaNiveles.add(nivel2);

        return listaNiveles;
    }

}
