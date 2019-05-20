package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class LoginCentauroPageObjectsTest {

    private WebDriver browser;

    public LoginCentauroPageObjectsTest(WebDriver browser){
        this.browser = browser;
    }

    public LoginCentauroPageObjectsTest inserirEmail(String email){
        browser.findElement(By.id("formRegistro")).findElement(By.cssSelector("input.box-TipoUser.email-completer"))
                .sendKeys(email);
        return this;
    }

    public LoginCentauroPageObjectsTest clicarRadioButtonUsuarioCadastrado(){
        browser.findElement(By.id("formRegistro")).findElement(By.id("optYesclient")).click();
        return this;
    }

    public LoginCentauroPageObjectsTest inserirSenha(String senha){
        browser.findElement(By.id("formRegistro")).findElement(By.id("input-type-4")).sendKeys(senha);
        return this;
    }

    public LoginCentauroPageObjectsTest clicarBotaoEntrar(){
        browser.findElement(By.id("formRegistro")).findElement(By.id("btn_Entrar")).click();
        return this;
    }

    public void verificarUsuarioLogado(){
        WebElement msgLoginOk = browser.findElement(By.xpath("//div[2][@class='header-bar']/div[@class='breakpoint']" +
                "/div[@class='user-cart-area']/div[@id='target-my-account']/span[@class='user']/a[@class='user-tag']"));
        String msgLoginOkAssert = msgLoginOk.getText();
        assertEquals("Olá, Raj", msgLoginOkAssert);
    }

}
