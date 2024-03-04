import java.util.Scanner;

public class Ejercicio1 {
    // verificar si un numero es primo o no
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero");

        int n = sc.nextInt();

        int div = 0;
        for(int i = 1; i<=n; i++)
        {
            if(n % i == 0)
            {
                div++;
                if(div>2)
                {
                    break;
                }
            }
        }

        if(div>2)
        {
            System.out.println("NO ES PRIMO");
        }
        else {
            System.out.println("ES PRIMO");
        }
    }
}
