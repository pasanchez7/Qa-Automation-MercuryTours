package BaseTestSuite;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestSuiteChrome {

    // instanciar un objeto Webdriver
    protected WebDriver driver;

    @Before // antes
    public void setUp()
    {
        //indicar localizacion de archivo chromedriver
        System.setProperty("webdriver.chrome.driver",  "src\\main\\resources\\ChromeDriver\\chromedriver.exe");
        //abrir navegador chrome
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximiza ventana
    }

    @After
    public void tearDown()
    {
         //driver.quit();
    }

}

