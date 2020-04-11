package com.proyectofinal.app.vista;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.proyectofinal.app.R;
import com.proyectofinal.app.vista.principal_fragments.AyudaFragment;
import com.proyectofinal.app.vista.principal_fragments.CuentaUsuarioFragment;
import com.proyectofinal.app.vista.principal_fragments.DiccionarioFragment;
import com.proyectofinal.app.vista.principal_fragments.HomeFragment;
import com.proyectofinal.app.vista.principal_fragments.MetaDiariaFragment;


public class PrincipalActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btnHome;
    private ImageButton btnMetaDiaria;
    private ImageButton btnDiccionario;
    private ImageButton btnAyuda;
    private ImageButton btnCuenta;

    private final AyudaFragment ayudaFragment = new AyudaFragment();
    private final CuentaUsuarioFragment cuentaFragment = new CuentaUsuarioFragment();
    private final DiccionarioFragment diccionarioFragment = new DiccionarioFragment();
    private final MetaDiariaFragment metaDiariaFragment = new MetaDiariaFragment();
    private final HomeFragment homeFragment = new HomeFragment();

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cambiarFragment(homeFragment);
        iniciarComponentes();
        anadirEventos();
    }

    private void iniciarComponentes(){

        toolbar = findViewById(R.id.toolbar);

        btnHome = (ImageButton) toolbar.findViewById(R.id.btn_home);
        btnMetaDiaria = (ImageButton) toolbar.findViewById(R.id.btn_meta);
        btnDiccionario = (ImageButton) toolbar.findViewById(R.id.btn_diccionario);
        btnAyuda = (ImageButton) toolbar.findViewById(R.id.btn_ayuda);
        btnCuenta = (ImageButton) toolbar.findViewById(R.id.btn_cuenta);

        seleccionarIconoDeToolbar(
                R.drawable.ic_home_select, R.drawable.ic_meta,
                R.drawable.ic_diccionario, R.drawable.ic_ayuda, R.drawable.ic_cuenta);
    }

    private void anadirEventos(){
        btnHome.setOnClickListener(this);
        btnMetaDiaria.setOnClickListener(this);
        btnDiccionario.setOnClickListener(this);
        btnAyuda.setOnClickListener(this);
        btnCuenta.setOnClickListener(this);
    }

    private void cambiarFragment(Fragment fragmento){

        FragmentTransaction transaccion = getSupportFragmentManager().beginTransaction();
        transaccion.replace(R.id.contenedor_principal, fragmento);
        transaccion.commit();
    }

    private void seleccionarIconoDeToolbar(int home, int meta, int diccionario, int ayuda, int cuenta){

        btnHome.setBackground(getResources().getDrawable(home));
        btnMetaDiaria.setBackground(getResources().getDrawable(meta));
        btnDiccionario.setBackground(getResources().getDrawable(diccionario));
        btnAyuda.setBackground(getResources().getDrawable(ayuda));
        btnCuenta.setBackground(getResources().getDrawable(cuenta));
    }

    // ----------------- M E T O D O S  D E  I M P L E M E N T A C I O N E S -----------------------
    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_home:

                cambiarFragment(homeFragment);
                seleccionarIconoDeToolbar(
                        R.drawable.ic_home_select, R.drawable.ic_meta,
                        R.drawable.ic_diccionario, R.drawable.ic_ayuda, R.drawable.ic_cuenta);
                break;

            case R.id.btn_meta:


                cambiarFragment(metaDiariaFragment);
                seleccionarIconoDeToolbar(
                        R.drawable.ic_home, R.drawable.ic_meta_select,
                        R.drawable.ic_diccionario, R.drawable.ic_ayuda, R.drawable.ic_cuenta);
                break;

            case R.id.btn_diccionario:

                cambiarFragment(diccionarioFragment);
                seleccionarIconoDeToolbar(
                        R.drawable.ic_home, R.drawable.ic_meta,
                        R.drawable.ic_diccionario_select, R.drawable.ic_ayuda, R.drawable.ic_cuenta);
                break;

            case R.id.btn_ayuda:

                cambiarFragment(ayudaFragment);
                seleccionarIconoDeToolbar(
                        R.drawable.ic_home, R.drawable.ic_meta,
                        R.drawable.ic_diccionario, R.drawable.ic_ayuda_select, R.drawable.ic_cuenta);
                break;

            case R.id.btn_cuenta:

                cambiarFragment(cuentaFragment);
                seleccionarIconoDeToolbar(
                        R.drawable.ic_home, R.drawable.ic_meta,
                        R.drawable.ic_diccionario, R.drawable.ic_ayuda, R.drawable.ic_cuenta_select);
                break;

            default:
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}



