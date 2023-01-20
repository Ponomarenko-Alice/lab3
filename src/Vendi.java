import java.util.ArrayList;

public class Vendi extends Human implements IVendi {

    private ArrayList<Product> currentProducts;

    public Vendi(String name, Location location, Mood mood, ArrayList<Product> currentProducts) {
        super(name, location, mood);
        this.currentProducts = currentProducts;
    }
    @Override
    public  String toString(String name){
        return name;
    }
    @Override
    public void takeProduct(Product product) {
        currentProducts.add(product);
        System.out.println(toString(name) + " взяла " + product.getName());
    }


    public Product sliceCheese(){
        System.out.println("натерла сыр");
        Product sliceCheese = new Product("натертый сыр");
        return sliceCheese;
    }

    public Product getSoup(){
        Product soup = new Product("томатный суп");
        return soup;
    }

    public void pourSoup(ArrayList<Product> arrayList){
        System.out.println(toString(name) + " перелила соредржимое банки в кастрюлю");
        arrayList.add(getSoup());
    }

    public boolean productIsCurrent(ArrayList<Product> products, String name){
        for (Product product: products
        ) {
            if (product.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void turnOn(StoveKitchen s){
        System.out.println(toString(name) + " включила плиту, огонь " + s.getFlameColour());
        s.getFireStatus(true);
    }

    public void setFlame(StoveKitchen s, Flame f){
        System.out.println(toString(name) + " убавила газ до " + f.getColourOfFlame() + " пламени");
        s.setFlame(f);
    }

    public void addToSkovoroda(Product p, ArrayList<Product> arrayList){
        if (productIsCurrent(currentProducts, p.getName())) {
            arrayList.add(p);
            System.out.println("Венди положила " + p.getName() + " в сковородку");
        }
    }

    public void addToKastrula(Product p, ArrayList<Product> arrayList){

        if (productIsCurrent(currentProducts, p.getName())){
            arrayList.add(p);
            System.out.println("Венди добавила " + p.getName() + " в кастрюлю");
        }

    }

}

