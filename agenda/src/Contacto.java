public class Contacto {
    private String nombre; 
    private String celular; 
    private String correo;
    private String direccion;

    public Contacto() {
        nombre = "";
        celular = "";
        correo = "";
        direccion = "";
    }

    public Contacto(String nombre, String celular, String correo, String direccion) {
        this.nombre = nombre;
        this.celular = celular;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCelular: " + celular + "\nCorreo: " + correo + "\nDireccion: " + direccion + "\n";
    }
}
