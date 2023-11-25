package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class pantallaregistro2 extends AppCompatActivity {

    Button btnpantallaCategoria;
    Button btnpantallaSesionIniciada;
    Intent categorias;
    Intent activity_pantallainiciosesion;

    private Spinner spinnerCategoria, spinnerMes;
    private EditText editTextKilosPlastico, editTextHojasPapel;
    private Button btnGuardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaregistro2);

        // Referencias a los elementos de la interfaz
        spinnerCategoria = findViewById(R.id.spinnerCategoria);
        spinnerMes = findViewById(R.id.spinnerMes);
        editTextKilosPlastico = findViewById(R.id.editTextKilosPlastico);
        editTextHojasPapel = findViewById(R.id.editTextHojasPapel);
        btnGuardar = findViewById(R.id.btnGuardar);

        // Configurar adaptadores para spinners
        ArrayAdapter<CharSequence> categoriaAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.categorias_array,
                android.R.layout.simple_spinner_item
        );
        categoriaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCategoria.setAdapter(categoriaAdapter);

        ArrayAdapter<CharSequence> mesAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.meses_array,
                android.R.layout.simple_spinner_item
        );
        mesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMes.setAdapter(mesAdapter);

        // Configurar clic del botón
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guardarDatos();
            }
        });
    }

    private void guardarDatos() {
        // Aquí puedes obtener los valores ingresados por el usuario
        String categoria = spinnerCategoria.getSelectedItem().toString();
        String mes = spinnerMes.getSelectedItem().toString();
        String kilosPlastico = editTextKilosPlastico.getText().toString();
        String hojasPapel = editTextHojasPapel.getText().toString();

        // Aquí puedes realizar la lógica de almacenamiento o envío de datos
        // Por ahora, solo mostraremos un mensaje de ejemplo
        String mensaje = "Categoria: " + categoria + "\nMes: " + mes + "\nKilos Plástico: " +
                kilosPlastico + "\nHojas Papel: " + hojasPapel;

        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();


        // Cambio de pantalla a registro de categorias papel, plastico y vidrio
        btnpantallaCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(categorias);
            }
        });
        // Cambio de pantalla a la sesion iniciada
        btnpantallaSesionIniciada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(activity_pantallainiciosesion);
            }
        });
    }
}