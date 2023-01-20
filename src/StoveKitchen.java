public class StoveKitchen {
    private boolean on;
    private Flame flame;

    public StoveKitchen(Flame flame, boolean on){
        this.on = on;
        this.flame = flame;
    }

    public boolean getFireStatus(boolean b){
        if (on){
            return true;
        }
        return false;
    }
    public String getFlameColour(){
        return flame.getColourOfFlame();
    }

    public void setFlame(Flame f){
        flame = f;
    }
}

