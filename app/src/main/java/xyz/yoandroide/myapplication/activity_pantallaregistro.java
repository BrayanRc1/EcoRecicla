package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_pantallaregistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaregistro);
    }

    public void pPrincipal (View view){
        Intent pPrincipal = new Intent(this,activity_pantallaprincipal.class);
        startActivity(pPrincipal);
    }
}