package xyz.yoandroide.myapplication.Modelos;

public class Usuarios {
    private String editTextNombre;
    private String editTextApellido;
    private String editTextCorreo;
    private String editTextContrasenia;

    public Usuarios(String editTextNombre, String editTextApellido, String editTextCorreo, String editTextContrasenia){
        this.editTextNombre = editTextNombre;
        this.editTextApellido = editTextApellido;
        this.editTextCorreo = editTextCorreo;
        this.editTextContrasenia = editTextContrasenia;
    }

    public String getEditTextNombre() {
        return editTextNombre;
    }

    public void setEditTextNombre(String editTextNombre) {
        this.editTextNombre = editTextNombre;
    }

    public String getEditTextApellido() {
        return editTextApellido;
    }

    public void setEditTextApellido(String editTextApellido) {
        this.editTextApellido = editTextApellido;
    }

    public String getEditTextCorreo() {
        return editTextCorreo;
    }

    public void setEditTextCorreo(String editTextCorreo) {
        this.editTextCorreo = editTextCorreo;
    }

    public String getEditTextContrasenia() {
        return editTextContrasenia;
    }

    public void setEditTextContrasenia(String editTextContrasenia) {
        this.editTextContrasenia = editTextContrasenia;
    }
}
