abstract class Creature {
    protected String name;
    protected Location location;
    public Creature(String name, Location location){
        this.name = name;
        this.location = location;
    }
    public void goTo(Location location1){
        this.location = location1;
        System.out.println("Венди пошла в " + location1.getLocationName());
    }


    public String getName(){
        return name;
    }
    public String getLocation(){
        return location.getLocationName();
    }


}

