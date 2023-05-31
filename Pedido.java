package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import entidades.ItensDoPedido;
import entidades_enum.StatusPedido;

public class Pedido {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momentoDaCompra;
	private StatusPedido status;
	List<ItensDoPedido> itensQueContemNoPedido = new ArrayList<>();
	private Cliente cliente;

	public void adicionarItem(ItensDoPedido itens) {

		itensQueContemNoPedido.add(itens);
	}

	public void removerItem(ItensDoPedido itens) {
		itensQueContemNoPedido.remove(itens);
	}

	public Double total() {
		double numero = 0.0;
		for (ItensDoPedido itens : itensQueContemNoPedido) {
			numero += itens.subTotal();
		}
		return numero;

	}

	public Pedido(Date momentoDaCompra, StatusPedido status, Cliente cliente) {

		this.momentoDaCompra = momentoDaCompra;
		this.status = status;
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do Pedido: ");
		sb.append(sdf.format(momentoDaCompra) + "\n");
		sb.append("Status do Pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do Pedido: " + "\n");
		for (ItensDoPedido item : itensQueContemNoPedido) {
			sb.append(item + "\n");
		}
		sb.append("Preço Total: ");
		sb.append("R$ ");
		sb.append(total());
		
		return sb.toString();
	}

}
