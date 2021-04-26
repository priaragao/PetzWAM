package pages;

import general.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class List  extends Base {
    //1 - Mapeamentos
    //Texto do Resultado Para
    @FindBy(css = "h1.h2Categoria nomeCategoria")
    private WebElement lblResultBy;

    //.liProduct:nth-child(1) a:nth-child(2) pegar o primeiro produto por posição no segundo quadrado


    //2 - Construtor
    public List(WebDriver driver) {
        super(driver);
    }


    //3 - Métodos e Funções baseados no mapeamento
    //Ler o titulo da guia e retorna o texto encontrado
    public String readTitleTab(){
        return driver.getTitle();
    }
    //Ler a frase Resultado para "Produto"
    public String readResultBy(){
        return lblResultBy.getText();
    }

    //Clique no produto desejado
    public void clickAtDesiredProduct(String product){
        driver.findElement(By.xpath("//h3[contains(text(),'"+ product +"')]")).click();
    }

}
