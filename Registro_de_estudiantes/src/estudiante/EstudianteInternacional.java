
package estudiante;
import estudiante.Estudiante;


public class EstudianteInternacional extends Estudiante{
    private String paisDeOrigen;
    
    public EstudianteInternacional(String nombre, String apellido, int edad, double notaPromedio, String paisDeOrigen) {
        super(nombre, apellido, edad, notaPromedio);
        this.paisDeOrigen = paisDeOrigen;
    }
    
    public String getPaisDeOrigen(){
        return paisDeOrigen;
    }
    
    public void SetPaisDeOrigen(String paisDeOrigen){
        this.paisDeOrigen = paisDeOrigen;
    }
}
