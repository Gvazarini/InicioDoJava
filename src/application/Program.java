package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter Product Data: ");
		System.out.print("Name:");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		product.qtd = sc.nextInt();
		System.out.println("Product Data: " + product.toString());		
		
		System.out.print("The number of products to be add in stock: ");
		product.addProduct(sc.nextInt());
		System.out.print("Update data: ");
		System.out.println(product);
		
		System.out.print("Numeber of products to be removed from stock: ");
		product.removeProduct(sc.nextInt());
		System.out.print("Update Data: ");
		System.out.println(product);
		sc.close();

	}

}
