import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Location atHome = new Location("в доме");
        Mood normal = Mood.NORMAL;
        ArrayList<Product> currentProducts = new ArrayList<Product>();
        Vendi vendi = new Vendi("Венди", atHome, normal, currentProducts);
        System.out.println("Венди " + vendi.getLocation());

        Product potOfSoup = new Product("банка томатного супа");
        ArrayList<Product> shelf = new ArrayList<Product>();
        shelf.add(potOfSoup);
        Location storage = new Location("кладовку", shelf);

        vendi.goTo(storage);
        vendi.takeProduct(potOfSoup);
        ArrayList<Product> basket = new ArrayList<Product>();
        Kastrula kastrula = new Kastrula(basket);
        vendi.pourSoup(kastrula.getBasket());

        ArrayList<Product> fridgeShelf = new ArrayList<Product>();
        Product milk = new Product("молоко");
        Product eggs = new Product("яйца");
        fridgeShelf.add(milk);
        fridgeShelf.add(eggs);
        Location fridge = new Location("холодильник", fridgeShelf);
        vendi.goTo(fridge);
        vendi.takeProduct(milk);
        vendi.takeProduct(eggs);

        ArrayList<Product> freezerShelf = new ArrayList<Product>();
        Product cheese = new Product("сыр");
        fridgeShelf.add(cheese);
        Location freezer = new Location("холодильную камеру", freezerShelf);
        vendi.goTo(freezer);
        vendi.takeProduct(cheese);

        ArrayList<Product> kitchenShelf = new ArrayList<Product>();
        Location kitchen = new Location("кухню", kitchenShelf);
        vendi.goTo(kitchen);

        Flame red = Flame.RED;
        Flame blue = Flame.BLUE;
        StoveKitchen stove =  new StoveKitchen(red, false);

        vendi.turnOn(stove);

        ArrayList<Product> basket1 = new ArrayList<Product>();
        Skovoroda skovoroda = new Skovoroda(basket1);
        vendi.addToSkovoroda(eggs, basket1);
        vendi.takeProduct(vendi.sliceCheese());
        //vendi.addToSkovoroda(sliceCheese, basket1); sliceCheese - такого объекта не найдено
        vendi.addToSkovoroda(cheese, basket1);

        vendi.setFlame(stove, blue);

        vendi.addToKastrula(milk, basket);
        }

    }
