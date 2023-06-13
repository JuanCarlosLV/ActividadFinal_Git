
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int primeroNumero;
        int segundNumero;
        System.out.println("===== Ingresa dos numeros ====");
        primeroNumero = input.nextInt();
        segundNumero = input.nextInt();
        System.out.println(imprimirRango(primeroNumero, segundNumero));
    }

    /**
     * Método para imprimir el rango de numeros entre un numero a y un numero b, sin
     * imprimir ni el primer y ultimo numero.
     * Si los dos numeros a y b son consecutivos es decir, 2 y 3, entonces se
     * imprime un mensaje de error, ya que no se puede
     * imprimir un rango entre esos numeros, ya que no existe.
     *
     * @param primerNumero  Este es el primer valor que se ingresa por parametro
     * @param segundoNumero Este es el segundo valor que se ingresa por parametro
     * @return Se retorna un string el cual contiene los valores del rango, usando
     *         el StringBuilder.
     */

    public static String imprimirRango(int primerNumero, int segundoNumero) {
        StringBuilder rango = new StringBuilder();
        int numeroActual = primerNumero + 1;
        if (primerNumero == segundoNumero || (primerNumero == 0 || segundoNumero == 0)) {
            return "Debes ingresar un numero diferente a 0 o que no sean iguales";
        }
        if (primerNumero >= segundoNumero - 1) {
            return "Ingresa dos numeros que no sean consecutivos";
        } else {
            System.out.println("El rango de numeros entre " + primerNumero + " y " + segundoNumero + " son: ");
            while (numeroActual < segundoNumero) {
                rango.append(numeroActual).append("\n");
                numeroActual++;
            }
        }

        return rango.toString();
    }
}
