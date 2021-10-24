import pojos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Profesor profesor1 = new Profesor(1, "Pedro", 46, 'M', 20000, "Matematicas");
        Estudiante estudiante1 = new Estudiante(2, "Beto", 15, 'M', 9.0, 5);
        Persona persona = new Persona(2, "Beto", 15, 'M');

        imprimirObj(profesor1);
        imprimirObj(estudiante1);
        imprimirObj(persona);
    }

    static void imprimirObj(Persona object){
        System.out.println(object.asistir());
    }
}
