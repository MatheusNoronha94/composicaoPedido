package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private String nome;
	private String email;
	private Date DataDeNascimento;
	
	public Cliente() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataDeNascimento() {
		return DataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		DataDeNascimento = dataDeNascimento;
	}

	public Cliente(String nome, String email, Date dataDeNascimento) {
		
		this.nome = nome;
		this.email = email;
		DataDeNascimento = dataDeNascimento;
	}

	public String toString() {
		return nome + " (" + sdf.format(DataDeNascimento) + ") - " + email;
 	}
	
}
