/**
 * 20.02.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.put(10);
        int i =  integerBox.get();

        Box<String> stringBox = new Box<>();
        stringBox.put("Hello!");
        // int x = stringBox.get();
    }
}
