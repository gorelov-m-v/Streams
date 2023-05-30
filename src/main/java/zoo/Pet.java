package zoo;

public abstract class Pet {

    int pawsCount;

    Pet(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public void sleep() {
        System.out.println("Сплю");
    }

    public void play() {
        System.out.println("Играю");
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public abstract void giveVoice();
}
