
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        
        stock.add(new Product(101, "Apple iPhone 3G"));
        stock.add(new Product(102, "Apple iPhone 4S"));
        stock.add(new Product(103, "Apple iPhone 5C"));
        stock.add(new Product(104, "Apple iPhone 6"));
        stock.add(new Product(105, "Apple iPhone 8"));
        stock.add(new Product(106, "Apple iPhone XR"));
        stock.add(new Product(107, "Apple iPhone 11"));
        stock.add(new Product(108, "Apple iPhone 11 Pro"));
        stock.add(new Product(109, "Apple iPhone 12"));
        stock.add(new Product(110, "Apple iPhone 13 Pro Max"));
        
        runDemo();
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101, 300);
        stock.buyProduct(102, 300);
        stock.buyProduct(103, 300);
        stock.buyProduct(104, 300);
        stock.buyProduct(105, 500);
        stock.buyProduct(106, 500);
        stock.buyProduct(107, 700);
        stock.buyProduct(108, 700);
        stock.buyProduct(109, 800);
        stock.buyProduct(110, 900);
    }

    private void sellProducts()
    {
        stock.sellProduct(101, 202);
        stock.sellProduct(102, 111);
        stock.sellProduct(103, 600);
        stock.sellProduct(104, 300);
        stock.sellProduct(105, 500);
        stock.sellProduct(106, 444);
        stock.sellProduct(107, 500);
        stock.sellProduct(108, 600);
        stock.sellProduct(109, 800);
        stock.sellProduct(110, 800);
        stock.sellProduct(111, 200);
    }    
}