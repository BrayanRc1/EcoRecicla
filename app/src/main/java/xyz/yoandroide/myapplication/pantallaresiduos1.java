package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pantallaresiduos1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaresiduos1);
    }
    public void pantallaConsejoResiduos(View view){
        Intent pantallaConsejoResiduos = new Intent(this, pantallaresiduos.class);
        startActivity(pantallaConsejoResiduos);
    }
    public void pantallaResiduos2(View view){
        Intent pantallaResiduos2 = new Intent(this, pantallaresiduos2.class);
        startActivity(pantallaResiduos2);
    }
    public void pantallaSesionIniciada(View view){
        Intent pantallaSesionIniciada = new Intent(this, activity_pantallainiciosesion.class);
        startActivity(pantallaSesionIniciada);
    }


}