package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pantallaresiduos4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaresiduos4);
    }
    public void pantallaResiduos3 (View view){
        Intent pantallaResiduos3 = new Intent(this, pantallaresiduos3.class);
        startActivity(pantallaResiduos3);
    }
    public void pantallaResiduos5 (View view){
        Intent pantallaResiduos5 = new Intent(this, pantallaresiduos5.class);
        startActivity(pantallaResiduos5);
    }
    public void pantallaSesionIniciada (View view){
        Intent pantallaSesionIniciada = new Intent(this, activity_pantallainiciosesion.class);
        startActivity(pantallaSesionIniciada);
    }
}