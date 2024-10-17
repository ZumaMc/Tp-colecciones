import java.util.ArrayList;
import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese 20 números decimales (se redondearán a enteros):");
        for (int i = 0; i < 20; i++) {
            double numero = sc.nextDouble();
            numeros.add((int) Math.round(numero));
        }


        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        int rango = mayor - menor;
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Rango: " + rango);
    }
}

