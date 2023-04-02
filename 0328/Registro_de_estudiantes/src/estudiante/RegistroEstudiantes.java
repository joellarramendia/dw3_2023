
package estudiante;
import estudiante.Estudiante;
import java.util.ArrayList;

public class RegistroEstudiantes {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }

    public Estudiante buscarEstudiantePorNombre(String nombre) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equals(nombre)) {
                return estudiante;
            }
        }
        return null;
    }
}
