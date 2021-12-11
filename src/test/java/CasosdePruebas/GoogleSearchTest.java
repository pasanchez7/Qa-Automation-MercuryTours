package CasosdePruebas;

import BaseTestSuite.BaseTestSuiteChrome;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class GoogleSearchTest extends BaseTestSuiteChrome {

    String url= "http://www.google.com.ar"; // inicilaizar variables



    @Test
        public void testGooglePage ()
    {
        driver.get(url); // abrimos google

        WebElement searchbox= driver.findElement(By.name("q")); // identificamos el elemneto web -caja de busqueda-

        searchbox.clear(); //limpiar caja de busqueda

        searchbox.sendKeys("quality-stream Introduccion a la " +
                "Automatización de Prueba de Software"); //buscamos en google

        searchbox.submit(); // enviar- dar enter

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // damos tiempo de espera- respuesta

        // obtenemos el resultado de la prueba

        Assert.assertEquals("quality-stream Introduccion a la " +
                "Automatización de Prueba de Software - Buscar con Google", driver.getTitle()); // el titutlo debe ser = a la busqueda

    }

}
