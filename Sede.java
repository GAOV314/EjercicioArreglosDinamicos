import java.util.ArrayList;

//Atributos
public class Sede{
    private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    private String localizacion;
    private int cantEstudiantes;
    
    
    public Sede() {
    }


    public Sede(ArrayList<Estudiante> estudiantes, String localizacion, int cantEstudiantes) {
        this.estudiantes = estudiantes;
        this.localizacion = localizacion;
        this.cantEstudiantes = cantEstudiantes;
    }


    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }


    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }


    public String getLocalizacion() {
        return localizacion;
    }


    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }


    public int getCantEstudiantes() {
        return cantEstudiantes;
    }


    public void setCantEstudiantes(int cantEstudiantes) {
        this.cantEstudiantes = cantEstudiantes;
    }


    @Override
    public String toString() {
        return "Sede [estudiantes=" + estudiantes + ", localizacion=" + localizacion + ", cantEstudiantes="
                + cantEstudiantes + "]";
    }

    public void agregarEstudiante(String nombre, String apellido, int codigoUnico, String fechaNacimiento, String email, ArrayList<Examen> examenes){
        Estudiante estudiante1 = new Estudiante(nombre,apellido,codigoUnico,fechaNacimiento,email, ArrayList<Examen> examenes);
        estudiantes.add(Estudiante1);
    }
    

}