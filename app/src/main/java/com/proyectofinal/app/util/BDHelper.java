package com.proyectofinal.app.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.proyectofinal.app.modelo.CuentaPhone;
import com.proyectofinal.app.modelo.Usuario;
import com.proyectofinal.app.servicios.UsuariosService;

public class BDHelper extends SQLiteOpenHelper {

    private  Context context;

    public static CuentaPhone cuentaPhone;

    private final UsuariosService usuariosService = new UsuariosService();

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
            cuentaPhone = new CuentaPhone();
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

    public boolean existeUsuarioLocal(String correo){

        Cursor cursor = this.getReadableDatabase()
                .rawQuery(SqlUtils.selectUsuario(correo), null);

        try{
            cursor.moveToFirst();
            int id = cursor.getInt(SqlUtils.ID);
            return true;

        }catch(Exception e){

            return false;
        }
    }

    public boolean registrarUsuario(Usuario usuario){

        if(usuariosService.postUsuario(usuario)){

            cuentaPhone = new CuentaPhone();
            cuentaPhone.setCorreo(usuario.getCorreo());
            cuentaPhone.setContrasena(usuario.getContrasena());
            cuentaPhone.setPorcentajeTotal(0);
            cuentaPhone.setPorcentajeIntro(0);
            cuentaPhone.setNombre(usuario.getNombre());
            cuentaPhone.setMetaDiaria(1);
            cuentaPhone.setNivel(0);
            cuentaPhone.setSesion(1);
            cuentaPhone.setSexo(usuario.getSexo());
            cuentaPhone.setUrlFoto(usuario.getUrlFoto());

            guardarUsuarioLocal(cuentaPhone);
            return true;
        }
        return false;
    }

    public boolean guardarUsuarioLocal(CuentaPhone cuentaPhone){

        this.cuentaPhone = cuentaPhone;

        ContentValues contenedor = new ContentValues();
        contenedor.put("correo",cuentaPhone.getCorreo());
        contenedor.put("contrasena", cuentaPhone.getContrasena());
        contenedor.put("porcentaje_total", cuentaPhone.getPorcentajeTotal());
        contenedor.put("porcentaje_intro", cuentaPhone.getPorcentajeIntro());
        contenedor.put("nombre",cuentaPhone.getNombre());
        contenedor.put("meta_diaria", cuentaPhone.getMetaDiaria() );
        contenedor.put("nivel", cuentaPhone.getNivel());
        contenedor.put("sesion", cuentaPhone.getSesion());
        contenedor.put("sexo", cuentaPhone.getSexo());
        contenedor.put("url_foto", cuentaPhone.getUrlFoto());

        return (this.getReadableDatabase().insert("CuentaUsuario", null, contenedor))>0;
    }
}
