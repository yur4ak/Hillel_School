package task18;

public class Train extends Transportation {
    private boolean electric;

    public void inTransit(){
        if(!electric)
            start();
    }
}
