package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pantallamasinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallamasinfo);
    }
    public void pantallaInfo1 (View view){
        Intent pantallaInfo1 = new Intent(this, pantallainfo1.class);
        startActivity(pantallaInfo1);
    }
    public void pantallaSesionIniciada (View view){
        Intent pantallaSesionIniciada = new Intent(this, activity_pantallainiciosesion.class);
        startActivity(pantallaSesionIniciada);
    }

}