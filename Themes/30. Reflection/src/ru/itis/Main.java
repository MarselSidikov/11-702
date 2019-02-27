package ru.itis;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
	    User user = new User();
	    // aClass - объектная переменная
        // типа Class
        // данная объектная переменная указывает
        // на объект с информацией о классе
	    Class aClass = User.class;

//        Field field = aClass.getField("age");
//        System.out.println(field.getType() + " " + field.getName());
        Field fields[] = aClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType() + " " + field.getName());
        }

        User userObject = (User)aClass.newInstance();
        System.out.println(userObject.getName());

        Constructor<User> constructor
                = aClass.getConstructor(String.class, int.class, Boolean.class);

        User anotherUser = constructor.newInstance("Marsel", 24, true);
        System.out.println(anotherUser);

        Field ageField = aClass.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(anotherUser, 30);
        System.out.println(anotherUser);

    }
}
