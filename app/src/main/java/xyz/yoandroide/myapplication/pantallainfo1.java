package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pantallainfo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallainfo1);
    }
    public void pantallaMasinfo (View view){
        Intent pantallaMasinfo = new Intent(this, pantallamasinfo.class);
        startActivity(pantallaMasinfo);
    }
    public void pantallaInfo2 (View view){
        Intent pantallaInfo2 = new Intent(this, pantallainfo2.class);
        startActivity(pantallaInfo2);
    }
    public void pantallaSesionIniciada (View view){
        Intent pantallaSesionIniciada = new Intent(this, activity_pantallainiciosesion.class);
        startActivity(pantallaSesionIniciada);
    }
}