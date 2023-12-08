package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_pantallainiciosesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallainiciosesion);

    }
    public void pantallaPrincipal(View view){
        Intent pantallaPrincipal = new Intent(this,activity_pantallaprincipal.class);
        startActivity(pantallaPrincipal);
    }
    public void pantallaCategoria(View view){
        Intent pantallaCategoria = new Intent(this,categorias.class);
        startActivity(pantallaCategoria);
    }
    public void pantallaestadisticageneral(View view){
        Intent pantallaestadisticageneral = new Intent(this, pantallaestadisticageneral.class);
        startActivity(pantallaestadisticageneral);
    }
    public void pantallaConsejos(View view){
        Intent pantallaConsejos = new Intent(this,pantallaconsejos.class);
        startActivity(pantallaConsejos);
    }
    public void pantallaMasinfo(View view){
        Intent pantallaMasinfo = new Intent(this,pantallamasinfo.class);
        startActivity(pantallaMasinfo);
    }

}