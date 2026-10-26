import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();
        while (numero < 100) {
            System.out.print("Ingrese un numero de tres o mas cifras: ");
            numero = sc.nextInt();
        }
        int contador = 0;
        while (numero > 0) {
            numero = numero / 10;
            contador = contador + 1;
        }
        System.out.println("Cantidad de digitos: " + contador);
        sc.close();
    }
}