package com.github.juliamello8.classes;

import java.util.Scanner;

public class Registrar {
	private String login;
	private String senha;
	private int idade;
	private int telefone;
	private String cidade;
	private String estado;
	private int cartao;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public int getCartao() {
		return cartao;
	}
	public void setCartao(int cartao) {
		this.cartao = cartao;
	}
	
	public void RegristrarUsuario() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println ("Digite um login: ");
		login = leitor.nextLine(); 
		Login usuario = new Login();
		usuario.setLogin(this.login);
		
		System.out.println ("Senha: ");
		senha = leitor.nextLine(); 
		usuario.setSenha(this.senha);
		
		System.out.println ("Idade: ");
		idade = leitor.nextInt() ; 
		usuario.setIdade(this.idade);
		
		System.out.println ("Telefone: ");
		telefone = leitor.nextInt(); 
		usuario.setTelefone(this.telefone);
		
		System.out.println ("Cidade: ");
		cidade = leitor.nextLine(); 
		usuario.setCidade(this.cidade);
		
		System.out.println ("Estado: ");
		estado = leitor.nextLine(); 
		usuario.setEstado(this.estado);
		
		
	}

}

