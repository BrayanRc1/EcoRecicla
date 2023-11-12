package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pantallaconsejos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaconsejos);
    }

    public void pantallaConsejoAgua(View view){
        Intent pantallaConsejoAgua = new Intent(this, pantallaagua.class);
        startActivity(pantallaConsejoAgua);
    }
    public void pantallaConsejoEnergia(View view){
        Intent pantallaConsejoEnergia = new Intent(this, pantallaenergia.class);
        startActivity(pantallaConsejoEnergia);
    }
    public void pantallaConsejoHogar(View view){
        Intent pantallaConsejoHogar = new Intent(this, pantallahogar.class);
        startActivity(pantallaConsejoHogar);
    }
    public void pantallaConsejoResiduos(View view){
        Intent pantallaConsejoResiduos = new Intent(this, pantallaresiduos.class);
        startActivity(pantallaConsejoResiduos);
    }
    public void pantallaConsejoRecomendacion(View view){
        Intent pantallaConsejoRecomendacion = new Intent(this, recomendaciones.class);
        startActivity(pantallaConsejoRecomendacion);
    }
    public void pantallaSesionIniciada(View view){
        Intent pantallaSesionIniciada = new Intent(this, activity_pantallainiciosesion.class);
        startActivity(pantallaSesionIniciada);
    }
}