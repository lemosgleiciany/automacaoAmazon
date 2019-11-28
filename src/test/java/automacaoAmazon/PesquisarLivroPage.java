package automacaoAmazon;

//import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PesquisarLivroPage extends PesquisarLivroElementMap{

	public PesquisarLivroPage () {
		PageFactory.initElements(AcessarAmazonPage.getDriver(), this);
	}
	
	public void selecionarTipoLivro() {
		Select selecao = new Select(tipoPesquisa);
		selecao.selectByVisibleText("Livros");	
	}

	public void informarLivro() {
		campoInformarLivro.sendKeys("Automatização de teste de software com ferramentas");		
	}

	public void clicarEmPesquisar() {
		buscar.click();
	}

	public boolean verificarResutado() {
		String livroApresentado = resultadoPesquisa.getText();
		if (livroApresentado.contains("Automatização de teste de software com ferramentas")){
			return true;
		}else
			return false;
	}
	

}
