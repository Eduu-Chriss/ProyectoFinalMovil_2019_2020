package com.proyectofinal.app.util;

public class SqlUtils {

    public static final int ID = 0;
    public static final int CORREO = 1;
    public static final int CONTRASENA = 2;
    public static final int PORCENTAJE_TOTAL = 3;
    public static final int PORCENTAJE_INTRO = 4;
    public static final int NOMBRE = 5;
    public static final int META_DIARIA = 6;
    public static final int NIVEL = 7;
    public static final int SESION = 8;
    public static final int SEXO = 9;
    public static final int URL_FOTO = 10;


    public static final String TABLA_CUENTA_USUARIO = "create table CuentaUsuario (" +
            "id integer not null primary key autoincrement," +
            "correo text not null unique," +
            "contrasena text not null," +
            "porcentaje_total integer," +
            "porcentaje_intro integer," +
            "nombre text," +
            "meta_diaria integer," +
            "nivel integer," +
            "sesion integer," +
            "sexo text," +
            "url_foto text)";

    public static final String CREATE_USUARIO_ADMIN = "insert into CuentaUsuario values(" +
            "1,'admin@gmail.com', '123', 0, 0, 'Admin', 1, 0, 1, 'Masculino', 'url')";

    public static String selectUsuario(String correo, String contrasena) {

        return "select * from CuentaUsuario where correo='" + correo + "' and contrasena='" +
                contrasena + "';";
    }

    public static String selectUsuario(String correo) {

        return "select * from CuentaUsuario where correo='" + correo + "'";
    }

}

