package ru.itis;

public class Main {

    public static void main(String[] args) {
        Button button = new Button();
        button.setActionHandler(() -> System.out.println("Bye!"));

        button.click();
    }
}
