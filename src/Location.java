import java.util.ArrayList;

public class Location {
    String name;

    public Location(String name) {
        this.name = name;
    }
    public Location(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }
    ArrayList<Product> products;

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    public void addProduct(Product product){

    }

    //public Product[] getProducts() {
        //return;
    //}
    public String getLocationName(){
        return name;
    }

}


