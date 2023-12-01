package xyz.yoandroide.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class pantallaregistro2 extends AppCompatActivity {

    private EditText editTextCantidad;
    private Spinner spinnerPapel;
    private Spinner spinnerMes;
    private Button buttonRegistrar;
    Button btnpantallaSesionIniciada;
    Button btnpantallaCategoria;
    Intent activity_categorias;
    Intent activity_pantallainiciosesion;

    private static final String PREFS_NAME = "RegistroPrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaregistro2);

        editTextCantidad = findViewById(R.id.editTextCantidad);
        spinnerMes = findViewById(R.id.spinnerMes);
        buttonRegistrar = findViewById(R.id.btnRegistrar);
        spinnerPapel = findViewById(R.id.spinnerPapel);
        activity_categorias = new Intent(this, categorias.class);
        activity_pantallainiciosesion = new Intent(this, activity_pantallainiciosesion.class);

        // Crea un ArrayAdapter por cada elemento del array
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.array_papel, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.array_mes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerPapel.setAdapter(adapter);
        spinnerMes.setAdapter(adapter1);

        buttonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registrarDatos();
            }
        });
    }

    private void registrarDatos() {
        String cantidad = editTextCantidad.getText().toString();
        String papel = spinnerPapel.getSelectedItem().toString();
        String mes = spinnerMes.getSelectedItem().toString();
        if (cantidad.isEmpty() || papel.isEmpty() || mes.isEmpty()) {
            Toast.makeText(this, "Por favor, Completar todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            // Convertir la cantidad a un número decimal
            double cantidadReciclada = Double.parseDouble(cantidad);

            // Almacenar datos en SharedPreferences
            SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();

            // Utilizar claves únicas para cada tipo de dato
            editor.putString("cantidad", cantidad);
            editor.putString("papel", papel);
            editor.putString("mes", mes);

            // Aplicar los cambios
            editor.apply();

            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();

        } catch (NumberFormatException e) {
            // Manejar error si no se puede convertir a un número
            Toast.makeText(this, "Ingrese una cantidad válida", Toast.LENGTH_SHORT).show();
        }

        // Cambio de pantalla a categorias
        btnpantallaCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(activity_categorias);
            }
        });

        //Cambio de pantalla a sesión iniciada
        btnpantallaSesionIniciada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(activity_pantallainiciosesion);
            }
        });
    }
}