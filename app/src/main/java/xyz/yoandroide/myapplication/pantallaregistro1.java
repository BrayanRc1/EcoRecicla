package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pantallaregistro1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaregistro1);
    }

    public void pantallaRegistro(View view){
        Intent pantallaRegistro = new Intent(this, activity_pantallaregistro.class);
        startActivity(pantallaRegistro);
    }
    public void pantallaPrincipal(View view){
        Intent pantallaPrincipal = new Intent(this,activity_pantallaprincipal.class);
        startActivity(pantallaPrincipal);
    }

}