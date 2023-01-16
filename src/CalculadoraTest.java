import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    public CalculadoraTest(){}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp(){}

    @After
    public void tearDown(){}



    @Test
    public void testSomar(){
        System.out.print("Somar");
        int n = 0;
        int n1 = 0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.somar(n,n1);
        assertEquals(expResult,result, 0);
    }
    @Test
    public void testSubtrair() {
        System.out.println("Subtrair");
        int n1 = 5;
        int n2 = 3;
        Calculadora instance = new Calculadora();
        double expResult = 2;
        double result = instance.subtrair(n1, n2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMultiplicar() {
        System.out.println("\nMultiplicar");
        int n1 = 2;
        int n2 = 3;
        Calculadora instance = new Calculadora();
        double expResult = 6;
        double result = instance.multiplicar(n1, n2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMultiplicarNegativo() {
        System.out.println("Multiplicar Negativos");
        int n1 = -2;
        int n2 = -3;
        Calculadora instance = new Calculadora();
        double expResult = 6;
        double result = instance.multiplicar(n1, n2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMultiplicarNegativoPositivo() {
        System.out.println("Multiplicar Negativos Positivo");
        int n1 = -2;
        int n2 = 3;
        Calculadora instance = new Calculadora();
        double expResult = -6;
        double result = instance.multiplicar(n1, n2);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testDividir() {
        System.out.println("Dividir");
        int n1 = 5;
        int n2 = 2;
        Calculadora instance = new Calculadora();
        double expResult = 2.5;
        double result = instance.dividir(n1, n2);
        assertEquals(expResult, result, 0);
    }


}
