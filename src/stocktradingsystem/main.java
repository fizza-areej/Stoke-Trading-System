package stocktradingsystem;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // 🔹 Create the Market
        market m = new market();
        
        // 🔹 Add some demo stocks
        stock apple = new stock("Apple Inc.", "AAPL", 150.0);
        stock tesla = new stock("Tesla Motors", "TSLA", 200.0);
        stock amazon = new stock("Amazon", "AMZN", 250.0);
        
        m.addStock(apple);
        m.addStock(tesla);
        m.addStock(amazon);
        
        // 🔹 Create a user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your starting balance: $");
        double balance = sc.nextDouble();
        user u1 = new user(name, balance);
        
        int choice;
        
        // 🔹 Menu-driven system
        do {
            System.out.println("\n====================================");
            System.out.println("📈 STOCK TRADING SYSTEM MENU");
            System.out.println("1️⃣ Show All Stocks");
            System.out.println("2️⃣ Buy Stock");
            System.out.println("3️⃣ Sell Stock");
            System.out.println("4️⃣ View Portfolio");
            System.out.println("5️⃣ Exit");
            System.out.println("====================================");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer
            
            switch (choice) {
                case 1:
                    m.showAllStocks();
                    break;
                    
                case 2:
                    m.showAllStocks();
                    System.out.print("Enter stock symbol to buy: ");
                    String buySymbol = sc.nextLine();
                    stock toBuy = m.findStock(buySymbol);
                    if (toBuy != null) {
                        u1.buyStock(toBuy);
                    } else {
                        System.out.println("❌ Stock not found!");
                    }
                    break;
                    
                case 3:
                    u1.showPortfolio();
                    System.out.print("Enter stock symbol to sell: ");
                    String sellSymbol = sc.nextLine();
                    stock toSell = m.findStock(sellSymbol);
                    if (toSell != null) {
                        u1.sellStock(toSell);
                    } else {
                        System.out.println("❌ Stock not found in market!");
                    }
                    break;
                    
                case 4:
                    u1.showPortfolio();
                    break;
                    
                case 5:
                    System.out.println("👋 Thank you for using the Stock Trading System!");
                    break;
                    
                default:
                    System.out.println("❌ Invalid choice! Please try again.");
            }
            
        } while (choice != 5);
        
        sc.close();
    }
}
