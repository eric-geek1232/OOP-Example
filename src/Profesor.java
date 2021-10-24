import pojos.Persona;

class Profesor extends Persona{
    private double salario;
    private String materia;

    public Profesor(int id, String nombre, int edad, char genero, double salario, String materia) {
        super(id, nombre, edad, genero);
        this.salario = salario;
        this.materia = materia;
    }

    public void darClases(){
        System.out.println("Estoy dando " + this.materia);
    }

    public void dejarTarea(){
        System.out.println("Tiene hacer 7 tareas y para mañana");
    }


    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMateria() {
        return this.materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String asistir() {
        return("El profesor " + super.asistir() + " mediante automovil");
    }

    @Override
    public String toString() {
        String estado = super.toString();
        estado = estado + " Salario: " + this.salario
        + " Materia: " + materia;
        return estado;
    }
}
