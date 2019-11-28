package automacaoAmazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PesquisarLivroElementMap {
	
	@FindBy (id = "searchDropdownBox")
	protected WebElement tipoPesquisa;
	
	@FindBy (id = "twotabsearchtextbox")
	protected WebElement campoInformarLivro;
	
	@FindBy (xpath = "//*[@id=\'nav-search\']/form/div[2]/div/input")
	protected WebElement buscar;
	
	@FindBy (xpath = "//*[@id=\'search\']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div/h2/a/span")
	protected WebElement resultadoPesquisa;
	
}
