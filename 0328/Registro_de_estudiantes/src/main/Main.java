
package main;
import estudiante.Estudiante;
import estudiante.EstudianteInternacional;
import estudiante.RegistroEstudiantes;
import java.util.ArrayList;

public class Main {

    
    public static void main(String[] args) {
        // Creando estudiantes
        Estudiante estudiante1 = new Estudiante("Joel", "Larramendia", 21, 9.5);
        Estudiante estudiante2 = new Estudiante("David", "Galeano", 22, 9.0);
        EstudianteInternacional estudianteInternacional1 = new EstudianteInternacional("John", "Cena", 24, 8.8, "EEUU");
        
        // Mostrar la información de estudiantes
        System.out.println("Estudiante 1:");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Apellido: " + estudiante1.getApellido());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Nota promedio: " + estudiante1.getNotaPromedio());
        
        System.out.println("\nEstudiante 2:");
        System.out.println("Nombre: " + estudiante2.getNombre());
        System.out.println("Apellido: " + estudiante2.getApellido());
        System.out.println("Edad: " + estudiante2.getEdad());
        System.out.println("Nota promedio: " + estudiante2.getNotaPromedio());
        
        System.out.println("\nEstudiante internacional 1:");
        System.out.println("Nombre: " + estudianteInternacional1.getNombre());
        System.out.println("Apellido: " + estudianteInternacional1.getApellido());
        System.out.println("Edad: " + estudianteInternacional1.getEdad());
        System.out.println("Nota promedio: " + estudianteInternacional1.getNotaPromedio());
        System.out.println("País de origen: " + estudianteInternacional1.getPaisDeOrigen());
        
        // Crear registro de estudiantes y agregar estudiantes
        RegistroEstudiantes registro = new RegistroEstudiantes();
        registro.agregarEstudiante(estudiante1);
        registro.agregarEstudiante(estudiante2);
        registro.agregarEstudiante(estudianteInternacional1);
        
        // Buscar estudiante por el nombre
        Estudiante estudianteEncontrado = registro.buscarEstudiantePorNombre("Joel");
        if (estudianteEncontrado != null) {
            System.out.println("\nEstudiante encontrado:");
            System.out.println("Nombre: " + estudianteEncontrado.getNombre());
            System.out.println("Apellido: " + estudianteEncontrado.getApellido());
            System.out.println("Edad: " + estudianteEncontrado.getEdad());
            System.out.println("Nota promedio: " + estudianteEncontrado.getNotaPromedio());
        } else {
            System.out.println("\nNo se encontró ningún estudiante con ese nombre.");
        }
        
        // Eliminar estudiante
        registro.eliminarEstudiante(estudiante1);
        
    }
}
    

