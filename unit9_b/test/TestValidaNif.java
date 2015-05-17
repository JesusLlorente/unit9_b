import static java.lang.System.out;
import unit9_b.Alumno;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase que contendrá los tests del método validaNif de la clase
 * Alumno.
 * @author Jesús Llorente Gutiérrez
 */
public class TestValidaNif {
    
    //-----ATRIBUTOS-----//
    
    Alumno alu = new Alumno();
    boolean resultadoReal;
    boolean resultadoEsperado;
    String nif;
    
    //-----MÉTODOS-----//
    
    /**
     * Test que usa un nif con una cantidad de caracteres distinta
     * a 9.
     */
    @Test
    public void testValidaNifA(){
    
        //-----PROGRAMA-----//
        
        out.println("Nif con una cantidad distinta de 9 caracteres");
        nif = "AAAAAAA9";
        resultadoEsperado = false;
        resultadoReal = alu.validaNif(nif);
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    /**
     * Test que usa un nif con valor null.
     */
    @Test
    public void testValidaNifB(){
    
        //-----PROGRAMA-----//
        
        out.println("Nif con valor null");
        nif = null;
        resultadoEsperado = false;
        resultadoReal = alu.validaNif(nif);
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    /**
     * Test que usa un nif con una letra en los primeros 8 caracteres.
     */
    @Test
    public void testValidaNifC(){
    
        //-----PROGRAMA-----//
        
        out.println("Nif con letra en los primeros 8 caracteres");
        nif = "1234A6789";
        resultadoEsperado = false;
        resultadoReal = alu.validaNif(nif);
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    /**
     * Test que usa un nif con la letra incorrecta.
     */
    @Test
    public void testValidaNifD(){
    
        //-----PROGRAMA-----//
        
        out.println("Nif con la letra incorrecta");
        nif = "12346678A";
        resultadoEsperado = false;
        resultadoReal = alu.validaNif(nif);
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    /**
     * Test que usa un nif correcto.
     */
    @Test
    public void testValidaNifE(){
    
        //-----PROGRAMA-----//
        
        out.println("Nif correcto");
        nif = "53274975Y";
        resultadoEsperado = true;
        resultadoReal = alu.validaNif(nif);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}
