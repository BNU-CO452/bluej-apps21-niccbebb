
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
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        
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
        stock.buyProduct(101, 500);
    }

    private void sellProducts()
    {
        
    }    
}