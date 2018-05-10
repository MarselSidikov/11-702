package ru.itis;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 03.05.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {

    @Parameter(names = "-classFolder")
    private String classFolder;

    public static void main(String[] args) {
        Main main = new Main();
        JCommander.newBuilder()
                .addObject(main)
                .build()
                .parse(args);
        try {
            main.run();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void run() throws Exception {
        // надо передавать, например
        // -classFolder "C:\Users\admin.WIN-IPM3OA3VQNQ\Desktop\Java\Classes"
        URL url = new URL("file:\\" + classFolder + "\\");
        URLClassLoader loader = URLClassLoader.newInstance(new URL[]{url}, getClass().getClassLoader());
        Files
                    .list(Paths.get(url.toURI().normalize()))
                    .forEach(file -> {
                        try {
                            Class aClass = loader.loadClass(file.getFileName().toString().split("\\.")[0]);
                            Field fields[] = aClass.getDeclaredFields();
                            Class fieldsTypes[] = new Class[fields.length];
                            for (int i = 0; i < fields.length; i++) {
                                fieldsTypes[i] = fields[i].getType();
                            }
                            Constructor constructor = aClass.getConstructor(fieldsTypes);
                            System.out.println(constructor.newInstance(24, "Marsel", true));
                        } catch (Exception e) {
                            throw new IllegalArgumentException(e);
                        }
                    });
    }
}
