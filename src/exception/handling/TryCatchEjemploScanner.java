package exception.handling;

import java.util.Scanner;

public class TryCatchEjemploScanner {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("INGRESE EL NUMERADOR: ");
            int numerador = Integer.parseInt(scanner.nextLine());

            System.out.print("INGRESE EL DENOMINADOR: ");
            int denominador = Integer.parseInt(scanner.nextLine());

            int resultado = numerador / denominador;

            System.out.println("RESULTADO: " + resultado);

        } 
        catch (ArithmeticException e) {

            System.out.println("ERROR MATEMÁTICO: NO SE PUEDE DIVIDIR ENTRE CERO.");
            System.out.println("DETALLE TÉCNICO: " + e.getMessage().toUpperCase());

        } 
        catch (NumberFormatException e) { //ATRAPA FORMATO INVALIDO (LETRAS)

            System.out.println("ERROR DE FORMATO: DEBE INGRESAR NÚMEROS VÁLIDOS.");
            System.out.println("DETALLE TÉCNICO: " + e.getMessage().toUpperCase());

        } 
        finally {

            System.out.println("EL PROGRAMA HA TERMINADO.");
            scanner.close();

        }
    }
}