package lesson11;

public class TalkingParrot extends Parrot {
    private int humanWords;
    public TalkingParrot(ParrotColor color, int humanWords){
        super(color);
        this.humanWords = humanWords;
    }
}
