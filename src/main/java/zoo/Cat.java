package zoo;

public class Cat extends Pet {

    public Cat() {
        super(4);
    }

    @Override
    public void giveVoice() {
        System.out.println("Мяу!");
    }

    public void catchMouse() {
        System.out.println("Поймала мышку!");
    }
}