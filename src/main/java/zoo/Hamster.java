package zoo;

public class Hamster extends Pet {

    public Hamster() {
        super(4);
    }

    @Override
    public void giveVoice() {
        System.out.println("Занят рот!");
    }

    public void hideFood() {
        System.out.println("Вся еда — в щёчках!");
    }
}