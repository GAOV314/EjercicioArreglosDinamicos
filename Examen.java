/**
 * Gadiel Amir Ocana Veliz
 * 231270
 * Programacion Orientada a Objetos
 * Ejercicio Arreglos dinamicos
 */
public class Examen{
    //Atributos
    private String nombreMateria;
    private float notaMateria;


    //Constructor
    public Examen(String nombreMateria, float notaMateria){
        this.nombreMateria = nombreMateria;
        this.notaMateria = notaMateria;
    }


    //Get y sets
    public String getNombreMateria() {
        return nombreMateria;
    }
    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    public float getNotaMateria() {
        return notaMateria;
    }
    public void setNotaMateria(float notaMateria) {
        this.notaMateria = notaMateria;
    }

    @Override
    public String toString() {
        return "Examen [nombreMateria=" + nombreMateria + ", notaMateria=" + notaMateria + "]";
    }



}