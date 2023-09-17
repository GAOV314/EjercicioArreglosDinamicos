import java.util.ArrayList;
import java.util.Scanner;
//Atributos
public class Sede{
    private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    private String localizacion;

//Constructor vacio
    public Sede(){

    }
//Constructor
    public Sede(String localizacion) {
        this.localizacion = localizacion;
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
    //public void moduloEstadisticaPromedio(float suma){
        //suma
            //}


        //}

    //}

}