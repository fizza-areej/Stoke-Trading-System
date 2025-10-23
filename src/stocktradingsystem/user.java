package stocktradingsystem;

import java.util.ArrayList;

public class user {
	private String username;
	private double balance;
	private ArrayList<stock> portfolio;
	
	user(String name,double balance){
		this.username = name;
		this.balance=balance;
		this.portfolio=new ArrayList<>();

	}
	
	 String getName() {
	        return username;
	    }

	    public double getBalance() {
	        return balance;
	    }
	
	    public void buyStock(stock s) {
	        // check karo user ke paas paise hain ya nahi
	        if (balance >= s.getprice()) {
	            portfolio.add(s);             // stock portfolio me add karo
	            balance -= s.getprice();      // paise ghatao
	            System.out.println(getName() + " bought " + s.getsymbol() + " for $" + s.getprice());
	        } else {
	            System.out.println("❌ Not enough balance to buy " + s.getsymbol());
	        }
	    }
	    
	    public void sellStock(stock s) {
	        // check karo user ke paas wo stock hai ya nahi
	        if (portfolio.contains(s)) {
	            portfolio.remove(s);          // stock ko portfolio se hatao
	            balance += s.getprice();      // paise wapas add karo
	            System.out.println(getName() + " sold " + s.getsymbol() + " for $" + s.getprice());
	        } else {
	            System.out.println("❌ You don’t own this stock!");
	        }
	    }
	    
	    public void showPortfolio() {
	        System.out.println("\n📊 Portfolio of " + getName() + ":");

	        if (portfolio.isEmpty()) {
	            System.out.println("No stocks owned yet.");
	        } else {
	            // portfolio ke har stock ka data print karo
	            for (stock s : portfolio) {
	                System.out.println("- " + s.getsymbol() + " ($" + s.getprice() + ")");
	            }
	        }
	        System.out.println("💰 Current Balance: $" + balance);
	    }

}
