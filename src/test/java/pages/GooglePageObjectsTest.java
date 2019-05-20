package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePageObjectsTest {
    private WebDriver browser;

    public GooglePageObjectsTest(WebDriver browser){
        this.browser = browser;
    }

    public GooglePageObjectsTest pesquisarPorDiretorETituloFilme(String diretor, String tituloFilme) {
        WebElement pesquisaGoogle = browser.findElement(By.xpath("//input[@title=\"Pesquisar\"]"));
        pesquisaGoogle.sendKeys(diretor + ", " + tituloFilme);
        pesquisaGoogle.sendKeys(Keys.ENTER);
        return this;
    }

    public void imprimirQuantidadeAproximadaDeResultados(){
        WebElement quantidaDeResultados = browser.findElement(By.id("resultStats"));
        //quantidaDeResultados.getText();
        System.out.println(quantidaDeResultados.getText());
    }
}
