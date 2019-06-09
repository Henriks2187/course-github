package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo ao cadastro de produtos.");
		System.out.println("Digite o nome do produto: ");
		String productName = sc.nextLine();
		System.out.println("Digite o preço do produto: ");
		double price = sc.nextDouble();
		System.out.println("Digite a quantidade so estoque: ");
		int quantity = sc.nextInt();

		Product product = new Product(productName, price, quantity);

		System.out.println("Produdo Cadastrado: ");
		System.out.println(product);

		sc.close();
	}
}
