package xyz.yoandroide.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class categorias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

    }
    //Cambio de activity a Registro Papel
    public void pantallaRegistropapel(View view){
        Intent pantallaRegistropapel = new Intent(this, pantallaregistro2.class);
        startActivity(pantallaRegistropapel);
    }
    //Cambio de activity a Registro Plastico
    public void pantallaEstadistica2_1(View view){
        Intent pantallaEstadistica2_1 = new Intent(this, pantallaregistro2_1.class);
        startActivity(pantallaEstadistica2_1);
    }
    //Cambio de activity a Registro Vidrio
    public void pantallaEstadistica2_2(View view){
        Intent pantallaEstadistica2_2 = new Intent(this, pantallaregistro2_2.class);
        startActivity(pantallaEstadistica2_2);
    }
    //Cambio de activity a Sesion iniciada
    public void pantallaSesionIniciada(View view){
        Intent pantallaSesionIniciada = new Intent(this, activity_pantallainiciosesion.class);
        startActivity(pantallaSesionIniciada);
    }


}