package tests;

import helper.Web;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import pages.LoginCentauroPageObjectsTest;

public class LoginCentauroTest {

    private WebDriver browser;

    @Before
    public void setUp(){
        browser = Web.createChrome("https://www.centauro.com.br/slogin");
    }

    @Test
    public void logarComEmailValidoDePessoaFisica(){
        new LoginCentauroPageObjectsTest(browser)
                .inserirEmail("raj.ind@mailinator.com")
                .clicarRadioButtonUsuarioCadastrado()
                .inserirSenha("123")
                .clicarBotaoEntrar()
                .verificarUsuarioLogado();
    }

    @After
    public void  tearDown(){
        browser.quit();
    }
}
