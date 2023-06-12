import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    // Test para imprimir el rango de inputs validos
    @Test
    public void test1(){
        System.out.println("Test 1");
        int primerNumero = 5;
        int segundoNumero = 10;
        String esperado = "6\n7\n8\n9\n";
        String actual = Main.imprimirRango(primerNumero,segundoNumero);
        assertEquals(esperado,actual);
    }

    // Test para  que o se imprima el rango si los inputs son consecutivos
    @Test
    public void test2(){
        System.out.println("Test 2");
        int primerNumero = 2;
        int segundoNumero = 3;
        String esperado = "Ingresa dos numeros que no sean consecutivos";
        String actual = Main.imprimirRango(primerNumero,segundoNumero);
        assertEquals(esperado,actual);
    }

    //Test para imprimir el rango entre numeros negativos y positivos
    @Test
    public void test3(){
        System.out.println("Test 3");
        int primerNumero = -4;
        int segundoNumero = 4;
        String esperado = "-3\n-2\n-1\n0\n1\n2\n3\n";
        String actual = Main.imprimirRango(primerNumero,segundoNumero);
        assertEquals(esperado,actual);
    }
}