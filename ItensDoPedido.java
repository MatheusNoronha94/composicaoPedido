package entidades;

public class ItensDoPedido {
	private Integer quantidade;
	private Double preço;
	private Produto produto;

	public ItensDoPedido(Integer quantidade, Double preço, Produto produto) {

		this.quantidade = quantidade;
		this.preço = preço;
		this.produto = produto;

	}

	public ItensDoPedido() {
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

	public Double subTotal() {
		return preço * quantidade;

	}

	@Override
	public String toString() {
		return this.produto + ", " + " R$ " + preço + ", "+"Quantidade: "+ quantidade + ", "+"Subtotal: "+subTotal() ;
	}

}
