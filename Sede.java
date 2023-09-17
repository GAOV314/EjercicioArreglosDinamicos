import java.util.ArrayList;
import java.util.Scanner;
//Atributos
public class Sede{
    private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    private String localizacion;
    private int cantEstudiantes;

//Constructor vacio
    public Sede(){

    }
//Constructor
    public Sede(String localizacion, int cantEstudiantes) {
        this.localizacion = localizacion;
        this.cantEstudiantes = cantEstudiantes;
    }

//Gets y sets
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


    /*@Override
    public String toString() {
        return "Sede [estudiantes=" + estudiantes + ", localizacion=" + localizacion + ", cantEstudiantes="
                + cantEstudiantes + "]";
    }*/
//Metodo para agregar un estudiante
    public void agregarEstudiante(String nombre, String apellido, int codigoUnico, String fechaNacimiento, String email, ArrayList<Examen> examenes){

        Estudiante estudiante1 = new Estudiante(nombre,apellido,codigoUnico,fechaNacimiento,email,examenes);
        estudiantes.add(estudiante1);
    }
    //Metodo para sacar promedio
    public float moduloEstadisticaPromedio(){
        for (Estudiante item : estudiantes){
            for(Examen item2: item.getExamenes()){
                float sumaNotas = item2.getNotaMateria();


            }


        }

    }

}