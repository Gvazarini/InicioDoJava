package entities;

public class Product {

	public String name;
	public double price;
	public int qtd;
	
	public double totalValue() 
	{
	
		return price * qtd;	
	}
	
	public void addProduct(int qtd) 
	{
	
		this.qtd += qtd;
	}
	
	public void removeProduct(int qtd) 
	{
		this.qtd -= qtd;
	}
	
	public String toString() 
	{
		return name +  ", R$ " + String.format("%.2f", price) + ", " + qtd + " unidades, " + "Total: R$" + String.format("%.2f",totalValue()); 
	}
}
