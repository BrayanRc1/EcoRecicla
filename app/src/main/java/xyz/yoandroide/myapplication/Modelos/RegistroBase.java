package xyz.yoandroide.myapplication.Modelos;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import xyz.yoandroide.myapplication.R;

public class RegistroBase extends AppCompatActivity {
    protected EditText editTextCantidad;
    protected Spinner spinnerMaterial;
    protected Spinner spinnerMes;
    protected Button buttonRegistrar;
    protected Button btnBorrarRegistro;

    protected static final String PREFS_NAME_PAPEL = "RegistroPrefsPapel";
    protected static final String PREFS_NAME_PLASTICO = "RegistroPrefsPlastico";
    protected static final String PREFS_NAME_VIDRIO = "RegistroPrefsVidrio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaregistropapel);

        editTextCantidad = findViewById(R.id.editTextCantidad);
        spinnerMes = findViewById(R.id.spinnerMes);
        buttonRegistrar = findViewById(R.id.btnRegistrar);
        spinnerMaterial = findViewById(R.id.spinnerMaterial);
        btnBorrarRegistro = findViewById(R.id.btnBorrarRegistro);

        // Crea un ArrayAdapter por cada elemento del array
        ArrayAdapter<CharSequence> adapterMes = ArrayAdapter.createFromResource(this, R.array.array_mes, android.R.layout.simple_spinner_item);
        adapterMes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMes.setAdapter(adapterMes);

        buttonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registrarDatos();
            }
        });
        btnBorrarRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnBorrarRegistro();
            }
        });
    }

    protected void registrarDatos() {
        String cantidad = editTextCantidad.getText().toString();
        String material = spinnerMaterial.getSelectedItem().toString();
        String mes = spinnerMes.getSelectedItem().toString();

        if (cantidad.isEmpty() || material.isEmpty() || mes.isEmpty()) {
            Toast.makeText(this, "Por favor, completar todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            // Convertir la cantidad a un número decimal
            double cantidadReciclada = Double.parseDouble(cantidad);

            // Obtener el objeto SharedPreferences correspondiente al tipo de material

            SharedPreferences prefs;
            if ("Papel".equals(material)) {
                prefs = getSharedPreferences(PREFS_NAME_PAPEL, MODE_PRIVATE);
            } else if ("Plástico".equals(material)) {
                prefs = getSharedPreferences(PREFS_NAME_PLASTICO, MODE_PRIVATE);
            } else if ("Vidrio".equals(material)) {
                prefs = getSharedPreferences(PREFS_NAME_VIDRIO, MODE_PRIVATE);
            } else {
                // Manejar un tipo de material desconocido
                Toast.makeText(this, "Tipo de material desconocido", Toast.LENGTH_SHORT).show();
                return;
            }
            // cantidad anterior del mes
            float cantidadAnterior = prefs.getFloat("cantidad_" + mes, 0f);
            // Suma de las cantidades
            float cantidadNueva = cantidadAnterior + (float) cantidadReciclada;

            // Almacenar datos en SharedPreferences
            SharedPreferences.Editor editor = prefs.edit();

            // Utilizar claves únicas para cada tipo de dato
            editor.putString("cantidad", cantidad);
            editor.putString("material", material);
            editor.putString("mes", mes);
            editor.putFloat("cantidad_" + mes, cantidadNueva);

            // Aplicar los cambios
            editor.apply();

            Log.d("RegistroBase", "Cantidad anterior: " + cantidadAnterior);
            Log.d("RegistroBase", "Cantidad nueva: " + cantidadNueva);

        } catch (NumberFormatException e) {
            // Manejar error si no se puede convertir a un número
            Toast.makeText(this, "Ingrese una cantidad válida", Toast.LENGTH_SHORT).show();
        }
    }

    protected void btnBorrarRegistro() {
        SharedPreferences prefs;

        // Borrar registros para cada tipo de material
        prefs = getSharedPreferences(PREFS_NAME_PAPEL, MODE_PRIVATE);
        SharedPreferences.Editor editorPapel = prefs.edit();
        editorPapel.clear();
        editorPapel.apply();

        prefs = getSharedPreferences(PREFS_NAME_PLASTICO, MODE_PRIVATE);
        SharedPreferences.Editor editorPlastico = prefs.edit();
        editorPlastico.clear();
        editorPlastico.apply();

        prefs = getSharedPreferences(PREFS_NAME_VIDRIO, MODE_PRIVATE);
        SharedPreferences.Editor editorVidrio = prefs.edit();
        editorVidrio.clear();
        editorVidrio.apply();

        Toast.makeText(this, "Registros borrados", Toast.LENGTH_SHORT).show();
    }
}