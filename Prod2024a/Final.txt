package br.com.escola20241;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
	private int id;
	private String codigoDeBarras;
	private String sku;
	private String nome;
	private String descricao;
	private String categoria;
	private double preco;
	private double peso;
	private String fabricante;
	
	public Produto(int id, String codigoDeBarras, String sku, String nome, String descricao, String categoria, double preco, double peso, String fabricante) {
		if (codigoDeBarras == null || codigoDeBarras.length() != 15) {
			throw new IllegalArgumentException("Código de barras inválido");
		}
		if (sku == null || sku.length() > 20) {
			throw new IllegalArgumentException("SKU inválido");
		}
		if (nome == null || nome.length() > 50) {
			throw new IllegalArgumentException("Nome inválido");
		}
		if (descricao == null || descricao.length() > 200) {
			throw new IllegalArgumentException("Descrição inválida");
		}
		if (categoria == null || categoria.length() > 20) {
			throw new IllegalArgumentException("Categoria inválida");
		}
		if (fabricante == null || fabricante.length() > 50) {
			throw new IllegalArgumentException("Fabricante inválido");
		}
		this.id = id;
		this.codigoDeBarras = codigoDeBarras;
		this.sku = sku;
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria;
		this.preco = preco;
		this.peso = peso;
		this.fabricante = fabricante;
	}
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}
	public void setCodigoDeBarras(String codigoDeBarras) {
		if (codigoDeBarras == null || codigoDeBarras.length() != 15) {
			throw new IllegalArgumentException("Código de barras inválido");
		}
		this.codigoDeBarras = codigoDeBarras;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		if (sku == null || sku.length() > 20) {
			throw new IllegalArgumentException("SKU inválido");
		}
		this.sku = sku;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome == null || nome.length() > 50) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if (descricao == null || descricao.length() > 200) {
			throw new IllegalArgumentException("Descrição inválida");
		}
		this.descricao = descricao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		if (categoria == null || categoria.length() > 20) {
			throw new IllegalArgumentException("Categoria inválida");
		}
		this.categoria = categoria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		if (fabricante == null || fabricante.length() > 50) {
			throw new IllegalArgumentException("Fabricante inválido");
		}
		this.fabricante = fabricante;
	}
}

class GerenciadorDeProdutos {
	private List<Produto> produtos;

	public GerenciadorDeProdutos() {
		this.produtos = new ArrayList<>();
	}

	// 1- Incluir produto
	public void incluirProduto(Produto produto) {
		this.produtos.add(produto);
	}

	// 2- Alterar produto
	public void alterarProduto(int id, Produto novoProduto) {
		for (int i = 0; i < this.produtos.size(); i++) {
			if (this.produtos.get(i).getId() == id) {
				this.produtos.set(i, novoProduto);
				return;
			}
		}
	}

	// 3- Excluir produto
	public void excluirProduto(int id) {
		this.produtos.removeIf(produto -> produto.getId() == id);
	}

	// 4- Listar todos produtos
	public List<Produto> listarTodosProdutos() {
		return this.produtos;
	}

	// 5- Listar um produto
	public Produto listarUmProduto(int id) {
		for (Produto produto : this.produtos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
}

public class Main {
	public static void main(String[] args) {
		GerenciadorDeProdutos gerenciador = new GerenciadorDeProdutos();
		Scanner scanner = new Scanner(System.in);
		
		// Adicionando alguns produtos iniciais
		gerenciador.incluirProduto(new Produto(1, "123456789012345", "SKU123", "Produto 1", "Descrição do Produto 1", "Categoria 1", 10.0, 1.0, "Fabricante 1"));
		gerenciador.incluirProduto(new Produto(2, "234567890123456", "SKU234", "Produto 2", "Descrição do Produto 2", "Categoria 2", 20.0, 2.0, "Fabricante 2"));
		gerenciador.incluirProduto(new Produto(3, "345678901234567", "SKU345", "Produto 3", "Descrição do Produto 3", "Categoria 3", 30.0, 3.0, "Fabricante 3"));
		
		while (true) {
			System.out.println("Escolha uma opção:");
			System.out.println("1. Incluir produto");
			System.out.println("2. Alterar produto");
			System.out.println("3. Excluir produto");
			System.out.println("4. Listar todos produtos");
			System.out.println("5. Listar um produto");
			System.out.println("6. Sair");
			
			int opcao = scanner.nextInt();
			scanner.nextLine();  // consume newline left-over
			
			switch (opcao) {
				case 1:
					// código para incluir produto
					break;
				case 2:
					// código para alterar produto
					break;
				case 3:
					// código para excluir produto
					break;
				case 4:
					// código para listar todos produtos
					break;
				case 5:
					// código para listar um produto
					break;
				case 6:
					System.out.println("Saindo...");
					scanner.close();
					return;
				default:
					System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}
}
