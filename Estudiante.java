import java.util.ArrayList;
import java.util.Arrays;

public class Estudiante{
    //Atributos
    private ArrayList<Examen>examenes = new ArrayList<Examen>();
    private String nombre;
    private String apellido;
    private int codigoUnico;
    private String fechaNacimiento;
    private String email;


    public Estudiante() {
    }


    public Estudiante(Examen[] examenes, String nombre, String apellido, int codigoUnico, String fechaNacimiento,
            String email) {
        this.examenes = examenes;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoUnico = codigoUnico;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
    }


    public Examen[] getExamenes() {
        return examenes;
    }


    public void setExamenes(Examen[] examenes) {
        this.examenes = examenes;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getCodigoUnico() {
        return codigoUnico;
    }


    public void setCodigoUnico(int codigoUnico) {
        this.codigoUnico = codigoUnico;
    }


    public String getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Estudiante [examenes=" + Arrays.toString(examenes) + ", nombre=" + nombre + ", apellido=" + apellido
                + ", codigoUnico=" + codigoUnico + ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + "]";
    }

    
    
    
    

}