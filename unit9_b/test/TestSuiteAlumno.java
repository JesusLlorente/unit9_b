import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Suite que ejecutará todos los test de la clase Alumno.
 * @author Jesús Llorente Gutiérrez
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TestCalculaTasaMatricula.class, TestValidaNif.class})
public class TestSuiteAlumno {
    
}
