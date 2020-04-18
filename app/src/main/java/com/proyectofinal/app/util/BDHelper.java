package com.proyectofinal.app.util;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.proyectofinal.app.modelo.CuentaPhone;

public class BDHelper extends SQLiteOpenHelper {

    private  Context context;

    public static final CuentaPhone cuentaPhone = new CuentaPhone();

    public BDHelper(Context context){

        super(context, "BDLocalJaguar", null, 1);
        this.context = context;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SqlUtils.TABLA_CUENTA_USUARIO);
        db.execSQL(SqlUtils.CREATE_USUARIO_ADMIN);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists CuentaUsuario");
        onCreate(db);
    }

    // ----------------------------- MÉTODOS DEL CRUD -----------------------------------------
    public boolean validarSesion(String correo, String contrasena){

        Cursor cursor = this.getReadableDatabase()
                .rawQuery(SqlUtils.selectUsuario(correo,contrasena), null);


        try{

            cursor.moveToFirst();
            cuentaPhone.setIdCuenta(cursor.getInt(SqlUtils.ID));
            cuentaPhone.setCorreo(cursor.getString(SqlUtils.CORREO));
            cuentaPhone.setContrasena(cursor.getString(SqlUtils.CONTRASENA));
            cuentaPhone.setPorcentajeTotal(cursor.getInt(SqlUtils.PORCENTAJE_TOTAL));
            cuentaPhone.setPorcentajeIntro(cursor.getInt(SqlUtils.PORCENTAJE_INTRO));
            cuentaPhone.setNombre(cursor.getString(SqlUtils.NOMBRE));
            cuentaPhone.setMetaDiaria(cursor.getInt(SqlUtils.META_DIARIA));
            cuentaPhone.setNivel(cursor.getInt(SqlUtils.NIVEL));
            cuentaPhone.setSesion(cursor.getInt(SqlUtils.SESION));
            cuentaPhone.setSexo(cursor.getString(SqlUtils.SEXO));
            cuentaPhone.setUrlFoto(cursor.getString(SqlUtils.URL_FOTO));


            return  true;

        }catch (Exception e){


            return false;
        }
    }
}
