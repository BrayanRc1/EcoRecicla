package xyz.yoandroide.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import xyz.yoandroide.myapplication.Modelos.RegistroPapel;
import xyz.yoandroide.myapplication.Modelos.RegistroPlastico;
import xyz.yoandroide.myapplication.Modelos.RegistroVidrio;

public class categorias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

    }
    //Cambio de activity a Registro Papel
    public void RegistroPapel(View view){
        Intent RegistroPapel = new Intent(this, RegistroPapel.class);
        startActivity(RegistroPapel);
    }
    //Cambio de activity a Registro Plastico
    public void RegistroPlastico(View view){
        Intent RegistroPlastico = new Intent(this, RegistroPlastico.class);
        startActivity(RegistroPlastico);
    }
    //Cambio de activity a Registro Vidrio
    public void RegistroVidrio(View view){
        Intent RegistroVidrio = new Intent(this, RegistroVidrio.class);
        startActivity(RegistroVidrio);
    }
    //Cambio de activity a Sesion iniciada
    public void pantallaSesionIniciada(View view){
        Intent pantallaSesionIniciada = new Intent(this, activity_pantallainiciosesion.class);
        startActivity(pantallaSesionIniciada);
    }
}