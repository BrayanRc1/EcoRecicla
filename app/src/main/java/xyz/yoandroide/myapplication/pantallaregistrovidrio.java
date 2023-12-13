package xyz.yoandroide.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import xyz.yoandroide.myapplication.Modelos.RegistroBase;

public class pantallaregistrovidrio extends RegistroBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaregistrovidrio);
    }
    public void pantallaCategoria(View view) {
        Intent pantallaCategoria = new Intent(this, categorias.class);
        startActivity(pantallaCategoria);
    }
    public void pantallaestadisticavidrio(View view) {
        Intent pantallaestadisticavidrio = new Intent(this, pantallaestadisticavidrio.class);
        startActivity(pantallaestadisticavidrio);
    }
}