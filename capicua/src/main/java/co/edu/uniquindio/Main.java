package co.edu.uniquindio;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        int numero = ingresarEntero("Ingresa tu numero: ");
        String mensaje = generarMensaje(numero);
        mostrarMensaje(mensaje);
    }
    public static int ingresarEntero (String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        int entero = scanner.nextInt();
        return entero;
    }
    //Daniela se encargara de realizar el metodo mensaje donde va a estar la logica
    //para determinar si el numero es o no es capicua
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
