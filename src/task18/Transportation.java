package task18;

public class Transportation {
    private boolean breaks;
    private int oil;
    private int fuel;

    public Transportation(){

    }

    public void start(){
        breaks = true;
        oil--;
        fuel--;
    }


}
