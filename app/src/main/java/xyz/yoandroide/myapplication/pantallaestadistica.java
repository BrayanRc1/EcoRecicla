package xyz.yoandroide.myapplication;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class pantallaestadistica extends AppCompatActivity {
    private BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaestadistica);

        barChart = findViewById(R.id.barChart);

    SharedPreferences prefs = getSharedPreferences("RegistroPrefs", MODE_PRIVATE);

    String cantidad = prefs.getString("cantidad", "");
    String material = prefs.getString("material", "");
    String mes = prefs.getString("mes", "");

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(0, Float.parseFloat(cantidad)));

        BarDataSet dataSet = new BarDataSet(entries, "Cantidad Reciclada");
        BarData barData = new BarData(dataSet);

        barChart.setData(barData);
        barChart.invalidate();

    }
}