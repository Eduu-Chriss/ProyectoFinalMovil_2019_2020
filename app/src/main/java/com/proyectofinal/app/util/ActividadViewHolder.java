package com.proyectofinal.app.util;

import android.app.Dialog;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.proyectofinal.app.R;


public class ActividadViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    // VARIABLES
    private Button btnActividad;
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

    private View actividadView;
    private Context context;

    // CONSTRUCTOR
    public ActividadViewHolder(@NonNull View actividadView, Context context) {
        super(actividadView);

        this.context = context;
        this.actividadView = actividadView;

        iniciarComponentes(itemView);
        anadirEventos();
    }

    // MÉTODOS
    private void iniciarComponentes(View actividadView){

        btnActividad = actividadView.findViewById(R.id.btn_nivel);
        ibtnTema1 = actividadView.findViewById(R.id.ibtn_tema_1);
        ibtnTema2 = actividadView.findViewById(R.id.ibtn_tema_2);
        ibtnTema3 = actividadView.findViewById(R.id.ibtn_tema_3);
        ibtnTema4 = actividadView.findViewById(R.id.ibtn_tema_4);
        progresoTema1 = actividadView.findViewById(R.id.progreso_tema_1);
        progresoTema2 = actividadView.findViewById(R.id.progreso_tema_2);
        progresoTema3 = actividadView.findViewById(R.id.progreso_tema_3);
        progresoTema4 = actividadView.findViewById(R.id.progreso_tema_4);
        tvTema1 = actividadView.findViewById(R.id.tv_tema_1);
        tvTema2 = actividadView.findViewById(R.id.tv_tema_2);
        tvTema3 = actividadView.findViewById(R.id.tv_tema_3);
        tvTema4 = actividadView.findViewById(R.id.tv_tema_4);
    }

    private void anadirEventos(){

        ibtnTema1.setOnClickListener(this);
        ibtnTema2.setOnClickListener(this);
        ibtnTema3.setOnClickListener(this);
        ibtnTema4.setOnClickListener(this);
    }

    /*Este método permite combiarle la logica a cada una de las vistas
     * del RecyclerView*/
    public void bind(ActividadView actividad){

        btnActividad.setText(actividad.getNumActividad());
        btnActividad.setEnabled(actividad.isEstado());

        ibtnTema1.setImageBitmap(BitmapFactory.decodeResource(
                context.getResources(),
                actividad.getImgTema1()));
        ibtnTema2.setImageBitmap(BitmapFactory.decodeResource(
                context.getResources(),
                actividad.getImgTema2()));
        ibtnTema3.setImageBitmap(BitmapFactory.decodeResource(
                context.getResources(),
                actividad.getImgTema3()));
        ibtnTema4.setImageBitmap(BitmapFactory.decodeResource(
                context.getResources(),
                actividad.getImgTema4()));
        ibtnTema1.setEnabled(actividad.isEstado());
        ibtnTema2.setEnabled(actividad.isEstado());
        ibtnTema3.setEnabled(actividad.isEstado());
        ibtnTema4.setEnabled(actividad.isEstado());

        progresoTema1.setProgress(actividad.getPorcentajeTema1());
        progresoTema2.setProgress(actividad.getPorcentajeTema2());
        progresoTema3.setProgress(actividad.getPorcentajeTema3());
        progresoTema4.setProgress(actividad.getPorcentajeTema4());

        progresoTema1.setEnabled(actividad.isEstado());
        progresoTema2.setEnabled(actividad.isEstado());
        progresoTema3.setEnabled(actividad.isEstado());
        progresoTema4.setEnabled(actividad.isEstado());

        tvTema1.setText(actividad.getTema1());
        tvTema2.setText(actividad.getTema2());
        tvTema3.setText(actividad.getTema3());
        tvTema4.setText(actividad.getTema4());

        tvTema1.setEnabled(actividad.isEstado());
        tvTema2.setEnabled(actividad.isEstado());
        tvTema3.setEnabled(actividad.isEstado());
        tvTema4.setEnabled(actividad.isEstado());


        if(!actividad.isEstado()){


            btnActividad.setBackgroundResource(R.drawable.ic_nivel_bloqueado);
            btnActividad.setTextColor(Color.parseColor("#808080"));

            progresoTema1.setBackgroundColor(Color.parseColor("#808080"));
            progresoTema2.setBackgroundColor(Color.parseColor("#808080"));
            progresoTema3.setBackgroundColor(Color.parseColor("#808080"));
            progresoTema4.setBackgroundColor(Color.parseColor("#808080"));

            tvTema1.setTextColor(Color.parseColor("#808080"));
            tvTema2.setTextColor(Color.parseColor("#808080"));
            tvTema3.setTextColor(Color.parseColor("#808080"));
            tvTema4.setTextColor(Color.parseColor("#808080"));

            ibtnTema1.setImageResource(actividad.getImgTema1Bloq());
            ibtnTema2.setImageResource(actividad.getImgTema2Bloq());
            ibtnTema3.setImageResource(actividad.getImgTema3Bloq());
            ibtnTema4.setImageResource(actividad.getImgTema4Bloq());
        }else{

            btnActividad.setBackgroundResource(R.drawable.ic_nivel);
            btnActividad.setTextColor(Color.parseColor("#000000"));

            progresoTema1.setBackgroundColor(Color.parseColor("#D6D6D6"));
            progresoTema2.setBackgroundColor(Color.parseColor("#D6D6D6"));
            progresoTema3.setBackgroundColor(Color.parseColor("#D6D6D6"));
            progresoTema4.setBackgroundColor(Color.parseColor("#D6D6D6"));

            tvTema1.setTextColor(Color.parseColor("#0D2C14"));
            tvTema2.setTextColor(Color.parseColor("#0D2C14"));
            tvTema3.setTextColor(Color.parseColor("#0D2C14"));
            tvTema4.setTextColor(Color.parseColor("#0D2C14"));
        }
    }

    @Override
    public void onClick(View v) {

        ImageButton btnFuente = actividadView.findViewById(v.getId());
        Dialog dialogo = new Dialog(context);

        if (btnFuente.equals(ibtnTema1)) dialogo.setTitle(tvTema1.getText());
        else if(btnFuente.equals(ibtnTema2)) dialogo.setTitle(tvTema2.getText());
        else if(btnFuente.equals(ibtnTema3)) dialogo.setTitle(tvTema3.getText());
        else if(btnFuente.equals(ibtnTema4)) dialogo.setTitle(tvTema4.getText());

        dialogo.setCancelable(true);
        dialogo.setContentView(R.layout.menu_actividad);
        dialogo.show();
    }
}
