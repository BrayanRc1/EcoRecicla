package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pantallaterminoscondiciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaterminoscondiciones);
    }

    public void pantallaPrincipal(View view) {
        Intent pantallaPrincipal = new Intent(this, activity_pantallaprincipal.class);
        startActivity(pantallaPrincipal);
    }
    public void pantallaregistro(View view) {
        Intent pantallaregistro = new Intent(this, activity_pantallaregistro.class);
        startActivity(pantallaregistro);
    }
}