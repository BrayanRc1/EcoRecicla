package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class recomendaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendaciones);
    }

    public void pantallaRecomendacionesPapel (View view){
        Intent pantallaRecomendacionesPapel = new Intent(this, recomendaciones1.class);
        startActivity(pantallaRecomendacionesPapel);
    }
    public void pantallaRecomendacionesPlastico (View view){
        Intent pantallaRecomendacionesPlastico = new Intent(this, recomendaciones2.class);
        startActivity(pantallaRecomendacionesPlastico);
    }
    public void pantallaRecomendacionesVidrio (View view){
        Intent pantallaRecomendacionesVidrio = new Intent(this, recomendaciones3.class);
        startActivity(pantallaRecomendacionesVidrio);
    }
    public void pantallaSesionIniciada(View view){
        Intent pantallaSesionIniciada = new Intent(this, activity_pantallainiciosesion.class);
        startActivity(pantallaSesionIniciada);
    }
}