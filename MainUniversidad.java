import java.util.Scanner;
import java.util.ArrayList;

public class MainUniversidad {
    /**
     * @param args
     */
    public static void main(String[] args) {

    Universidad universidad1 = new Universidad();
    universidad1.sede1.agregarEstudiante();
    Scanner consola = new Scanner(System.in);

    menu= "\n----------Menu-----------\n1. Agregar Estudiante\n2. Usar modulo de estadistica\n3. Agregar Sede\n4. SALIR DEL PROGRAMA\nSeleccione una opcion";

    condition= true;
    While(condition);{
    System.out.println(menu);
        int opcion = consola.nextInt();
        consola.nextLine();

        Switch(opcion);{
            case1:
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
            System.out.println("Ahora ingrese el examen de la materia realizada y su nota");
            System.out.println();

            //while

            //}


            //universidad1.sede1.agregarEstudiante()
        }

    }
    
    }
}
