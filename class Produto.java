package atividade;
import java.util.Date;

 public class Produto {
    private String nome;
    private String codigoDeBarras;
    private int quantidade;
    private double precoUnitario;
    private Date dataDeValidade;

    public Produto(String nome, String codigoDeBarras, int quantidade, double precoUnitario, Date dataDeValidade) {
        this.nome = nome;
        this.codigoDeBarras = codigoDeBarras;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.dataDeValidade = dataDeValidade;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataDeValidade() {
        return dataDeValidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

	public void setQuantidade(int novaQuantidade) {

		
	}

	public void setDataDeValidade(Date novaDataValidade) {
	
		
	}

	public void setNome(String novoNome) {
		
		
	}

	public void setCodigoDeBarras(String novoCodigoDeBarras) {
		
		
	}

	public void setPrecoUnitario(double novoPrecoUnitario) {
	
		
	}
}
