package com.proyectofinal.app.util;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.proyectofinal.app.R;
import com.proyectofinal.app.modelo.NivelIdioma;

import java.util.List;

public class RecyclerViewNivelesAdapter extends RecyclerView.Adapter<RecyclerViewNivelesAdapter.NivelViewHolder>{

    // VARIABLES
    private List<NivelIdioma> listaNiveles;

    // CONSTRUCTOR
    public RecyclerViewNivelesAdapter(List<NivelIdioma> listaNiveles) {
        this.listaNiveles = listaNiveles;
    }

    /*Este método realiza una copia exacta de cada
    * vista nivel dependiendo del numero de elementos de
    * la lista que llega.*/
    @NonNull
    @Override
    public NivelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean attachToParentFast = false;

        View vista = inflater.inflate(R.layout.nivel_idioma, parent, attachToParentFast);

        NivelViewHolder nivelViewHolder = new NivelViewHolder(vista, parent.getContext());

        return nivelViewHolder;
    }

    /*Este método permite asignarle diferente logica a cada vista
    * del RecyclerView*/
    @Override
    public void onBindViewHolder(@NonNull NivelViewHolder holder, int position) {

        holder.bind(listaNiveles.get(position));
    }

    // devuelve el numero de elemntos de la lista
    @Override
    public int getItemCount() {
        return listaNiveles.size();
    }

    /*Esta clase permite inflar la vista nivel_idioma.xml,
    * aqui se inicializan todos sus componentes, se agregan eventos,
    * etc.*/
    class NivelViewHolder extends RecyclerView.ViewHolder{

        // VARIABLES
        private Button btnNivel;
        private ImageButton ibtnTema1;
        private ImageButton ibtnTema2;
        private ImageButton ibtnTema3;
        private ImageButton ibtnTema4;
        private ProgressBar progresoTema1;
        private ProgressBar progresoTema2;
        private ProgressBar progresoTema3;
        private ProgressBar progresoTema4;
        private TextView tvTema1;
        private TextView tvTema2;
        private TextView tvTema3;
        private TextView tvTema4;

        private Context context;

        // CONSTRUCTOR
        public NivelViewHolder(@NonNull View nivelIdiomaView, Context context) {
            super(nivelIdiomaView);

            this.context = context;

            iniciarComponentes(itemView);
        }

        // MÉTODOS
        private void iniciarComponentes(View nivelIdiomaView){

            btnNivel = nivelIdiomaView.findViewById(R.id.btn_nivel);
            ibtnTema1 = nivelIdiomaView.findViewById(R.id.ibtn_tema_1);
            ibtnTema2 = nivelIdiomaView.findViewById(R.id.ibtn_tema_2);
            ibtnTema3 = nivelIdiomaView.findViewById(R.id.ibtn_tema_3);
            ibtnTema4 = nivelIdiomaView.findViewById(R.id.ibtn_tema_4);
            progresoTema1 = nivelIdiomaView.findViewById(R.id.progreso_tema_1);
            progresoTema2 = nivelIdiomaView.findViewById(R.id.progreso_tema_2);
            progresoTema3 = nivelIdiomaView.findViewById(R.id.progreso_tema_3);
            progresoTema4 = nivelIdiomaView.findViewById(R.id.progreso_tema_4);
            tvTema1 = nivelIdiomaView.findViewById(R.id.tv_tema_1);
            tvTema2 = nivelIdiomaView.findViewById(R.id.tv_tema_2);
            tvTema3 = nivelIdiomaView.findViewById(R.id.tv_tema_3);
            tvTema4 = nivelIdiomaView.findViewById(R.id.tv_tema_4);
        }

        /*Este método permite combiarle la logica a cada una de las vistas
        * del RecyclerView*/
        public void bind(NivelIdioma nivelIdioma){

            btnNivel.setText(nivelIdioma.toString());
            btnNivel.setEnabled(nivelIdioma.isEstado());

            ibtnTema1.setImageBitmap(BitmapFactory.decodeResource(
                    context.getResources(),
                    nivelIdioma.getListaTemas().get(0).getImagen()));
            ibtnTema2.setImageBitmap(BitmapFactory.decodeResource(
                    context.getResources(),
                    nivelIdioma.getListaTemas().get(1).getImagen()));
            ibtnTema3.setImageBitmap(BitmapFactory.decodeResource(
                    context.getResources(),
                    nivelIdioma.getListaTemas().get(2).getImagen()));
            ibtnTema4.setImageBitmap(BitmapFactory.decodeResource(
                    context.getResources(),
                    nivelIdioma.getListaTemas().get(3).getImagen()));
            ibtnTema1.setEnabled(nivelIdioma.isEstado());
            ibtnTema2.setEnabled(nivelIdioma.isEstado());
            ibtnTema3.setEnabled(nivelIdioma.isEstado());
            ibtnTema3.setEnabled(nivelIdioma.isEstado());

            progresoTema1.setProgress(nivelIdioma.getListaTemas().get(0).getPorcentaje());
            progresoTema2.setProgress(nivelIdioma.getListaTemas().get(1).getPorcentaje());
            progresoTema3.setProgress(nivelIdioma.getListaTemas().get(2).getPorcentaje());
            progresoTema4.setProgress(nivelIdioma.getListaTemas().get(3).getPorcentaje());

            progresoTema1.setEnabled(nivelIdioma.isEstado());
            progresoTema2.setEnabled(nivelIdioma.isEstado());
            progresoTema3.setEnabled(nivelIdioma.isEstado());
            progresoTema4.setEnabled(nivelIdioma.isEstado());

            tvTema1.setText(nivelIdioma.getListaTemas().get(0).getTitulo());
            tvTema2.setText(nivelIdioma.getListaTemas().get(1).getTitulo());
            tvTema3.setText(nivelIdioma.getListaTemas().get(2).getTitulo());
            tvTema4.setText(nivelIdioma.getListaTemas().get(3).getTitulo());

            tvTema1.setEnabled(nivelIdioma.isEstado());
            tvTema2.setEnabled(nivelIdioma.isEstado());
            tvTema3.setEnabled(nivelIdioma.isEstado());
            tvTema4.setEnabled(nivelIdioma.isEstado());
        }
    }
}
