package xyz.yoandroide.myapplication.Modelos;

public class Vidrio {
    private int botellasvidrio;
    private float precio;
    private String mes;

    public Vidrio(int botellasvidrio, float precio, String mes) {
        this.botellasvidrio = botellasvidrio;
        this.precio = precio;
        this.mes = mes;
    }

    public int getBotellasvidrio() {
        return botellasvidrio;
    }

    public void setBotellasvidrio(int botellasvidrio) {
        this.botellasvidrio = botellasvidrio;
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

