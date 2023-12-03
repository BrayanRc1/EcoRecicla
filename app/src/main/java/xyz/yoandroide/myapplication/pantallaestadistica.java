package xyz.yoandroide.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;

public class pantallaestadistica extends AppCompatActivity {
    private BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaestadistica);

        barChart = findViewById(R.id.barChart);
        cargarYMostrarDatos();
    }

    public void actualizarDatos(View view) {
        cargarYMostrarDatos();
    }

    private void cargarYMostrarDatos() {

        SharedPreferences prefs = getSharedPreferences("RegistroPrefs", MODE_PRIVATE);

        Float cantidadEnero = obtenerCantidadParaMes(prefs, "Enero");
        Float cantidadFebrero = obtenerCantidadParaMes(prefs, "Febrero");
        Float cantidadMarzo = obtenerCantidadParaMes(prefs, "Marzo");
        Float cantidadAbril = obtenerCantidadParaMes(prefs, "Abril");
        Float cantidadMayo = obtenerCantidadParaMes(prefs, "Mayo");
        Float cantidadJunio = obtenerCantidadParaMes(prefs, "Junio");
        Float cantidadJulio = obtenerCantidadParaMes(prefs, "Julio");
        Float cantidadAgosto = obtenerCantidadParaMes(prefs, "Agosto");
        Float cantidadSeptiembre = obtenerCantidadParaMes(prefs, "Septiembre");
        Float cantidadOctubre = obtenerCantidadParaMes(prefs, "Octubre");
        Float cantidadNoviembre = obtenerCantidadParaMes(prefs, "Noviembre");
        Float cantidadDiciembre = obtenerCantidadParaMes(prefs, "Diciembre");

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(0, (cantidadEnero)));
        entries.add(new BarEntry(1, (cantidadFebrero)));
        entries.add(new BarEntry(2, (cantidadMarzo)));
        entries.add(new BarEntry(3, (cantidadAbril)));
        entries.add(new BarEntry(4, (cantidadMayo)));
        entries.add(new BarEntry(5, (cantidadJunio)));
        entries.add(new BarEntry(6, (cantidadJulio)));
        entries.add(new BarEntry(7, (cantidadAgosto)));
        entries.add(new BarEntry(8, (cantidadSeptiembre)));
        entries.add(new BarEntry(9, (cantidadOctubre)));
        entries.add(new BarEntry(10, (cantidadNoviembre)));
        entries.add(new BarEntry(11, (cantidadDiciembre)));

        BarDataSet dataSet = new BarDataSet(entries, "Cantidad Reciclada por mes");
        BarData barData = new BarData(dataSet);

        XAxis xAxis = barChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setGranularity(1f);
        xAxis.setValueFormatter(new IndexAxisValueFormatter(new String[]{"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"}));

        barChart.getAxisLeft().setAxisMaximum(100);
        barChart.getAxisRight().setAxisMaximum(100);
        barChart.getAxisRight().setEnabled(false);
        barChart.setBackgroundColor(Color.rgb(224, 228, 228));
        barChart.setData(barData);
        barChart.invalidate();
    }
    private float obtenerCantidadParaMes(SharedPreferences prefs, String mes) {
        try {
            return prefs.getFloat("cantidad_" + mes, 0f);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0;
        }
    }
    public void pantallaSesionIniciada(View view) {
        Intent pantallaSesionIniciada = new Intent(this, activity_pantallainiciosesion.class);
        startActivity(pantallaSesionIniciada);
    }

    public void pantallaCategoria(View view) {
        Intent pantallaCategoria = new Intent(this, categorias.class);
        startActivity(pantallaCategoria);
    }

}