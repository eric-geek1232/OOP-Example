package pojos;
public class Persona {
    protected int id;
    protected String nombre;
    protected int edad;
    protected char genero;

    public Persona(int id, String nombre, int edad, char genero){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String asistir(){
        return(this.nombre + " ha asistido a clases");
    }

    public void comer(){
        System.out.println(this.nombre + " ha desayunado");
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        String estado = "Id: " + this.id + " Nombre: " + this.nombre
        + " Genero: " + this.genero + " Edad: " + this.edad;
        return estado;
    }
}
