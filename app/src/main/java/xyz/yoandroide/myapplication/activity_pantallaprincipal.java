package xyz.yoandroide.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import xyz.yoandroide.myapplication.Modelos.Usuarios;

public class activity_pantallaprincipal extends AppCompatActivity {

    Button btnIniciarSesion;
    Button btnRegistrar;
    Button btnOlvidarContrasenia;
    EditText editTexCorreo;
    EditText editTextConstrasenia;
    Intent activity_pantallaregistro;
    Intent activity_pantallainiciosesion;
    Intent activity_pantallarecuperarcontrasenia;
    ArrayList<Usuarios> usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaprincipal);

        // Referencias a los elementos de la interfaz
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        btnOlvidarContrasenia = findViewById(R.id.btnOlvidarContrasenia);
        editTexCorreo = findViewById(R.id.editTexCorreo);
        editTextConstrasenia = findViewById(R.id.editTextConstrasenia);
        activity_pantallaregistro = new Intent(this, activity_pantallaregistro.class);
        activity_pantallainiciosesion = new Intent(this, activity_pantallainiciosesion.class);
        activity_pantallarecuperarcontrasenia = new Intent(this, activity_pantallarecuperarcontrasenia.class);

        // Lectura de datos del archivo Data.txt
        usuarios = new ArrayList<>();
        File file = new File(getFilesDir(), "Datos.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                // Se crea una linea separada con comas
                String[] userData = line.split(",");
                String nombre = userData[0];
                String apellido = userData[1];
                String correo = userData[2];
                String contrasenia = userData[3];
                // Crear un objeto Usuario y añadirlo a la lista de usuarios
                Usuarios nuevoUsuario = new Usuarios(nombre, apellido, correo, contrasenia);
                usuarios.add(nuevoUsuario);
            }
            reader.close();

            // Imprimir información de los usuarios leídos en el archivo
            for (Usuarios usuario : usuarios) {
                Log.d("Usuarios",
                        "Nombre: " + usuario.getEditTextNombre() + ", Apellido: " + usuario.getEditTextApellido() +
                                ", Correo: " + usuario.getEditTextCorreo() + ", Contraseña: " + usuario.getEditTextContrasenia());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Boton de ingreso y comparacion de contraseña y correo
        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputCorreo = editTexCorreo.getText().toString().trim();
                String inputContrasenia = editTextConstrasenia.getText().toString().trim();

                Log.d("InicioSesion", "Input Correo: " + inputCorreo + ", Input Contraseña: " + inputContrasenia);

                if (!inputCorreo.isEmpty() && !inputContrasenia.isEmpty()){
                    for (Usuarios usuario : usuarios) {
                        Log.d("InicioSesion", "Comparando con usuario: " + usuario.getEditTextCorreo() + ", Contraseña: " + usuario.getEditTextContrasenia());
                        if (usuario.getEditTextCorreo().equalsIgnoreCase(inputCorreo) &&
                        usuario.getEditTextContrasenia().equalsIgnoreCase(inputContrasenia)){
                            startActivity(activity_pantallainiciosesion);
                            return;
                        }
                    }
                    Toast.makeText(getApplicationContext(),"\"Usuario y/o contraseña incorrectos\"", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Los campos no pueden estar vacíos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Cambio de pantalla a registro de usuario
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar la actividad de registro de usuario
                startActivity(activity_pantallaregistro);
            }
        });

        // Cambio de pantalla a recuperar contraseña de usuario
        btnOlvidarContrasenia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(activity_pantallarecuperarcontrasenia);
            }
        });

    }
}