package xyz.yoandroide.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class pantallaregistrovidrio extends AppCompatActivity {

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