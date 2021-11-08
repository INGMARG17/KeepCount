package com.example.keepcount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodo para pasar a registrar usuario

    public void registrarUsuario(View view){
        Intent registro = new Intent(this,Registro.class );
        startActivity(registro);

    }
}