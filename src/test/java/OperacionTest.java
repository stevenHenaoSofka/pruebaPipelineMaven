import org.junit.Assert;
import org.junit.Test;

public class OperacionTest {

    @Test(expected = IllegalStateException.class)
    public void debeRetornarErrorCuandoIntentaAccederAlConstructor() throws IllegalStateException
    {
        //Arrange
        Operacion operacion = new Operacion();
        //Act
        //Assert
        
        //pru
    }

    @Test
    public void debeRetornar8CuandoSume5y3(){
        //Arrange
        //prueba trigger
        int x = 5;
        int y = 3;
       // Operacion operacion = new Operacion();
        //Act
        int resultado = Operacion.sumarLosValores(x,y);
        //Assert
        Assert.assertEquals(8,resultado);
    }

    @Test
    public void debeRetornar4CuandoSume2y2(){
        //Arrange
        int x = 2;
        int y = 2;
        //Act
        int resultado = Operacion.sumarLosValores(x, y);
        //Assert
        Assert.assertEquals(4, resultado);
    }

    @Test
    public void debeRetornar2CuandoReste5y3(){
        //Arrange
        int x = 5;
        int y = 3;
        //Act
        int resultado = Operacion.restaLosValores(x,y);
        //Assert
        Assert.assertEquals(2,resultado);
    }

    @Test
    public void debeRetornar15CuandoMultiplique3y5(){
        //Arrange
        int x = 3;
        int y = 5;
        //Act
        int resultado = Operacion.multipliqueLosValores(x,y);
        //Assert
        Assert.assertEquals(15, resultado);
    }
}
