import static java.lang.System.out;
import org.junit.Test;
import static org.junit.Assert.*;
import unit9_b.Alumno;

/**
 * Clase que contendrá los tests del método calculatasaMatricula de 
 * la clase Alumno.
 * @author Jesús Llorente Gutiérrez
 */
public class TestCalculaTasaMatricula {   
 
    //-----ATRIBUTOS-----//
    
    Alumno alu = new Alumno();
    int edad;
    boolean familiaNumerosa;
    boolean repetidor;
    float resultadoEsperado;
    float resultadoReal;

    //-----MÉTODOS-----//
    
    /**
     * Test que entrará en el primer if.
     */
    @Test
    public void TestCalculaTasaMatriculaA(){
        
        //-----PROGRAMA-----//
        
        out.println("Entra en el primer if");
        edad = 20;
        familiaNumerosa = false;
        repetidor = true;
        resultadoEsperado = 2000.00f;
        resultadoReal = alu.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertTrue(resultadoEsperado == resultadoReal);
    }
    
    /**
     * Test que entrará en el segundo if.
     */
    @Test
    public void TestCalculaTasaMatriculaB(){
        
        //-----PROGRAMA-----//
        
        out.println("Entra en el segundo if");
        edad = 30;
        familiaNumerosa = true;
        repetidor = true;
        resultadoEsperado = 250.00f;
        resultadoReal = alu.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertTrue(resultadoEsperado == resultadoReal);
    }
    
    /**
     * Test que entrará en el tercer if.
     */
    @Test
    public void TestCalculaTasaMatriculaC(){
        
        //-----PROGRAMA-----//
        
        out.println("Entra en el tercer if");
        edad = 60;
        familiaNumerosa = false;
        repetidor = true;
        resultadoEsperado = 400.00f;
        resultadoReal = alu.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertTrue(resultadoEsperado == resultadoReal);
    }
    
    /**
     * Test que no entrará en ningún if.
     */
    @Test
    public void TestCalculaTasaMatriculaD(){
        
        //-----PROGRAMA-----//
        
        out.println("No entra en ningún if");
        edad = 40;
        familiaNumerosa = false;
        repetidor = true;
        resultadoEsperado = 500.00f;
        resultadoReal = alu.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
        assertTrue(resultadoEsperado == resultadoReal);
    }
}
