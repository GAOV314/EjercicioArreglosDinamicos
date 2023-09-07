public class Examen{
    //Atributos
 private String nombreMateria;
 private float notaMateria;


//Constructor
public Examen(String nombreMateria, float notaMateria){
    nombreMateria = this.nombreMateria;
    notaMateria = this.notaMateria;
}

public Examen(){

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