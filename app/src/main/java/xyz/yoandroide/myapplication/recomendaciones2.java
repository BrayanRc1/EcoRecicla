package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class recomendaciones2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendaciones2);
    }
    public void pantallaRecomendaciones(View view){
        Intent pantallaConsejoRecomendacion = new Intent(this, recomendaciones.class);
        startActivity(pantallaConsejoRecomendacion);
    }
    public void pantallaSesionIniciada(View view){
        Intent pantallaSesionIniciada = new Intent(this, activity_pantallainiciosesion.class);
        startActivity(pantallaSesionIniciada);
    }
}