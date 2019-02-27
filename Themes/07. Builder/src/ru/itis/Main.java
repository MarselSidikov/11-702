package ru.itis;

import ru.itis.old.Human;

public class Main {

    public static void main(String[] args) {
        Human marsel = Human.builder()
                .name("Марсель")
                .age(23)
                .color("Nigga")
                .isHuman(true)
                .height(1.85)
                .weight(63)
                .religion("Javist")
                .build();

        Human maksim = Human.builder()
                .age(17)
                .build();
    }
}
