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

public class pantallaregistro2_2 extends AppCompatActivity {

    private EditText editTextCantidad;
    private Spinner spinnerVidrio;
    private Spinner spinnerMes;
    private Button buttonRegistrar;
    private Button btnBorrarRegistro;


    private static final String PREFS_NAME = "RegistroPrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaregistro2);

        editTextCantidad = findViewById(R.id.editTextCantidad);
        spinnerMes = findViewById(R.id.spinnerMes);
        buttonRegistrar = findViewById(R.id.btnRegistrar);
        btnBorrarRegistro = findViewById(R.id.btnBorrarRegistro);

        // Crea un ArrayAdapter por cada elemento del array
        ArrayAdapter<CharSequence> adapterVidrio = ArrayAdapter.createFromResource(this, R.array.array_vidrio, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapterMes = ArrayAdapter.createFromResource(this, R.array.array_mes, android.R.layout.simple_spinner_item);
        adapterVidrio.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterMes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerVidrio.setAdapter(adapterVidrio);
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

    private void registrarDatos() {
        String cantidad = editTextCantidad.getText().toString();
        String vidrio = spinnerVidrio.getSelectedItem().toString();
        String mes = spinnerMes.getSelectedItem().toString();

        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        if (cantidad.isEmpty() || vidrio.isEmpty() || mes.isEmpty()) {
            Toast.makeText(this, "Por favor, Completar todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            // Convertir la cantidad a un número decimal
            double cantidadReciclada = Double.parseDouble(cantidad);
            // cantidad anterior del mes
            float cantidadAnterior = prefs.getFloat("cantidad_" + mes, 0f);
            // Suma de las cantidades
            float catidadRecicladaFloat = (float) cantidadReciclada;
            float cantidadNueva = cantidadAnterior + catidadRecicladaFloat;

            // Almacenar datos en SharedPreferences
            SharedPreferences.Editor editor = prefs.edit();

            // Utilizar claves únicas para cada tipo de dato
            editor.putString("cantidad", cantidad);
            editor.putString("vidrio", vidrio);
            editor.putString("mes", mes);
            editor.putFloat("cantidad_" + mes, cantidadNueva);

            // Aplicar los cambios
            editor.apply();

            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();

        } catch (NumberFormatException e) {
            // Manejar error si no se puede convertir a un número
            Toast.makeText(this, "Ingrese una cantidad válida", Toast.LENGTH_SHORT).show();
        }

    }
    private void btnBorrarRegistro(){
        SharedPreferences prefs = getSharedPreferences("RegistroPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        editor.clear();
        editor.apply();
        Toast.makeText(this, "Registros borrados", Toast.LENGTH_SHORT).show();
    }
    //Boton Inicio nos lleva a pantalla de la sesión iniciada
    public void pantallaSesionIniciada(View view) {
        Intent pantallaSesionIniciada = new Intent(this, activity_pantallainiciosesion.class);
        startActivity(pantallaSesionIniciada);
    }

    //Boton atras nos lleva a pantalla categorias
    public void pantallaCategoria(View view) {
        Intent pantallaCategoria = new Intent(this, categorias.class);
        startActivity(pantallaCategoria);
    }
    //Botton estadistica nos lleva a pantalla estadistica
    public void pantallaEstadistica(View view) {
        Intent pantallaEstadistica = new Intent(this, pantallaestadistica.class);
        startActivity(pantallaEstadistica);
    }
}