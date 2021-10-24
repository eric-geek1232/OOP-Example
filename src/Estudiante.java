import pojos.Persona;

class Estudiante extends Persona{
    private double promedio;
    private int grado;

    public Estudiante(int id, String nombre, int edad, char genero, double promedio, int grado){
        super(id, nombre, edad, genero);
        this.promedio = promedio;
        this.grado = grado;
    }

    public void realizarTareas(){
        System.out.println("Estoy realizando la tarea");
    }

    public void ponerAtencion(){
        System.out.println("Yo " + super.nombre + " estoy poniendo atencion");
    }

    public double getPromedio() {
        return this.promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getGrado() {
        return this.grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public String asistir() {
        return("El estudiante " + super.asistir() + " mediante autobus");
    }

    @Override
    public String toString() {
        String estado = super.toString();
        estado = estado + " Promedio: " + this.promedio 
        + " Grado: " + this.grado;
        return estado;
    }
}
