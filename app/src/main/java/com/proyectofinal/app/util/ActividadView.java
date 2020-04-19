package com.proyectofinal.app.util;

import com.proyectofinal.app.R;

import java.util.ArrayList;

public class ActividadView {
    
    private String numActividad;
    private int imgTema1;
    private int imgTema2;
    private int imgTema3;
    private int imgTema4;
    private int imgTema1Bloq;
    private int imgTema2Bloq;
    private int imgTema3Bloq;
    private int imgTema4Bloq;
    private int porcentajeTema1;
    private int porcentajeTema2;
    private int porcentajeTema3;
    private int porcentajeTema4;
    private String tema1;
    private String tema2;
    private String tema3;
    private String tema4;
    private boolean estado;

    private final static ArrayList<ActividadView> listaActividades = new ArrayList<>();

    public ActividadView() {

    }

    // ---------------------------------------------------------------------------------------------

    public static ArrayList<ActividadView> getListaActividades(){

        if(listaActividades.isEmpty()){

            ActividadView actividad1 = new ActividadView();
            ActividadView actividad2 = new ActividadView();
            ActividadView actividad3 = new ActividadView();

            actividad1.setNumActividad("1");
            actividad1.setImgTema1(R.mipmap.ic_saludo);
            actividad1.setImgTema2(R.mipmap.ic_comida);
            actividad1.setImgTema3(R.mipmap.ic_cuerpo);
            actividad1.setImgTema4(R.mipmap.ic_numeros);
            actividad1.setImgTema1Bloq(R.drawable.ic_saludos_bloq);
            actividad1.setImgTema2Bloq(R.drawable.ic_alimentos_bloq);
            actividad1.setImgTema3Bloq(R.drawable.ic_cuerpo_bloq);
            actividad1.setImgTema4Bloq(R.drawable.ic_numeros_bloq);
            actividad1.setPorcentajeTema1(0);
            actividad1.setPorcentajeTema2(0);
            actividad1.setPorcentajeTema3(0);
            actividad1.setPorcentajeTema4(0);
            actividad1.setTema1("Saludos");
            actividad1.setTema2("Alimentos");
            actividad1.setTema3("Cuerpo Humano");
            actividad1.setTema4("Números");
            actividad1.setEstado(false);

            actividad2.setNumActividad("2");
            actividad2.setImgTema1(R.mipmap.ic_prendas);
            actividad2.setImgTema2(R.mipmap.ic_animales);
            actividad2.setImgTema3(R.mipmap.ic_enfermedades);
            actividad2.setImgTema4(R.mipmap.ic_familia);
            actividad2.setImgTema1Bloq(R.drawable.ic_prenda_bloq);
            actividad2.setImgTema2Bloq(R.drawable.ic_animales_bloq);
            actividad2.setImgTema3Bloq(R.drawable.ic_enfermedades_bloq);
            actividad2.setImgTema4Bloq(R.drawable.ic_familia_bloq);
            actividad2.setPorcentajeTema1(0);
            actividad2.setPorcentajeTema2(0);
            actividad2.setPorcentajeTema3(0);
            actividad2.setPorcentajeTema4(0);
            actividad2.setTema1("Prendas");
            actividad2.setTema2("Animales");
            actividad2.setTema3("Enfermedades");
            actividad2.setTema4("Familia");
            actividad2.setEstado(false);

            actividad3.setNumActividad("3");
            actividad3.setImgTema1(R.mipmap.ic_viajes);
            actividad3.setImgTema2(R.mipmap.ic_estudios);
            actividad3.setImgTema3(R.mipmap.ic_dias);
            actividad3.setImgTema4(R.mipmap.ic_conjugaciones);
            actividad3.setImgTema1Bloq(R.drawable.ic_viajes_bloq);
            actividad3.setImgTema2Bloq(R.drawable.ic_estudios_bloq);
            actividad3.setImgTema3Bloq(R.drawable.ic_dias_bloq);
            actividad3.setImgTema4Bloq(R.drawable.ic_conjugaciones_bloq);
            actividad3.setPorcentajeTema1(0);
            actividad3.setPorcentajeTema2(0);
            actividad3.setPorcentajeTema3(0);
            actividad3.setPorcentajeTema4(0);
            actividad3.setTema1("Viajes");
            actividad3.setTema2("Estudios");
            actividad3.setTema3("Días-Semana");
            actividad3.setTema4("Conjugar");
            actividad3.setEstado(false);

            listaActividades.add(actividad1);
            listaActividades.add(actividad2);
            listaActividades.add(actividad3);

            listaActividades.trimToSize();
        }

        return  listaActividades;
    }

    // ------------------------------------ SETTERS Y GETTERS --------------------------------------
    public String getNumActividad() {
        return numActividad;
    }

    public void setNumActividad(String numActividad) {
        this.numActividad = numActividad;
    }

    public int getImgTema1() {
        return imgTema1;
    }

    public void setImgTema1(int imgTema1) {
        this.imgTema1 = imgTema1;
    }

    public int getImgTema2() {
        return imgTema2;
    }

    public void setImgTema2(int imgTema2) {
        this.imgTema2 = imgTema2;
    }

    public int getImgTema3() {
        return imgTema3;
    }

    public void setImgTema3(int imgTema3) {
        this.imgTema3 = imgTema3;
    }

    public int getImgTema4() {
        return imgTema4;
    }

    public void setImgTema4(int imgTema4) {
        this.imgTema4 = imgTema4;
    }

    public int getImgTema1Bloq() {
        return imgTema1Bloq;
    }

    public void setImgTema1Bloq(int imgTema1Bloq) {
        this.imgTema1Bloq = imgTema1Bloq;
    }

    public int getImgTema2Bloq() {
        return imgTema2Bloq;
    }

    public void setImgTema2Bloq(int imgTema2Bloq) {
        this.imgTema2Bloq = imgTema2Bloq;
    }

    public int getImgTema3Bloq() {
        return imgTema3Bloq;
    }

    public void setImgTema3Bloq(int imgTema3Bloq) {
        this.imgTema3Bloq = imgTema3Bloq;
    }

    public int getImgTema4Bloq() {
        return imgTema4Bloq;
    }

    public void setImgTema4Bloq(int imgTema4Bloq) {
        this.imgTema4Bloq = imgTema4Bloq;
    }

    public int getPorcentajeTema1() {
        return porcentajeTema1;
    }

    public void setPorcentajeTema1(int porcentajeTema1) {
        this.porcentajeTema1 = porcentajeTema1;
    }

    public int getPorcentajeTema2() {
        return porcentajeTema2;
    }

    public void setPorcentajeTema2(int porcentajeTema2) {
        this.porcentajeTema2 = porcentajeTema2;
    }

    public int getPorcentajeTema3() {
        return porcentajeTema3;
    }

    public void setPorcentajeTema3(int porcentajeTema3) {
        this.porcentajeTema3 = porcentajeTema3;
    }

    public int getPorcentajeTema4() {
        return porcentajeTema4;
    }

    public void setPorcentajeTema4(int porcentajeTema4) {
        this.porcentajeTema4 = porcentajeTema4;
    }

    public String getTema1() {
        return tema1;
    }

    public void setTema1(String tema1) {
        this.tema1 = tema1;
    }

    public String getTema2() {
        return tema2;
    }

    public void setTema2(String tema2) {
        this.tema2 = tema2;
    }

    public String getTema3() {
        return tema3;
    }

    public void setTema3(String tema3) {
        this.tema3 = tema3;
    }

    public String getTema4() {
        return tema4;
    }

    public void setTema4(String tema4) {
        this.tema4 = tema4;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
