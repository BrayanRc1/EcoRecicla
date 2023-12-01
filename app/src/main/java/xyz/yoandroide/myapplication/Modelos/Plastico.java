package xyz.yoandroide.myapplication.Modelos;

public class Plastico {
    private int botellasplastico;
    private float precio;
    private String mes;

    public Plastico(int botellasplastico, float precio, String mes){
        this.botellasplastico = botellasplastico;
        this.precio = precio;
        this.mes = mes;
    }

    public int getBotellasplastico() {
        return botellasplastico;
    }

    public void setBotellasplastico(int botellasplastico) {
        this.botellasplastico = botellasplastico;
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
