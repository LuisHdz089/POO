package Clases;

public class Persona {
    private int id_persona;
    private String nombre;
    private String ape_paterno;
    private String ape_materno;
    private int edad;

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id_persona=" + id_persona +
                ", nombre='" + nombre + '\'' +
                ", ape_paterno='" + ape_paterno + '\'' +
                ", ape_materno='" + ape_materno + '\'' +
                ", edad=" + edad +
                '}';
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe_paterno() {
        return ape_paterno;
    }

    public void setApe_paterno(String ape_paterno) {
        this.ape_paterno = ape_paterno;
    }

    public String getApe_materno() {
        return ape_materno;
    }

    public void setApe_materno(String ape_materno) {
        this.ape_materno = ape_materno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
