package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class categorias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

    }

    public void pantallaRegistropapel(View view){
        Intent pantallaRegistropapel = new Intent(this, pantallaregistro2.class);
        startActivity(pantallaRegistropapel);
    }
    public void pantallaRegistroplastico(View view){
        Intent pantallaRegistroplastico = new Intent(this, pantallaregistro4.class);
        startActivity(pantallaRegistroplastico);
    }
    public void pantallaRegistrovidrio(View view){
        Intent pantallaRegistrovidrio = new Intent(this, pantallaregistro3.class);
        startActivity(pantallaRegistrovidrio);
    }
    public void pantallaSesionIniciada(View view){
        Intent pantallaSesionIniciada = new Intent(this, activity_pantallainiciosesion.class);
        startActivity(pantallaSesionIniciada);
    }


}