package stocktradingsystem;

public class stock {
	private String name;
	private String symbol;
	private double price;
	
	stock(String n,String sym,double pr){
		name = n;
		symbol=sym;
		price = pr;
	}
	
	public String getname(){
		return name;
	}
	public String getsymbol() {
		return symbol;
	}
    public double getprice() {
	return price;
}
}
