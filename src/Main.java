//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

mport java.util.Scanner; import java.util.Random;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;
        int intentoUsuario;
        System.out.println("Bienvenido al juego de adivinar el número");
        System.out.println("Intenta adivinar un número entre 1 y 100.");
        do {
            System.out.print("Introduce tu intento: ");
            intentoUsuario = scanner.nextInt();
            intentos++;
            if (intentoUsuario < numeroAleatorio) {
                System.out.println("El número es demasiado bajo. ¡Inténtalo de nuevo!");
            } else if (intentoUsuario > numeroAleatorio) {
                System.out.println("El número es demasiado alto. ¡Inténtalo de nuevo!");
            }
        } while (intentoUsuario != numeroAleatorio);
                System.out.println("¡Fe