import java.util.ArrayList;
import java.util.Scanner;

public class MainUniversidad{
    /**
     * @param args
     */
    public static void main(String[] args) {

        Universidad universidad1 = new Universidad();
        Sede sede1 = new Sede("central", 100);
        Scanner consola = new Scanner(System.in);

        var menu = "\n----------Menu-----------\n1. Agregar Estudiante\n2. Usar modulo de estadistica\n3. Agregar Sede\n4. SALIR DEL PROGRAMA\n-------------------------";
        System.out.println("Seleccione una opcion: ");
        var condition= true;

        while(condition){

            System.out.println(menu);
            System.out.println("Seleccione una opcion: ");
            int opcion = consola.nextInt();
            consola.nextLine();

            switch(opcion){
                //Caso 1 para agregar un objeto estudiante a la lista en la sede
                case 1:
                    System.out.println("Ingrese el nombre del estudiante ");
                    String nombre = consola.nextLine();
                    System.out.println("Ingrese el apellido: ");
                    String apellido = consola.nextLine();
                    System.out.println("Ingrese el codigo unico del estudiante: ");
                    int codigoUnico = consola.nextInt();
                    consola.nextLine();
                    System.out.println("Ingrese la fecha de nacimiento del estudiante: ");
                    String fechaNacimiento = consola.nextLine();
                    System.out.println("Ingrese el email del estudiante: ");
                    String email = consola.nextLine();
                    System.out.println("Ahora ingrese la cantidad de examenes realizados: ");
                    int cantExamenes = consola.nextInt();
                    consola.nextLine();
                    ArrayList<Examen> examenes = new ArrayList<>();
                    //Ciclo para crear objetos tipo examen y agregarlos a la lista
                    for(int i = 0;i<cantExamenes; i++){
                        System.out.println("Ingrese el nombre de la materia: ");
                        String nombreMateria = consola.nextLine();
                        System.out.println("Ingrese la nota del examen: ");
                        float notaMateria = consola.nextFloat();
                        consola.nextLine();
                        Examen examen1 = new Examen(nombreMateria, notaMateria);
                        examenes.add(examen1);

                    }
                    sede1.agregarEstudiante(nombre, apellido, codigoUnico, fechaNacimiento, email, examenes);
                    System.out.println("Se ha agregado el estudiante exitosamente.");
                    break;
                //Caso 2 para sacar las estadisticas de las notas
                case 2:

                    break;


                //while

                //}


                //universidad1.sede1.agregarEstudiante()
                case 3:

                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    condition = false;
                    break;

            }


        }

    }
}
