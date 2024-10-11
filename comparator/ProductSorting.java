// Now creating a custom comparator to sort objects based on different fields in desceending order 
import java.util.*; 

class Product{
    String name; 
    double price; 
    Product(String name, double price){
        this.name=name; 
        this.price=price; 
    }
    @Override 
    public String toString(){
        return name+ ": $"+ price; 
    }
}

class PriceComparator implements Comparator<Product>{
    @Override
    public int compare(Product p1, Product p2){
        return Double.compare(p2.price, p1.price);// Sort in descending order of price 
    }
}

public class ProductSorting{
    public static void main(String[] args){
        List<Product> products=new ArrayList<>(); 
        products.add(new Product("Laptop", 1200.5)); 
        products.add(new Product("Phone", 899.99));
        products.add(new Product("Tablet", 499.5));
        // Sorting products by price in descending order 
        Collections.sort(products, new PriceComparator());
        for(Product product: products){
            System.out.println(product);
        }
    }
}