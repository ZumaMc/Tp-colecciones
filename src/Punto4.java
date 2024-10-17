import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/*
Realice una búsqueda secuencial en un ArrayList<Integer> que contenga
50 elementos generados aleatoriamente mediante la función java random.
Realice una búsqueda secuencial de la siguiente forma:
        - se lee el valor que se desea buscar,
        - se compara la primera posición;
        - si son iguales,
        - fin de la búsqueda.
        - De lo contrario, compararlo con la segunda posición, y así
sucesivamente.
        - Si se llega al final del arreglo y no se encontró el valor, debe indicarlo
con un mensaje apropiado.
        - Si se encuentra, se debe especificar la posición que ese valor ocupa en
la lista por primera vez.
*/

public class Punto4 {
    public static void main(String[] args) {
            //Creamos arreglo vacio
        ArrayList<Integer> randomNumbers = new ArrayList<>();
            //Creamos clase random para despues instanciarla y usar sus metodos
        Random random = new Random();
            // Iteramos y por cada iteracion creamos una variable con un numero aleatorio entre 0 y 49. Luego agregamos los num al arreglo
        for (int i = 0 ; i<50 ; i++){
            int randomNumber = random.nextInt(50);
            randomNumbers.add(randomNumber);

        }
        System.out.println(randomNumbers);
        // System.out.println(randomNumbers.size()); // size devuelve el length del arreglo, es un metodo de arraylist

        //Creamos clase random para despues instanciarla y usar sus metodos
        Scanner scanner = new Scanner(System.in);
        //Pedimos  el valor que queremos buscar y lo guardamos en variable
        System.out.println("Ingrese el valor que desea buscar:");
        int valueToSearch = scanner.nextInt();
        // Recorremos el arreglo con busqueda secuencial, si el numero esta nos indica su posicion, y si se repite el numero, nos indicara las posiciones donde se encuentran, caso contrario nos imprime mensaje
        boolean found = false;
        for (int i = 0; i < 50; i++){
            if(randomNumbers.get(i) == valueToSearch){
                System.out.println("El valor " + valueToSearch + " se encuentra en la lista, en la posición " + i);
                found=true;
            }
        }
        if(!found){
            System.out.println("El valor " + valueToSearch + " no se encuentra en la lista");
        }
        scanner.close(); // buena practica cerrar el objeto scanner para optimizar el consumo de memoria
    }
}