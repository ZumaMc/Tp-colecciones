import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Punto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Ingrese 10 números enteros: ");
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            numeros.add(num);
        }
        ArrayList<Integer> listaasc = new ArrayList<>(numeros);
        Collections.sort(listaasc);
        System.out.println("Su lista ingresada de forma ascendente:");
        for (int n : listaasc){
            System.out.print(n+" ");
        }
        ArrayList<Integer> listades = new ArrayList<>(listaasc);
        Collections.reverse(listades);

        System.out.println();
        System.out.println("Su lista ingresada de forma descendete:");
        for (int n : listades){
            System.out.print(n+" ");
        }

    }
}
