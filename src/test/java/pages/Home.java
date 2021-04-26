package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base{
    //1 - Mapeamento de Elementos
    @FindBy(id = "search")
    private WebElement txtInputSearch;

    @FindBy(css = "button.button-search")
    private WebElement btnSearch;

    //2 - Constutor

    public Home(WebDriver driver) {
        super(driver);
    }


    //3 - Ações dos Elementos

    public void search(String product){
        txtInputSearch.click(); //clicar na caixa de pesquisa
        txtInputSearch.clear(); //limpar conteúdo na caixa de texto
        txtInputSearch.sendKeys(product); //escreve na caixa de texto
    }

    //Feature --> Steps --> searchWith... -> search

    public void searchWithMagnifierButton(String product){
        search(product);
        btnSearch.click(); //clica no botão pesquisar
    }

    public void searchWithEnter(String product){
/*        txtInputSearch.click(); //clicar na caixa de pesquisa
        txtInputSearch.clear(); //limpar conteúdo na caixa de texto
        //txtInputSearch.sendKeys(product + Keys.ENTER); //Pode usar desse jeito tambem
        txtInputSearch.sendKeys(product); //escreve na caixa de texto
  */
        search(product);
        txtInputSearch.sendKeys(Keys.ENTER);
    }


}
