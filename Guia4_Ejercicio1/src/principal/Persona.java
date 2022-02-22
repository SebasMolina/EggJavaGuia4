package principal;

public class Persona {
    //nombre, apellido, edad, documento y Perro.
    private String nombre;
    private String apellido;
    private String documento;
    private int edad;
    private Perro perro;

    public Persona() {
    }
    
    public Persona(String apellido, String nombre, String documento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return String.format("DNI: %s | %s %s |Edad: %s. Adoptó a %s", documento, apellido, nombre, edad, perro);
    }                                         //fijarse si no da error
    
    
}
