package automacaoAmazon;


import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PesquisarLivroSteps {

	@Given ("eu esteja no site da Amazon")
	public void acessarSiteAmazon() {
		AcessarAmazonPage acessarAmazonpage = new AcessarAmazonPage();
		acessarAmazonpage.acessarSiteAmazon();
	}
	
	@When ("eu selecionar livro")
	public void selecionarTipoLivro() {
		PesquisarLivroPage pesquisarLivroPage = new PesquisarLivroPage();
		pesquisarLivroPage.selecionarTipoLivro();
	}
	
	@And ("escrever o nome que quero")
	public void informarLivro() {
		PesquisarLivroPage pesquisarLivroPage = new PesquisarLivroPage();
		pesquisarLivroPage.informarLivro();
	}
	
    @And ("clicar no icone de pesquisa")
    public void clicarEmPesquisar() {
    	PesquisarLivroPage pesquisarLivroPage = new PesquisarLivroPage();
		pesquisarLivroPage.clicarEmPesquisar();
	}
	
	@Then ("o sistema devem retornar consulta de acordo com o nome informado")
	public void verificarResutado() {
		PesquisarLivroPage pesquisarLivroPage = new PesquisarLivroPage();
		boolean livroApresentado = pesquisarLivroPage.verificarResutado();
		Assert.assertTrue("erro", livroApresentado);
	}
	

}
