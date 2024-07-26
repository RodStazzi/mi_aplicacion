package com.ejemplo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
// import org.testng.annotations.Test;
// import java.util.function.Function;
// import static org.testng.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}


// public class AppTest {

//     @Test
//     public void testSquareFunction() {
//         // Arrange
//         Function<Integer, Integer> square = x -> x * x;
//         int num = 5;

//         // Act
//         int result = square.apply(num);

//         // Assert
//         assertEquals(result, 25, "El cuadrado de 5 debe ser 25");
//     }
// }