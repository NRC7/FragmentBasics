package com.nrc7.sesionpamela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Mostrar todos los fragmentos que quiera
           al mismo tiempo al iniciar la app*/
        getSupportFragmentManager()
                .beginTransaction()
                // newInstance() == new ListFragment()
                .add(R.id.container, ListFragment.newInstance("Pamela",""), "listFragment")
                // fragmento sin param
                .add(R.id.container2, FotoFragment.newInstance("",""), "fotoFragment")
                .commit();
    }

    @Override
    public void onBackPressed() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, ListFragment.newInstance("Pamela",""), "listFragment")
                .commit();
    }
}