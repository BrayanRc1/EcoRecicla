package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pantallaresiduos3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaresiduos3);
    }

    public void pantallaResiduos2 (View view){
        Intent pantallaResiduos2 = new Intent(this, pantallaresiduos2.class);
        startActivity(pantallaResiduos2);
    }
    public void pantallaResiduos4 (View view){
        Intent pantallaResiduos4 = new Intent(this, pantallaresiduos4.class);
        startActivity(pantallaResiduos4);
    }
    public void pantallaSesionIniciada (View view){
        Intent pantallaSesionIniciada = new Intent(this, activity_pantallainiciosesion.class);
        startActivity(pantallaSesionIniciada);
    }
}