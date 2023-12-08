package xyz.yoandroide.myapplication.Modelos;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import xyz.yoandroide.myapplication.R;
import xyz.yoandroide.myapplication.activity_pantallainiciosesion;
import xyz.yoandroide.myapplication.categorias;
import xyz.yoandroide.myapplication.pantallaestadisticavidrio;

public class RegistroVidrio extends RegistroBase {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Crea un ArrayAdapter por cada elemento del array
        ArrayAdapter<CharSequence> adapterMaterial = ArrayAdapter.createFromResource(this, R.array.array_vidrio, android.R.layout.simple_spinner_item);
        adapterMaterial.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMaterial.setAdapter(adapterMaterial);
    }
    @Override
    protected void registrarDatos() {
        // Acceder a los elementos de la interfaz ya configurados en RegistroBase
        String cantidad = editTextCantidad.getText().toString();
        String vidrio = spinnerMaterial.getSelectedItem().toString();
        String mes = spinnerMes.getSelectedItem().toString();
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME_VIDRIO, MODE_PRIVATE);

        // Verificar si los campos están vacíos
        if (cantidad.isEmpty() || vidrio.isEmpty() || mes.isEmpty()) {
            Toast.makeText(this, "Por favor, completar todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            // Convertir la cantidad a un número decimal
            double cantidadReciclada = Double.parseDouble(cantidad);
            // cantidad anterior del mes
            float cantidadAnterior = prefs.getFloat("cantidad_" + mes, 0f);
            // Suma de las cantidades
            float cantidadNueva = cantidadAnterior + (float) cantidadReciclada;

            // Almacenar datos en SharedPreferences
            SharedPreferences.Editor editor = prefs.edit();

            // Utilizar claves únicas para cada tipo de dato
            editor.putString("cantidad", cantidad);
            editor.putString("vidrio", vidrio);
            editor.putString("mes", mes);
            editor.putFloat("cantidad_" + mes, cantidadNueva);

            // Aplicar los cambios
            editor.apply();

            // Mostrar mensaje de registro exitoso
            Toast.makeText(this, "Registro de vidrio exitoso", Toast.LENGTH_SHORT).show();

        } catch (NumberFormatException e) {
            // Manejar error si no se puede convertir a un número
            Toast.makeText(this, "Ingrese una cantidad válida", Toast.LENGTH_SHORT).show();
        }

        super.registrarDatos();
    }

    @Override
    protected void btnBorrarRegistro() {

        super.btnBorrarRegistro();
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
    public void pantallaEstadisticavidrio(View view) {
        Intent pantallaEstadisticavidrio = new Intent(this, pantallaestadisticavidrio.class);
        startActivity(pantallaEstadisticavidrio);
    }
}