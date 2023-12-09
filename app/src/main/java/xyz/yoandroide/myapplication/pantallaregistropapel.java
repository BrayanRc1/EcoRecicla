package xyz.yoandroide.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import xyz.yoandroide.myapplication.Modelos.RegistroBase;

public class pantallaregistropapel extends RegistroBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaregistropapel);
    }
    public void pantallaCategoria(View view) {
        Intent pantallaCategoria = new Intent(this, categorias.class);
        startActivity(pantallaCategoria);
    }
    public void pantallaestadisticapapel(View view) {
        Intent pantallaestadisticapapel = new Intent(this, pantallaestadisticapapel.class);
        startActivity(pantallaestadisticapapel);
    }
}