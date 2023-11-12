package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pantallainfo2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallainfo2);
    }
    public void pantallaInfo1 (View view){
        Intent pantallaInfo1 = new Intent(this, pantallainfo1.class);
        startActivity(pantallaInfo1);
    }
    public void pantallaInfo3 (View view){
        Intent pantallaInfo3 = new Intent(this, pantallainfo3.class);
        startActivity(pantallaInfo3);
    }
}