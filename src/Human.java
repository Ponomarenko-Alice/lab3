public abstract class Human extends Creature{

    private Mood mood;

    public Human(String name, Location location, Mood mood) {
        super(name, location);
        this.mood = mood;
    }


    public String getName(){
        return name;
    }
    public String getLocation(){
        return location.name;
    }


    public abstract String toString(String name);
}
