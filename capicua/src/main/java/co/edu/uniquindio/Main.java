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
    public static String generarMensaje(int numero){
        String mensaje;
        String capicua = "";
        int n= numero;
        while(n>0){
            int digito = n%10;
            capicua+=digito;
            n/=10;
        }
        if(Integer.parseInt(capicua) == numero){
            mensaje="El numero ingresado es capicua, "+ numero +"="+capicua;
        }else{
            mensaje="el numero ingresado no es capicua.";
        }
        return mensaje;
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
