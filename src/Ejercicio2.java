import java.util.Scanner;

public class Ejercicio2 {
    // factorial
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero del factorial");
        int n = sc.nextInt();
        int respuesta = 1;

        for(int i = n; i >=1; i--)
        {
            respuesta = respuesta * i;
        }
        System.out.println(respuesta);
    }
}
