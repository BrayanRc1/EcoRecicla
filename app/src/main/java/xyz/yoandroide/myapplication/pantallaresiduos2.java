package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pantallaresiduos2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaresiduos2);
    }

    public void pantallaResiduos1 (View view){
        Intent pantallaResiduos1 = new Intent(this, pantallaresiduos1.class);
        startActivity(pantallaResiduos1);
    }
    public void pantallaResiduos3 (View view){
        Intent pantallaResiduos1 = new Intent(this, pantallaresiduos3.class);
        startActivity(pantallaResiduos1);
    }
    public void pantallaSesionIniciada (View view){
        Intent pantallaSesionIniciada = new Intent(this, activity_pantallainiciosesion.class);
        startActivity(pantallaSesionIniciada);
    }
}