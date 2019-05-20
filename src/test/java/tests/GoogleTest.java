package tests;

import helper.Web;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.GooglePageObjectsTest;

public class GoogleTest {

    private WebDriver browser;

    @Before
    public void setUp(){
        browser = Web.createChrome("https://www.google.com.br");
    }

    @Test
    public void pesquisarGooglePorDiretorETituloFilmeEVerificarQuantidadeDeResultados(){
        new GooglePageObjectsTest(browser)
                .pesquisarPorDiretorETituloFilme("Joe Russo", "Vingadores: Ultimato")
                .imprimirQuantidadeAproximadaDeResultados();
    }
}
