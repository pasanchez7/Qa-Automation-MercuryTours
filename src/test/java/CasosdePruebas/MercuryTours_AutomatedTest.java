package CasosdePruebas;

import BaseTestSuite.BaseTestSuiteChrome;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MercuryTours_AutomatedTest extends BaseTestSuiteChrome
{

    // iniciamos variables
    String url = "http://demo.guru99.com/test/newtours/";

   // PASO 1: ir al link Register
   // PASO 2: completar user name, password, confirm password y dar click en submit
   // PASO 3: ir a home autenticarnos con el user name y password creados y damos clic en Sign-in

    //Localizadores
    By registerLinkLocator = By.linkText("REGISTER");
    By registerPageLocator = By.xpath("//img[@src='images/mast_register.gif']");

    By usernameLocator = By.id("email");
    By passwordLocator = By.name("password");
    By confirmPasswordLocator = By.cssSelector("input[name='confirmPassword']");
    By submitBtnLocator = By.name("submit");

    By userLocator = By.name("userName");
    By passLocator = By.name("password");
    By submitLocator = By.name("submit");
    By titleLocator = By.xpath("//b[contains(text(),'Thank you for Loggin.')]");


@Test
public void registerUser () throws InterruptedException
{

    driver.get(url); // abrimos pag web

    driver.findElement(registerLinkLocator).click(); // click sobre pestaña registrar
    Thread.sleep(2000); //tiempo de espera de respuesta

    if (driver.findElement(registerPageLocator).isDisplayed())
        {
            driver.findElement(usernameLocator).sendKeys("pablo");
            driver.findElement(passwordLocator).sendKeys("123");
            driver.findElement(confirmPasswordLocator).sendKeys("123");
            driver.findElement(submitBtnLocator).click();
        }
    else
        {
        System.out.println("no se encontró la página de registro");
        }

    List<WebElement> fonts = driver.findElements(By.tagName("font"));
    assertEquals("Note: Your user name is pablo.",fonts.get(5).getText());

}

@Test
    public void sigIn() throws InterruptedException
{
    driver.get(url); // abrimos pag web
    if (driver.findElement(userLocator).isDisplayed())
    {
        driver.findElement(userLocator).sendKeys("pablo");
        driver.findElement(passLocator).sendKeys("123");
        driver.findElement(submitLocator).click();
        Thread.sleep(2000); //tiempo de espera de respuesta
        assertTrue(driver.findElement(titleLocator).isDisplayed());
    }
        else
    {
        System.out.print(" login no encontrado");
    }



}




}
