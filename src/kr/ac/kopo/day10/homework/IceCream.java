package kr.ac.kopo.day10.homework;

public class IceCream {

	private String name;                                      
	private int price;                                        
                                                              
	public IceCream() {                                              
                                                              
	}                                                         

	public IceCream(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
