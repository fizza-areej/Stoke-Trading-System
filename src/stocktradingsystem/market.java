package stocktradingsystem;

import java.util.ArrayList;

public class market {
             private ArrayList<stock> stockList;
//             This line creates a variable that will store all stocks available in the market.
public market() {
	stockList=new ArrayList<>();
}
public void addStock(stock s) {
	stockList.add(s);
}
public void showAllStocks() {
    System.out.println("\nAvailable Stocks in Market:");
    for (int i = 0; i < stockList.size(); i++) {
        stock s = stockList.get(i); // get each stock by its index
        System.out.println("- " + s.getsymbol() + " (" + s.getname() + "): $" + s.getprice());
    }
}
public stock findStock(String symbol) {
    for (int i = 0; i < stockList.size(); i++) {
        stock s = stockList.get(i); 
        
        if (s.getsymbol().equalsIgnoreCase(symbol)) {
            return s; // return the matching stock immediately
        }
    }
    return null; // if no match found
}


}
