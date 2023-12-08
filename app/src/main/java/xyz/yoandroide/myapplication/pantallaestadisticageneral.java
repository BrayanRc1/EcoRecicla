package xyz.yoandroide.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import xyz.yoandroide.myapplication.Modelos.RegistroPapel;
import xyz.yoandroide.myapplication.Modelos.RegistroPlastico;
import xyz.yoandroide.myapplication.Modelos.RegistroVidrio;

public class pantallaestadisticageneral extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaestadisticageneral);
    }
    //Cambio de activity a Registro Papel
    public void pantallaEstadisticapapel(View view) {
        Intent pantallaEstadisticapapel = new Intent(this, pantallaestadisticapapel.class);
        startActivity(pantallaEstadisticapapel);
    }
    //Cambio de activity a Registro Plastico
    public void pantallaEstadisticaplastico(View view) {
        Intent pantallaEstadisticaplastico = new Intent(this, pantallaestadisticaplastico.class);
        startActivity(pantallaEstadisticaplastico);
    }
    //Cambio de activity a Registro Vidrio
    public void pantallaEstadisticavidrio(View view) {
        Intent pantallaEstadisticavidrio = new Intent(this, pantallaestadisticavidrio.class);
        startActivity(pantallaEstadisticavidrio);
    }
    //Cambio de activity a Sesion iniciada
    public void pantallaSesionIniciada(View view){
        Intent pantallaSesionIniciada = new Intent(this, activity_pantallainiciosesion.class);
        startActivity(pantallaSesionIniciada);
    }
    //Cambio de activity a categorias
    public void pantallaCategoria(View view) {
        Intent pantallaCategoria = new Intent(this, categorias.class);
        startActivity(pantallaCategoria);
    }
}