package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_pantallaprincipal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaprincipal);

    }
    public void pantallaRegistro(View view){
        Intent pantallaRegistro = new Intent(this, pantallaregistro1.class);
        startActivity(pantallaRegistro);
    }

    public void recuperarContrasenia (View view) {
        Intent recuperarContrasenia = new Intent(this, activity_pantallarecuperarcontrasenia.class);
        startActivity(recuperarContrasenia);

    }
    public void pantallaSesionIniciada(View view) {
        Intent pantallaSesionIniciada = new Intent(this, activity_pantallainiciosesion.class);
        startActivity(pantallaSesionIniciada);

    }
}