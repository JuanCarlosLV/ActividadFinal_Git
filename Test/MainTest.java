import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    // Test para imprimir el rango de inputs validos
    @Test
    public void test1() {
        System.out.println("Test 1");
        int primerNumero = 2;
        int segundoNumero = 10;
        String esperado = "4\n6\n8\n";
        String actual = Main.imprimirRango(primerNumero, segundoNumero);
        assertEquals(esperado, actual);
    }

    // Test para que o se imprima el rango si los inputs son consecutivos
    @Test
    public void test2() {
        System.out.println("Test 2");
        int primerNumero = 2;
        int segundoNumero = 3;
        String esperado = "Ingresa dos numeros que no sean consecutivos";
        String actual = Main.imprimirRango(primerNumero, segundoNumero);
        assertEquals(esperado, actual);
    }

    // Test para imprimir el rango entre numeros negativos y positivos
    @Test
    public void test3() {
        System.out.println("Test 3");
        int primerNumero = -4;
        int segundoNumero = 4;
        String esperado = "-2\n0\n2\n";
        String actual = Main.imprimirRango(primerNumero, segundoNumero);
        assertEquals(esperado, actual);
    }

    @Test
    public void test4() {
        System.out.println("Test 4");
        int primerNumero = 0;
        int segundoNumero = 0;
        String esperado = "Debes ingresar un numero diferente a 0 o que no sean iguales";
        String actual = Main.imprimirRango(primerNumero, segundoNumero);
        assertEquals(esperado, actual);
    }

    @Test
    public void test5() {
        System.out.println("Test 5");
        int primerNumero = 3;
        int segundoNumero = 3;
        String esperado = "Debes ingresar un numero diferente a 0 o que no sean iguales";
        String actual = Main.imprimirRango(primerNumero, segundoNumero);
        assertEquals(esperado, actual);
    }
 

}