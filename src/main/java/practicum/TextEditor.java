package practicum;

public class TextEditor {

    private boolean isCapsLock = false;

    public void capsLock() {
        
    }

    public void print(String str) {
        if (isCapsLock = true) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str);
        }
    }
}
