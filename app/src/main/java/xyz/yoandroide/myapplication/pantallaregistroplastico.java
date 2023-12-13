package xyz.yoandroide.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import xyz.yoandroide.myapplication.Modelos.RegistroBase;

public class pantallaregistroplastico extends RegistroBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaregistroplastico);
    }
    public void pantallaCategoria(View view) {
        Intent pantallaCategoria = new Intent(this, categorias.class);
        startActivity(pantallaCategoria);
    }
    public void pantallaestadisticaplastico(View view) {
        Intent pantallaestadisticaplastico = new Intent(this, pantallaestadisticaplastico.class);
        startActivity(pantallaestadisticaplastico);
    }
}