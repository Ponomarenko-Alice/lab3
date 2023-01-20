public enum Flame {
    YELLOW("жёлтый"),
    RED("красный"),
    BLUE("сиинего"),
    WHITE("белый");

    private final String name;

    Flame(String name){
        this.name = name;
    }
    public String getColourOfFlame(){
        return name;
    }
}
