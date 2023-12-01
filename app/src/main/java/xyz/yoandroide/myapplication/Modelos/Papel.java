package xyz.yoandroide.myapplication.Modelos;

public class Papel {
    private int hojas;
    private float precio;
    private String mes;

    public Papel(int hojas, float precio, String mes){
        this.hojas = hojas;
        this.precio = precio;
        this.mes = mes;
    }

    public int getHojas() {
        return hojas;
    }

    public void setHojas(int hojas) {
        this.hojas = hojas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
