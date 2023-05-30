package zoo;

public class Spider extends Pet {

    public Spider() {
        super(8);
    }

    @Override
    public void giveVoice() {
        System.out.println("Злой!");
    }
}