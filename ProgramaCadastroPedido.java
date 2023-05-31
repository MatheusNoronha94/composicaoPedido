package programas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItensDoPedido;
import entidades.Pedido;
import entidades.Produto;
import entidades_enum.StatusPedido;

public class ProgramaCadastroPedido {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);
		System.out.println("Inserir dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento(DD/MM/YYYY) :");
		Date data = sdf.parse(sc.next());
		;

		Cliente cliente = new Cliente(nome, email, data);

		System.out.println("Informe o status do pedido: ");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		Pedido pedido = new Pedido(new Date(), status, cliente);

		System.out.print("Qual a quantidade de itens do pedido?: ");
		Integer quantidadeItens = sc.nextInt();
		for (int i = 0; i < quantidadeItens; i++) {
			System.out.println("Informe qual o item número " + (i+1) + " : ");
			System.out.print("Nome do Produto: ");
			String nomeProduto = sc.next();
			System.out.print("Preço produto: ");
			Double precoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			Integer quantidadeProduto = sc.nextInt();

			Produto produtoDeclarado = new Produto(nomeProduto, precoProduto);
			ItensDoPedido quantidadePreco = new ItensDoPedido(quantidadeProduto, precoProduto, produtoDeclarado);

			pedido.adicionarItem(quantidadePreco);

		}
		
		System.out.println();
		System.out.println("RESUMO DO PEDIDO: ");
		System.out.println(pedido);
		
		

	}

}
