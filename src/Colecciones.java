import java.util.ArrayList;
import java.util.Scanner;
public class Colecciones {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
      System.out.println("Ingrese numeros, esto se detendra cuando ingrese un numero menor a 0");
      while (true) {
          int num = sc.nextInt();
          if (num < 0) {
              break;
          }
          numeros.add(num);
      }
    for (int n : numeros){
        System.out.print(n + " ");
    }
    }
}
