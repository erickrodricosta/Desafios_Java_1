
import dia_9.Calculadora;
import junit.framework.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
public class CalculadoraTest extends TestCase{

    public CalculadoraTest(String testName) {
        super(testName);
    }

    public static Test suit() {
        TestSuite suite = new TestSuite(Calculadora.class);
        return suite;
    }
    private Calculadora calc = new Calculadora();

    public void testSomar() {
        assertEquals(30, calc.somar(10, 20),0);
    }
    public void testSubtrair() {

    }
}
