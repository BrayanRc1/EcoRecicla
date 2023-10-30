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
    public void Registro (View view){
        Intent Registro = new Intent(this, activity_pantallaregistro.class);
        startActivity(Registro);
    }
    public void recuperarContrasenia (View view) {
        Intent recuperarContrasenia = new Intent(this, activity_pantallarecuperarcontrasenia.class);
        startActivity(recuperarContrasenia);

    }
    public void iniciarSesion (View view) {
        Intent iniciarSesion = new Intent(this, activity_pantallainiciosesion.class);
        startActivity(iniciarSesion);

    }
}