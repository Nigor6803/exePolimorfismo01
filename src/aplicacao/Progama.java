package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;
import entidade.ProdutoImportado;
import entidade.ProdutoUsado;

public class Progama {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner edd = new Scanner(System.in);
		
		List <Produto> lista = new ArrayList<>();
		
		System.out.print("PRODUTO:");
		int n = edd.nextInt();
		
		for (int i = 1;i<=n;i++) {
			System.out.println("IFORMAÇÃO DO "+i+"º PRODUTO");
			System.out.print("NOVO, USADO OU IMPORTADO:(N/U/I)");
			char resp = edd.next().charAt(0);
			if (resp == 'N') {
				
				System.out.print("NOME DO PRODUTO:");
				edd.nextLine();
				String nome = edd.nextLine();
				System.out.print("VALOR DO PRODUTO:");
				double preco = edd.nextDouble();
				
				Produto produto = new Produto(nome, preco);
				lista.add(produto);
			} else if (resp == 'U') {
				
				System.out.print("NOME DO PRODUTO:");
				edd.nextLine();
				String nome = edd.nextLine();
				System.out.print("VALOR DO PRODUTO:");
				double preco = edd.nextDouble();
				System.out.print("DATA DE FABRICAÇÃO:");
				Date data = sdf.parse(edd.next());
				
				Produto produto = new ProdutoUsado(nome, preco,data);
				lista.add(produto);
			} else if (resp == 'I') {
				
				System.out.print("NOME DO PRODUTO:");
				edd.nextLine();
				String nome = edd.nextLine();
				System.out.print("VALOR DO PRODUTO:");
				double preco = edd.nextDouble();
				System.out.print("TAXA DE IMPORTAÇÃO:");
				double taxaDeImportação = edd.nextDouble();
				
				Produto produto = new ProdutoImportado(nome, preco,taxaDeImportação);
				lista.add(produto);
			}
		}
		System.out.println("ETIQUETA DE PREÇO");
		for (Produto produto : lista) {
			System.out.println(produto.etiquetaDePreco());
			}
		edd.close();

	}

}
