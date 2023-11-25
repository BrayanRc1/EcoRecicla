package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import xyz.yoandroide.myapplication.Modelos.Usuarios;

public class activity_pantallaregistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaregistro);

        // Referencias a los elementos de la interfaz
        Intent pantallaPrincipal = new Intent(this, activity_pantallaprincipal.class);
        Button btnregistro = findViewById(R.id.btnregistro);
        EditText editTextNombre = findViewById(R.id.editTextNombre);
        EditText editTextApellido = findViewById(R.id.editTextApellido);
        EditText editTextContrasenia = findViewById(R.id.editTextContrasenia);
        EditText editTextConfirmarContrasenia = findViewById(R.id.editTextConfirmarContrasenia);
        EditText editTextCorreoElectronico = findViewById(R.id.editTextCorreoElectronico);
        RadioButton radioTerminos = findViewById(R.id.radioTerminos);
        RadioButton radioTratamientoDatos = findViewById(R.id.radioTratamientoDatos);

        //Codigo para boton del registro
        btnregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioTerminos.isChecked() && radioTratamientoDatos.isChecked()) {
                    // Si el radiobutton de terminos y/o tratamientos estam activados
                    if (!editTextNombre.getText().toString().isEmpty() && !editTextApellido.getText().toString().isEmpty() &&
                            !editTextContrasenia.getText().toString().isEmpty() && !editTextConfirmarContrasenia.getText().toString().isEmpty()) {
                        if (editTextContrasenia.getText().toString().equals(editTextConfirmarContrasenia.getText().toString())) {
                            if (datosExistentes(editTextCorreoElectronico.getText().toString(), editTextNombre.getText().toString(), editTextApellido.getText().toString())) {
                                Toast.makeText(getApplicationContext(), "El correo nombre y apellido ya existen", Toast.LENGTH_SHORT).show();
                            } else {
                                Usuarios nuevoUsario = new Usuarios(editTextNombre.getText().toString().trim(), editTextApellido.getText().toString().trim(),
                                        editTextCorreoElectronico.getText().toString().trim(), editTextContrasenia.getText().toString().trim());
                                guardarRegistro(nuevoUsario);
                                startActivity(pantallaPrincipal);
                            }
                        } else {
                            Toast.makeText(getApplicationContext(), "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Los campos no pueden estar vacíos",
                                Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Debe aceptar los términos y condiciones, " +
                            "tratamiento de datos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public boolean datosExistentes(String editTextCorreoElectronico, String editTextNombre, String editTextApellido) {
        File file = new File(getFilesDir(), "Datos.txt");

        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            List<String> existingCorreoElectronico = new ArrayList<>();
            List<String> existingApellido = new ArrayList<>();
            List<String> existingNombre = new ArrayList<>();

            while ((line = bufferedReader.readLine())!= null){
                String[] data = line.split(",");
                existingCorreoElectronico.add(data[2]);
                existingApellido.add(data[1]);
                existingNombre.add(data[0]);
            }
            bufferedReader.close();

            return existingCorreoElectronico.contains(editTextCorreoElectronico) || existingApellido.contains(editTextApellido) ||
                    existingNombre.contains(editTextNombre);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
    private void guardarRegistro(Usuarios nuevoUsuario) {
        File file = new File(getFilesDir(), "Datos.txt");

        try {
            FileWriter writer = new FileWriter(file, true); // El segundo parámetro "true" indica que se agregará al final del archivo existente
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            String nuevoRegistro = nuevoUsuario.getEditTextNombre() + "," + nuevoUsuario.getEditTextApellido() +
                    "," + nuevoUsuario.getEditTextCorreo() + "," + nuevoUsuario.getEditTextContrasenia() + "\n";
            bufferedWriter.write(nuevoRegistro);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void pantallaPrincipal(View view){
        Intent pantallaPrincipal = new Intent(this, activity_pantallaprincipal.class);
        startActivity(pantallaPrincipal);
    }

}