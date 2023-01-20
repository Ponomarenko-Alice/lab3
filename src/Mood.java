public enum Mood {

    NORMAL("нормальное"),
    FEAR("испуганное");


    private final String name;

    Mood(String name){
        this.name = name;
    }
    public String getTypeOfMood(){
        return name;
    }
    public void changeMood(Human human, String name){

    }





}
