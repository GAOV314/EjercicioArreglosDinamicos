/**
 * Gadiel Amir Ocana Veliz
 * 231270
 * Programacion Orientada a Objetos
 * Ejercicio Arreglos dinamicos
 */

import java.util.ArrayList;
import java.util.Scanner;

public class MainUniversidad {
    /**
     * @param
     */
    public static void main(String[] args) {

        Universidad universidad1 = new Universidad();
        Sede sede1 = new Sede("central");
        universidad1.getSedes().add(sede1);
        Scanner consola = new Scanner(System.in);

        String menu = "\n----------Menu-----------\n1. Agregar Estudiante\n2. Usar modulo de estadistica\n3. Agregar Sede\n4. SALIR DEL PROGRAMA\n-------------------------";
        boolean condition = true;

        while (condition) {

            System.out.println(menu);
            System.out.println("Seleccione una opcion: ");
            int opcion = consola.nextInt();
            consola.nextLine();

            switch (opcion) {
                //Caso 1 para agregar un objeto estudiante a la lista en la sede
                case 1:
                    System.out.println("Ingrese la localizacion de la sede a la que pertenece el estudiante: ");
                    String localizacion = consola.nextLine();
                    for (Sede x : universidad1.getSedes()) {
                        if (x.getLocalizacion().equals(localizacion)) {
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
                            for (int i = 0; i < cantExamenes; i++) {
                                System.out.println("Ingrese el nombre de la materia: ");
                                String nombreMateria = consola.nextLine();
                                System.out.println("Ingrese la nota del examen: ");
                                float notaMateria = consola.nextFloat();
                                consola.nextLine();
                                Examen examen1 = new Examen(nombreMateria, notaMateria);
                                examenes.add(examen1);

                            }
                            x.agregarEstudiante(nombre, apellido, codigoUnico, fechaNacimiento, email, examenes);
                            System.out.println("Se ha agregado el estudiante exitosamente.");
                        } else {
                            System.out.println("La localizacion de la sede que ha ingresado no esta registrada ingrese otra.");
                        }
                    }


                break;
                //Caso 2 para sacar las estadisticas de las notas
                case 2:
                float suma = 0;
                System.out.println("Ingrese la localizacion de la sede done quiere usar el modulo: ");
                String localizacion3 = consola.nextLine();
                for (Sede z : universidad1.getSedes()) {
                    if (z.getLocalizacion().equals(localizacion3)) {
                        for (Estudiante y : z.getEstudiantes()) {
                            for (Examen t : y.getExamenes()) {
                                suma = suma + t.getNotaMateria();

                            }
                        }
                    }
                }
                System.out.println("La suma de las notas es: " + suma);

                break;
            //Caso 3 para agregar una sede a la lista de sedes de la universidad
            case 3:
                System.out.println("Ingrese la localizacion de la sede: ");
                String localizacion1 = consola.nextLine();
                Sede sede2 = new Sede(localizacion1);
                universidad1.agregarSede(sede2);
                break;

            case 4:
                System.out.println("Saliendo del programa...");
                condition = false;
                break;

        }


    }

}
}
